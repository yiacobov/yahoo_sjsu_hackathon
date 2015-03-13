package yahoo;



import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class priorityQue {
	Queue<Alert> order;
    
    public priorityQue(myComparator input){
        order=new PriorityQueue<Alert>(input);
    
    }


	public void addAlert(LinkedList<Alert> c ){
		
		for(Alert a : c)
			order.add(a);
		
	}
	
	public String print1(int index){
		String  result="";
		for(int i =0; i<index-1;i++){
			Alert temp = order.remove();
			System.out.println("Severity: " + temp.getSeverity() + " Count: " + temp.getCount() + " Node: "+ temp.getNode() + " Property: " + temp.getProperty() + " First Occurrence: "+ temp.getFirstOccurrence() + " Summary: "+ temp.getSummary());	
			result+="Severity: " + temp.getSeverity() + " Count: " + temp.getCount() + " Node: "+ temp.getNode() + " Property: " + temp.getProperty() + " First Occurrence: "+ temp.getFirstOccurrence() + " Summary: "+ temp.getSummary()+"\n";
			
		}
		return result;
	}
	

}
