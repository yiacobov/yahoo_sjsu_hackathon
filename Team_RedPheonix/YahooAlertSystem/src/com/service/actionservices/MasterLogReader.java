package com.service.actionservices;

import java.io.File;

public class MasterLogReader {
	
	private static MasterLogReader masterLogReader;
	
	private MasterLogReader(){		
	}
	
	/*
	 * Singleton Instance of this class
	 */
	public static MasterLogReader getMasterLogReaderInstance(){
		if(masterLogReader == null){
			return new MasterLogReader();
		}else{
			return masterLogReader;
		}
	}
	
	/*
	 * Below Method will read the Master.log file
	 * Provided in the mail
	 * i.e. 
	 * Media.log, Search.log, Flickr.log etc
	 */
	public void startReading(File file){			
	
	}
}
