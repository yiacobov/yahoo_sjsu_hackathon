package com.service.actionservices;

import java.util.HashMap;

public interface PropertyReaderStrategy {
	public void readFile();
	public HashMap<String,String> checkStatChef();
	public void submitCommandToChef(String command);
}
