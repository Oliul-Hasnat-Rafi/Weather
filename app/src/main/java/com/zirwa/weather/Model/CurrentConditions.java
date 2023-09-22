package com.zirwa.weather.Model;

import java.util.List;

public class CurrentConditions{
	private double uvindex;
	private String sunrise;
	private String icon;
	private Object preciptype;
	private int sunriseEpoch;
	private double cloudcover;
	private String datetime;
	private double precip;
	private double solarradiation;
	private int datetimeEpoch;
	private Object windgust;
	private double dew;
	private double humidity;
	private Object precipprob;
	private double temp;
	private double visibility;
	private double feelslike;
	private double winddir;
	private double pressure;
	private Object solarenergy;
	private List<String> stations;
	private double moonphase;
	private double snowdepth;
	private double snow;
	private String sunset;
	private int sunsetEpoch;
	private double windspeed;
	private String conditions;

	public double getUvindex(){
		return uvindex;
	}

	public String getSunrise(){
		return sunrise;
	}

	public String getIcon(){
		return icon;
	}

	public Object getPreciptype(){
		return preciptype;
	}

	public int getSunriseEpoch(){
		return sunriseEpoch;
	}

	public double getCloudcover(){
		return cloudcover;
	}

	public String getDatetime(){
		return datetime;
	}

	public double getPrecip(){
		return precip;
	}

	public double getSolarradiation(){
		return solarradiation;
	}

	public int getDatetimeEpoch(){
		return datetimeEpoch;
	}

	public Object getWindgust(){
		return windgust;
	}

	public double getDew(){
		return dew;
	}

	public double getHumidity(){
		return humidity;
	}

	public Object getPrecipprob(){
		return precipprob;
	}

	public double getTemp(){
		return temp;
	}

	public double getVisibility(){
		return visibility;
	}

	public double getFeelslike(){
		return feelslike;
	}

	public double getWinddir(){
		return winddir;
	}

	public double getPressure(){
		return pressure;
	}

	public Object getSolarenergy(){
		return solarenergy;
	}

	public List<String> getStations(){
		return stations;
	}

	public double getMoonphase(){
		return moonphase;
	}

	public double getSnowdepth(){
		return snowdepth;
	}

	public double getSnow(){
		return snow;
	}

	public String getSunset(){
		return sunset;
	}

	public int getSunsetEpoch(){
		return sunsetEpoch;
	}

	public double getWindspeed(){
		return windspeed;
	}

	public String getConditions(){
		return conditions;
	}
}