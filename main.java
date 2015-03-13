package yahoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;

class main {

    public static void main(String[] args) {
        System.out.println("Alert Processing Intelligence started"); // Display the string.
        //create file reader
        FileReader fr = new FileReader();
        try {
			fr= new FileReader(new File("./src/yahoo/data.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        myComparator comp=new myComparator("severity");
        //give file reader data
        priorityQue que= new priorityQue(comp);
        que.addAlert(fr.getAlerts());
        //que.print1(500);
        //create gui
        myView view= new myView(fr);
        view.setBounds(0, 0, 900, 700);
      
    }

}
