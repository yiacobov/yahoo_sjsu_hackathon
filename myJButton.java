package yahoo;


import javax.swing.JButton;

public class myJButton extends JButton{// creates a Jbutton with the already attached controller
	
	public myJButton(myController control,String text) {
		// TODO Auto-generated constructor stub
		super();
		this.setText(text);
		this.setActionCommand(this.getText());
		this.addActionListener(control);
	}

}
