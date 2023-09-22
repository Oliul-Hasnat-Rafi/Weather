package com.zirwa.weather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.zirwa.weather.Model.DaysItem;
import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.weatherviewholder> {
        Context context;
        List<DaysItem> daysItemList;

    public WeatherAdapter(Context context, List<DaysItem> daysItemList) {
        this.context = context;
        this.daysItemList=daysItemList;

    }

    @NonNull
    @Override
    public weatherviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.single_row,parent,false);

        return new weatherviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.weatherviewholder holder, int position) {

        DaysItem daysItem=this.daysItemList.get(position);
        holder.date.setText(daysItem.getDatetime());
        Double current_temp = daysItem.getTemp();
        int current_temp1 = current_temp.intValue();
        holder.cur_temp.setText(current_temp1+"°C");
        holder.des.setText("Current Conditions: "+daysItem.getConditions());
        Double Max_temp = daysItem.getTempmax();
        int Max_temp1 = Max_temp.intValue();

        Double Min_temp = daysItem.getTempmin();
        int Min_temp1 = Min_temp.intValue();

        holder.max.setText(Min_temp1+"°C /" + Max_temp1+"°C");


    }


    @Override
    public int getItemCount() {
        return daysItemList.size();
    }

   // @Override
   // public void onBindViewHolder(@NonNull Weatherviewholder holder, int position) {
//        Product product = this.products.get(position);
//        holder.title.setText("Title: "+product.getTitle());
//        holder.rate.setText(String.valueOf("Rate: "+product.getRating().getRate()));
//
//        holder.category.setText("Category: "+product.getCategory());
//        holder.price.setText(String.valueOf("Price: "+product.getPrice()));
//        holder.description.setText("Description:\n" +product.getDescription());
//
//        Picasso.with(context).load(product.getImage()).into(holder.imageView);

 //   }

   public class weatherviewholder extends RecyclerView.ViewHolder{
        TextView  date,des,cur_temp,max;
        public  weatherviewholder(@NonNull View itemView) {
            super(itemView);
            date=itemView.findViewById(R.id.w_date);
            des=itemView.findViewById(R.id.des);
            cur_temp=itemView.findViewById(R.id.temp_re);
            max=itemView.findViewById(R.id.Max);




        }

   }
}
