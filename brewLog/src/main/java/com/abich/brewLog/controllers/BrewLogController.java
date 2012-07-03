package com.abich.brewLog.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.abich.brewLog.beans.BrewLog;
import com.abich.brewLog.beans.BrewLogEntry;

@ManagedBean
@RequestScoped
public class BrewLogController {
	@ManagedProperty("#{BrewLog}")
	BrewLog brewLog;

	@ManagedProperty("#{brewLogEntry}")
	BrewLogEntry brewLogEntry;

	public String create() {
		return "success";
	}

	public String addNewEntry() {
		return "success";
	}

	public String addLogEntry() {
		return "success";
	}
}
