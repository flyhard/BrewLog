package com.abich.brewLog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abich.brewLog.beans.BrewLogModel;
import com.abich.brewLog.orm.BrewLog;
import com.abich.brewLog.orm.BrewLogEntryDAO;

@Controller
public class BrewLogController {

	@Autowired
	private BrewLogEntryDAO entryDAO;
	private BrewLogModel model;

	public String create() {
		BrewLog brewLog = new BrewLog();
		brewLog.setName(model.getName());
		entryDAO.addLog(brewLog);
		return "success";
	}

	public String addNewEntry() {
		return "success";
	}

	public String addLogEntry() {
		return "success";
	}

	public BrewLogModel getModel() {
		return model;
	}

	public void setModel(BrewLogModel model) {
		this.model = model;
	}
}
