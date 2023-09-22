package com.zirwa.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.zirwa.weather.Model.DaysItem;
import com.zirwa.weather.Model.Response;
import com.zirwa.weather.api.ApiService;
import com.zirwa.weather.api.MyRetrofit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
public class MainActivity extends AppCompatActivity {
        TextView temp,sunrise,sunset,windspeed,status,updated_at;
        TextView temp_min,temp_max,pressure,humidity,address,about;
        RecyclerView recyclerView;
        ImageView icon_Weather;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        temp=findViewById(R.id.temp);
        sunrise=findViewById(R.id.sunrise);
        sunset=findViewById(R.id.sunset);
        windspeed=findViewById(R.id.wind);
        temp_min=findViewById(R.id.temp_min);
        temp_max=findViewById(R.id.temp_max);
        pressure=findViewById(R.id.pressure);
        humidity=findViewById(R.id.humidity);
       status=findViewById(R.id.status);
        address=findViewById(R.id.address);
        updated_at=findViewById(R.id.updated_at);
        about=findViewById(R.id.about);
        icon_Weather=findViewById(R.id.Weathericon);
        recyclerView=findViewById(R.id.recyclerView);


        ApiService apiService = MyRetrofit.getRetrofit().create(ApiService.class);

        Call<Response> responseCall = apiService.weatherResponse();

        responseCall.enqueue(new Callback<Response>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {


                if (response.code() == 200) {

                    Response weatherRespone = response.body();

                    List<DaysItem> tempcon = weatherRespone.getDays();

                    String name= weatherRespone.getAddress();
                    address.setText(name +" BD");

                    SimpleDateFormat dateFromat= new SimpleDateFormat("MM/dd/yyyy  hh:mm  aa");
                    Date today = new Date();
                    String todayStr = dateFromat.format(today);
                    updated_at.setText(todayStr);

            //        List<Weather> weatherList = main_weather.getWeatherList();

                    String updated_des = String.valueOf(tempcon.get(0).getConditions());
                    status.setText(updated_des);

                    Double currenttemp  =tempcon.get(0).getTemp();
                    int currenttemp2 = currenttemp.intValue();
                    temp.setText(currenttemp2+"°C");

                    Double temp_max1=tempcon.get(0).getTempmax();
                    int Celsius_max = temp_max1.intValue();
                    temp_max.setText("Max Temp : " + Celsius_max + "°C");

                    Double temp_min1= tempcon.get(0).getTempmin();
                    int Celsius_min = temp_min1.intValue();
                    temp_min.setText("Min Temp : " + Celsius_min + "°C");

                    String curricon = tempcon.get(0).getIcon();
                    Log.d("TAG", "onResponse: "+curricon);
                    if (curricon.equals("rain")){
                        icon_Weather.setImageDrawable(getResources().getDrawable(R.drawable.rain));
                    }

//                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm aa");
//                    Date sunrice_time =new Date(tempcon.get(0).getSunriseEpoch()/1000);
//                    sunrise.setText(simpleDateFormat.format(sunrice_time));

                    String sunrice_time = tempcon.get(0).getSunrise();
                    try {
                        final SimpleDateFormat sdf = new SimpleDateFormat("H:mm");
                        final Date dateObj = sdf.parse(sunrice_time);
                        sunrise.setText(new SimpleDateFormat("K:mm aa").format(dateObj));
                    } catch (final ParseException e) {
                        e.printStackTrace();
                    }

//                    Date sunset_time =new Date(tempcon.get(0).getSunset());
//                    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("hh:mm aa");

                    String sunset_time = tempcon.get(0).getSunset();

                    try {
                        final SimpleDateFormat sdf = new SimpleDateFormat("H:mm");
                        final Date dateObj = sdf.parse(sunset_time);
                        sunset.setText(new SimpleDateFormat("K:mm aa").format(dateObj));
                    } catch (final ParseException e) {
                        e.printStackTrace();
                    }


                    Double wind = tempcon.get(0).getWindspeed();
                    int wind2 = wind.intValue()/10;
                    windspeed.setText( wind2 + " Km/hr");


                  Double humidity1 = tempcon.get(0).getHumidity();
                  int humidity2 = humidity1.intValue();
                    humidity.setText(humidity2 + "%");


                    Double pressure1 = tempcon.get(0).getPressure();
                    int pressure2 = pressure1.intValue();
                    pressure.setText(pressure2 + "hpa");

                    double uvindex1 = tempcon.get(0).getUvindex();
                    int uvindex2 = (int) uvindex1;

                    if (uvindex1>0 && uvindex1<2){

                        about.setText("UV is Low");
                    }
                    if (uvindex1>3 && uvindex1<5){

                        about.setText("UV is Moderate");
                    }
                    if (uvindex1>6 && uvindex1<7){

                        about.setText("UV is High");
                    }
                    if (uvindex1>8 && uvindex1<10){

                        about.setText("UV is Very High");
                    }

                    List<DaysItem> daysItemList =weatherRespone.getDays();

                    WeatherAdapter weatherAdapter =new WeatherAdapter(MainActivity.this,daysItemList);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(weatherAdapter);

                }


            }


            @Override
            public void onFailure(Call<Response> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Can:t", Toast.LENGTH_SHORT).show();
            }
        });



    }
}