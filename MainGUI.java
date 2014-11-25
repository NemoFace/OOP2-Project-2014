//Niamh Moylan
//T00158725
//Start Date - 25/11/2014
//OOP2 Project 

//Opening screen for game


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame {// implements ActionListener 

	
	JMenu fileMenu;
	JMenu soldierMenu;


	
	public static void main(String [] args){
		
		MainGUI frame = new MainGUI();
		frame.setVisible(true);
	}
	
	
	
	//constructor
	public MainGUI(){

		
		setTitle("War Game");
		setSize(300, 200);
		setResizable(false);
		setLocation(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		createSoldierMenu();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar (menuBar);
		menuBar.setBackground(Color.green);
		menuBar.add(fileMenu);
		menuBar.add(soldierMenu);
		
		
	}
	
	
	private void createSoldierMenu(){
		
		JMenuItem item;
		
		fileMenu = new JMenu("File");
		soldierMenu = new JMenu("Book");
		
		item = new JMenuItem("Quit");
		item.setBackground(Color.green);
		item.addActionListener(this);
		fileMenu.add(item);
		
		item = new JMenuItem("Add");
		item.setBackground(Color.red);
		item.addActionListener(this);
		soldierMenu.add(item); 
		
		item = new JMenuItem("Display"); 
		item.setBackground(Color.blue);
		item.addActionListener(this);
		soldierMenu.add(item); 
	
	}
}