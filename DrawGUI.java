
//Niamh Moylan
//T00158725
//Start Date - 07/12/2014
//OOP2 Project 

//Outcome GUIs


import javax.swing.*;
import java.awt.*;


public class DrawGUI extends JFrame  {


public static void main(String [] args){
		DrawGUI frame = new DrawGUI();
		frame.setVisible(true);
	}//main ends
	
	public DrawGUI(){
	
	
	setTitle("You have drawn!");
		setSize(600,500);
		setResizable(false);
		setLocation(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		ImageIcon bgImage = new ImageIcon("draw2.jpg");
		JLabel bg = new JLabel (bgImage);
		cPane.add(bg);
}
    
    
}