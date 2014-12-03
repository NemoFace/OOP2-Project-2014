//Niamh Moylan
//T00158725
//Start Date - 25/11/2014
//OOP2 Project 

//Opening screen for game


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class MainGUI extends JFrame implements ActionListener{

	JMenu alliedMenu;
	JMenu axisMenu;
	JMenu soldierMenu;
	JLabel response;
//	JButton saveButton;
	
	LinkedList <Resistance> rebels; //link list for rebel members

	public static void main(String [] args){
		MainGUI frame = new MainGUI();
		frame.setVisible(true);
	}//main ends
	

	public MainGUI(){
		
		rebelSystem(); //for linklist
				
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
		
		
		//Remove if nesssissary 
		response = new JLabel ("Respect. Honour. Educate.");
		response.setSize(250,50);
		cPane.add(response);
					
	}//constructer ends
	
	
	 	
		public void rebelSystem() {
			rebels = new LinkedList<Resistance>();
		}
		
		//save 
		public void save() throws IOException {
			ObjectOutputStream os; 
				os = new ObjectOutputStream (new FileOutputStream ("rebels.dat"));
				os.writeObject(rebels);
				os.close();
		}
		
		//load
		public void open(){
			try{
				ObjectInputStream is;
				is = new ObjectInputStream  (new FileInputStream ("rebels.dat"));
				rebels = (LinkedList <Resistance>) is.readObject();
				is.close();
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "File failed to load");
				e.printStackTrace();
			}
			
		} 

		
		//Referenced from Bicycle Frame4 
	public void addRebel(){
		Resistance rebel = new Resistance();
		rebel.setName(JOptionPane.showInputDialog("What is your name comarad??"));
		rebel.setGender(JOptionPane.showInputDialog("Are you Male or Female? (m/f)").charAt(0));
		rebel.setNat(JOptionPane.showInputDialog("What country do you hail from??"));
		rebels.add(rebel);
	}
	
	public void display(){
		JTextArea area = new JTextArea(); 
	//	saveButton = new JButton ("Save");
	//	area.add(saveButton);
		int numRebels = rebels.size();
		if(numRebels >0){
			area.setText("Current memebers of the Resistance:\n\n ");
			for (int i = 0; i<numRebels; i++)
				area.append (rebels.get(i).toString());  //Code edited by John (LEARN!!!!)
				  showMessage(area);
		}
		else 
			showMessage("The trenches are empty");
	}
	
	
	   public void showMessage (String s){
      	JOptionPane.showMessageDialog(null,s);
      }
      
      public void showMessage (JTextArea s){
      	JOptionPane.showMessageDialog(null,s);
      }
      
      //end reference
	
	public void actionPerformed (ActionEvent event){
		String menuName;
		menuName = event.getActionCommand();
		
		if (menuName.equals("Quit")){
			System.exit(0);
		}
		else if (event.getActionCommand().equals ("Add")){
			addRebel();
		}
		
 		else if (event.getActionCommand().equals("Display")){
 			display();
 		}	
			
		else {
			response.setText("This will open " + menuName);
		}
		
	}//actionPreformed ends
	
	
	private void createSoldierMenu(){
		
		JMenuItem item;
		
		soldierMenu = new JMenu("Army");
		axisMenu = new JMenu("Axis");
		alliedMenu = new JMenu ("Allied");
		
		
	/*	item = new JMenuItem("Russian");
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
		
		*/
		
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

