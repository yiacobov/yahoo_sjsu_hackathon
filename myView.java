package yahoo;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class myView extends JFrame{
	public JTextArea text;
	public myView(FileReader que){// creates a Jframe with the options
		
		this.setSize(480,480);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		myController myControl= new myController(this,que);
		
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(1,4));
		this.add(panel, BorderLayout.NORTH);

        panel.add(new myJButton(myControl, "Severity"));
        panel.add(new myJButton(myControl, "Error Count"));
        panel.add(new myJButton(myControl, "First Occurence"));
        panel.add(new myJButton(myControl, "Pick File"));
        text=new JTextArea("First pick a file that holds alerts. Then choose a priority by clicking on of the first three buttons. Enjoy!");
        //this.add(text, BorderLayout.CENTER);
        
        JScrollPane scroll = new JScrollPane(text);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(scroll);
        this.setVisible(true);
    }
}
