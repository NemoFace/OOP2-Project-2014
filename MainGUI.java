//Niamh Moylan
//T00158725
//Start Date - 25/11/2014
//OOP2 Project 

//Opening screen for game


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MainGUI extends JFrame implements ActionListener{

	JMenu alliedMenu;
	JMenu axisMenu;
	JMenu soldierMenu;
	JLabel response;

	public static void main(String [] args){
		MainGUI frame = new MainGUI();
		frame.setVisible(true);
	}//main ends
	

	public MainGUI(){

		
		setTitle("War Game");
		setSize(700, 400);
		setResizable(false);
		setLocation(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		ImageIcon bgImage = new ImageIcon("ww2.jpg");
		JLabel bg = new JLabel (bgImage);
		cPane.add(bg);
		
		createSoldierMenu();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar (menuBar);
		menuBar.setBackground(Color.gray);
		
		menuBar.add(soldierMenu);
		menuBar.add(axisMenu);
		menuBar.add(alliedMenu);
		
		
		response = new JLabel ("Respect. Honour. Educate.");
		response.setSize(250,50);
		cPane.add(response);
		
	}//constructer ends
	
	public void actionPerformed (ActionEvent event){
		String menuName;
		menuName = event.getActionCommand();
		
		if (menuName.equals("Quit")){
			System.exit(0);
		}
		else{
			response.setText("This will open " + menuName);
		}
		
	}//actionPreformed ends
	
	
	private void createSoldierMenu(){
		
		JMenuItem item;
		
		soldierMenu = new JMenu("Army");
		axisMenu = new JMenu("Axis");
		alliedMenu = new JMenu ("Allied");
		
		
		item = new JMenuItem("Russian");
		item.setBackground(Color.green);
		item.addActionListener(this);
		alliedMenu.add(item); 
		
		item = new JMenuItem("French"); 
		item.setBackground(Color.green);
		item.addActionListener(this);
		alliedMenu.add(item); 
			
		item = new JMenuItem("British"); 
		item.setBackground(Color.green);
		item.addActionListener(this);
		alliedMenu.add(item);
			
		item = new JMenuItem("German"); 
		item.setBackground(Color.green);
		item.addActionListener(this);
		axisMenu.add(item);
		
		item = new JMenuItem("Itatian"); 
		item.setBackground(Color.green);
		item.addActionListener(this);
		axisMenu.add(item);
		
		item = new JMenuItem("Japanese"); 
		item.setBackground(Color.green);
		item.addActionListener(this);
		axisMenu.add(item);
		
		item = new JMenuItem ("Add");
		item.setBackground(Color.yellow);
		item.addActionListener(this);
		soldierMenu.add(item);
		
		item = new JMenuItem ("Display");
		item.setBackground(Color.yellow);
		item.addActionListener(this);
		soldierMenu.add(item);
		
		item = new JMenuItem("Quit");
		item.setBackground(Color.green);
		item.addActionListener(this);
		soldierMenu.add(item);
		
		}//file menu ends
	
	}//Class ends

