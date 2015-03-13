package yahoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Queue;

import javax.swing.JFileChooser;


public class myController implements ActionListener{

    private myView view;
    private FileReader data;
    final JFileChooser fc = new JFileChooser();
  //  int returnVal = fc.showOpenDialog();
    
    public myController(myView aview, FileReader data1){
        this.view= aview;
        data = data1;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Severity")){
        	priorityQue que =new priorityQue(new myComparator("severity"));
        	que.addAlert(data.getAlerts());
        	view.text.setText(que.print1(data.size1()));
        }
        else if(e.getActionCommand().equals("Error Count")){
        	priorityQue que =new priorityQue(new myComparator("count"));
        	que.addAlert(data.getAlerts());
        	view.text.setText(que.print1(data.size1()));
        }
        else if(e.getActionCommand().equals("First Occurrence")){
        	priorityQue que =new priorityQue(new myComparator("firstOccurence"));
        	que.addAlert(data.getAlerts());
        	view.text.setText(que.print1(data.size1()));
        }
        else if(e.getActionCommand().equals("Pick File")){
        	int returnVal = fc.showOpenDialog(view);
        	if(returnVal == JFileChooser.APPROVE_OPTION)
				try {
					data = new FileReader(fc.getSelectedFile());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	
        }
    }

    


}
