package com.abich.brewLog.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "BrewLog")
@RequestScoped
public class BrewLog {
	private String name;
	private List<BrewLogEntry> logEntries = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BrewLogEntry> getLogEntries() {
		return logEntries;
	}

	public void setLogEntries(List<BrewLogEntry> logEntries) {
		this.logEntries = logEntries;
	}

}
