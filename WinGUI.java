import javax.swing.*;
import java.awt.*;


public class WinGUI extends JFrame  {


public static void main(String [] args){
		WinGUI frame = new WinGUI();
		frame.setVisible(true);
	}//main ends
	
	public WinGUI(){
	
	
	setTitle("You have won!");
		setSize(700,550);
		setResizable(false);
		setLocation(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		ImageIcon bgImage = new ImageIcon("win.jpg");
		JLabel bg = new JLabel (bgImage);
		cPane.add(bg);
}
    
    
}