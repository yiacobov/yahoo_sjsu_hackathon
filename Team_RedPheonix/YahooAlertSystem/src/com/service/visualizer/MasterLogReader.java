package com.service.visualizer;

import java.io.File;

public class MasterLogReader {
	
	private static MasterLogReader masterLogReader;
	
	private MasterLogReader(){		
	}
	
	public static MasterLogReader getMasterLogReaderInstance(){
		if(masterLogReader == null){
			return new MasterLogReader();
		}else{
			return masterLogReader;
		}
	}
	
	/*
	 * Below Method will read the output file and dump it into database
	 */
	public void startReading(File file){			
		
	}

}
