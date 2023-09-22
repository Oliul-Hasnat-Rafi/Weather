package com.zirwa.weather.Model;

import java.util.List;

public class HoursItem{
	private double uvindex;
	private String icon;
	private List<String> preciptype;
	private String source;
	private double cloudcover;
	private String datetime;
	private double precip;
	private double solarradiation;
	private int datetimeEpoch;
	private double windgust;
	private double dew;
	private double humidity;
	private double precipprob;
	private double temp;
	private double visibility;
	private double feelslike;
	private double severerisk;
	private double winddir;
	private double pressure;
	private Object solarenergy;
	private List<String> stations;
	private Object snowdepth;
	private Object snow;
	private double windspeed;
	private String conditions;

	public double getUvindex(){
		return uvindex;
	}

	public String getIcon(){
		return icon;
	}

	public List<String> getPreciptype(){
		return preciptype;
	}

	public String getSource(){
		return source;
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

	public double getTemp(){
		return temp;
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

	public Object getSolarenergy(){
		return solarenergy;
	}

	public List<String> getStations(){
		return stations;
	}

	public Object getSnowdepth(){
		return snowdepth;
	}

	public Object getSnow(){
		return snow;
	}

	public double getWindspeed(){
		return windspeed;
	}

	public String getConditions(){
		return conditions;
	}
}