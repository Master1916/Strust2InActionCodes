package com.litsoft.test;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class Home extends ActionSupport {
	
	
	
	public String language;
	
	
	
	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}

	static public final Map locales = new HashMap();
	
	static {
		
		locales.put("en_US", "English");
		locales.put("zh_CN", "China");
	}
	
	public Map getLocales (){
		return locales;
	}
	

	@Override
	public String execute() throws Exception {
		 
		return SUCCESS;
	}

}
