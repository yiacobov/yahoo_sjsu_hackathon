package com.service.actionservices;

import java.util.HashMap;

import org.springframework.core.task.TaskExecutor;

public class FlickrReader implements PropertyReaderStrategy{

	private TaskExecutor taskExecutor;
	 
	public FlickrReader(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	@Override
	public void readFile() {
		
	}

	/*
	 * Communication to Chef system to take the update about
	 * executing current healing task
	 */
	@Override
	public HashMap<String, String> checkStatChef() {
		return null;
	}
	
	/*
	 * Asynchronous command to Chef system with action
	 */
	public void submitCommandToChef(String command) {
    	taskExecutor.execute(new CommandChef(command));
    }
	
	public class CommandChef implements Runnable{
		String command;
	
		public CommandChef(String command){
			this.command = command;
		}
		@Override
		public void run() {
			//Communicate with Chef
		}
		
	}

}
