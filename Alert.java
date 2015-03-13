package yahoo;

import java.util.Scanner;

/**
 *
 * @author Ying Yau
 */
public class Alert {
    int severity, count;
    String node, property, firstOccurrence, summary, stringData;
    public Alert(String data) {
        Scanner s = new Scanner(data).useDelimiter("\\|"); 
        severity = s.nextInt();
        count = s.nextInt();
        node = s.next();
        property = s.next();
        firstOccurrence = s.next();
        summary = s.next();
        s.close();
    }
    public String getNode(){
        return node;
    }
    public String getProperty(){
        return property;
    }
    public String getFirstOccurrence(){
        return firstOccurrence;
    }
    public String getSummary(){
        return summary;
    }
    public int getSeverity(){
        return severity;
    }
    public int getCount(){
        return count;
    }
}
