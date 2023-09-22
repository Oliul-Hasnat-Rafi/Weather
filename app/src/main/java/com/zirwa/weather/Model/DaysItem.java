package com.zirwa.weather.Model;

import java.util.List;

public class DaysItem{
	private double uvindex;
	private String sunrise;
	private String icon;
	private List<String> preciptype;
	private int sunriseEpoch;
	private String description;
	private String source;
	private double feelslikemin;
	private double cloudcover;
	private String datetime;
	private double precip;
	private double solarradiation;
	private int datetimeEpoch;
	private double windgust;
	private double dew;
	private double humidity;
	private double precipprob;
	private double precipcover;
	private double tempmin;
	private double temp;
	private List<HoursItem> hours;
	private double feelslikemax;
	private double visibility;
	private double feelslike;
	private double severerisk;
	private double winddir;
	private double pressure;
	private double solarenergy;
	private List<String> stations;
	private double tempmax;
	private double moonphase;
	private Object snowdepth;
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

	public List<String> getPreciptype(){
		return preciptype;
	}

	public int getSunriseEpoch(){
		return sunriseEpoch;
	}

	public String getDescription(){
		return description;
	}

	public String getSource(){
		return source;
	}

	public double getFeelslikemin(){
		return feelslikemin;
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

	public double getWindgust(){
		return windgust;
	}

	public double getDew(){
		return dew;
	}

	public double getHumidity(){
		return humidity;
	}

	public double getPrecipprob(){
		return precipprob;
	}

	public double getPrecipcover(){
		return precipcover;
	}

	public double getTempmin(){
		return tempmin;
	}

	public double getTemp(){
		return temp;
	}

	public List<HoursItem> getHours(){
		return hours;
	}

	public double getFeelslikemax(){
		return feelslikemax;
	}

	public double getVisibility(){
		return visibility;
	}

	public double getFeelslike(){
		return feelslike;
	}

	public double getSevererisk(){
		return severerisk;
	}

	public double getWinddir(){
		return winddir;
	}

	public double getPressure(){
		return pressure;
	}

	public double getSolarenergy(){
		return solarenergy;
	}

	public List<String> getStations(){
		return stations;
	}

	public double getTempmax(){
		return tempmax;
	}

	public double getMoonphase(){
		return moonphase;
	}

	public Object getSnowdepth(){
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