//Niamh Moylan
//T00158725
//Start Date - 03/12/2014
//OOP2 Project 

// ResistanceGUI


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class ResistanceGUI  extends JFrame implements ActionListener{ 

	JMenu soldierMenu;
	JLabel response; //remove if nessiary 
	JButton saveButton;
	JButton battleButton;


	LinkedList <Resistance> rebels; //link list for rebel members

	public static void main(String [] args){
	ResistanceGUI frame = new ResistanceGUI();
		frame.setVisible(true);
	}//main ends
	
    public ResistanceGUI() {
    	
    //	rebelSystem(); //for linklist
				
		setTitle("Resistance");
		setSize(700, 600);
		setResizable(false);
		setLocation(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		ImageIcon bgImage = new ImageIcon("AntiSoviet.jpg");
		JLabel bg = new JLabel (bgImage);
		cPane.add(bg);
		
		saveButton = new JButton("Save");
		cPane.add(saveButton);
		
		battleButton = new JButton("Battle");
		cPane.add(battleButton);
		
		
		createSoldierMenu();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar (menuBar);
		menuBar.setBackground(Color.gray);
		
		menuBar.add(soldierMenu);
	
	
    }//constructer ends
    
    	 	
	//	public void rebelSystem() {
	//		rebels = new LinkedList<Resistance>();
	//	}
		
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
		
		}
    
}