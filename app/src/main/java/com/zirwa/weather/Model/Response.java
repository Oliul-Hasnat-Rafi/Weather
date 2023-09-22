package com.zirwa.weather.Model;

import java.util.List;

public class Response{
	private int queryCost;
	private List<Object> alerts;
	private String address;
	private CurrentConditions currentConditions;
	private String timezone;
	private double latitude;
	private String description;
	private List<DaysItem> days;
	private Stations stations;
	private double tzoffset;
	private double longitude;
	private String resolvedAddress;

	public int getQueryCost(){
		return queryCost;
	}

	public List<Object> getAlerts(){
		return alerts;
	}

	public String getAddress(){
		return address;
	}

	public CurrentConditions getCurrentConditions(){
		return currentConditions;
	}

	public String getTimezone(){
		return timezone;
	}

	public double getLatitude(){
		return latitude;
	}

	public String getDescription(){
		return description;
	}

	public List<DaysItem> getDays(){
		return days;
	}

	public Stations getStations(){
		return stations;
	}

	public double getTzoffset(){
		return tzoffset;
	}

	public double getLongitude(){
		return longitude;
	}

	public String getResolvedAddress(){
		return resolvedAddress;
	}
}