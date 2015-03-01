package test2;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class test2 {
	public static Multimap<String,String> yahooData = ArrayListMultimap.create();//This can take multiple value for a key

	public static void main(String[] args) {
		
		//Periodically Run this Program(Say on every hour)
		//This program parses the log file and Stores the Node(This will be the Key) and the Summary(Value) in an Hashmap
		//Find the Summary and solve the problem on the particular Node in the following order:
		//1.Hardware Error 2. Capacity Exceeded 3. Capacity Exceeded 4. Severe Site Error 5. Site Down 6. Software Error 7. Down to Ping
		//If Hardware Error is present for that particular Node then we need not resolve other errors.
		
		try {
			FileInputStream file = new FileInputStream(new File("test2.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheet("test");

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			String key ="", value ="";
			while (rowIterator.hasNext()) {
				Row row = (Row) rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				
				int colCount = 0;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					// Check the cell type and format accordingly
					if(colCount ==2) {
						
						key = cell.getStringCellValue();
					}
					else if(colCount ==7){
						
						value = cell.getStringCellValue();
						yahooData.put(key, value);
						
						}
					colCount++;
				}
				
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Iterate the yahooData for each of the Node and find the Highest
		// Summary(1.Hardware Error 2. Capacity Exceeded 3. Capacity Exceeded 4.
		// Severe Site Error 5. Site Down 6. Software Error 7. Down to Ping)
		for (Object keys : yahooData.keys()) {
			//Collection<Object> val = yahooData.get((String) keys);
			  //findError(keys);

		}
	}
	
	/**
	 * This method find the Highest Summary for the Node which is o be resolved
	 * @param keys
	 */
	private static void findError(Object keys) {

		
	}
	
}
