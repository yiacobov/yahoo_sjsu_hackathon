package yahoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileReader {
	
	private LinkedList<Alert> q = new LinkedList<Alert>();
	
	public FileReader(){
		
	}
	
	public FileReader(File file) throws FileNotFoundException{
		Scanner sn = new Scanner(file);
		sn.nextLine();
		while(sn.hasNext())
			q.add(new Alert(sn.nextLine()));
		sn.close();
	}
	
	public LinkedList<Alert> getAlerts(){
		return q;
	}
	public int size1(){
		return q.size();
	}
}
