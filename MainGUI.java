//Niamh Moylan
//T00158725
//Start Date - 25/11/2014
//OOP2 Project 

//Opening screen for game


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame implements ActionListener{

	JMenu fileMenu;
	JMenu soldierMenu;
	JLabel response;

	public static void main(String [] args){
		MainGUI frame = new MainGUI();
		frame.setVisible(true);
	}//main ends
	

	public MainGUI(){

		
		setTitle("War Game");
		setSize(300, 200);
		setResizable(false);
		setLocation(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		createFileMenu();
		createSoldierMenu();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar (menuBar);
		menuBar.setBackground(Color.green);
		menuBar.add(fileMenu);
		menuBar.add(soldierMenu);
		
		
		response = new JLabel ("Opening of War Game");
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
		
		item = new JMenuItem("Add");
		item.setBackground(Color.red);
		item.addActionListener(this);
		soldierMenu.add(item); 
		
		item = new JMenuItem("Display"); 
		item.setBackground(Color.blue);
		item.addActionListener(this);
		soldierMenu.add(item); 
	}//soldier menu ends
	
	
		public void createFileMenu(){
		JMenuItem item;
			
		fileMenu = new JMenu("File");
			
		item = new JMenuItem ("History");
		item.setBackground(Color.yellow);
		item.addActionListener(this);
		fileMenu.add(item);
		
		item = new JMenuItem("Quit");
		item.setBackground(Color.green);
		item.addActionListener(this);
		fileMenu.add(item);
		
		}//file menu ends
	
	}//Class ends

