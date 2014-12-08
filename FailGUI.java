import javax.swing.*;
import java.awt.*;


public class FailGUI extends JFrame  {


public static void main(String [] args){
		FailGUI frame = new FailGUI();
		frame.setVisible(true);
	}//main ends
	
	public FailGUI(){
	
	
	setTitle("You have been killed.");
		setSize(600,700);
		setResizable(false);
		setLocation(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		ImageIcon bgImage = new ImageIcon("fail.jpg");
		JLabel bg = new JLabel (bgImage);
		cPane.add(bg);
}
    
    
}