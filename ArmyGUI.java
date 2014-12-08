//UPDARES

//Niamh Moylan
//T00158725
//Start Date - 03/12/2014
//OOP2 Project 

// ArmyGUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class ArmyGUI extends JFrame implements ActionListener {
	
	JMenu soldierMenu;
    JLabel response; //remove if nessiary 
    JButton saveButton;
    JButton battleButton;
    JButton loadButton;
    
    Offical soldier; //object of offical
    
    LinkedList <Offical> soldiers; //list of soldier 
    
    public static void main (String [] args) {
    	ArmyGUI frame = new ArmyGUI();
    	frame.setVisible(true);	
    }//main ends
    
    public ArmyGUI(){
    	
    	soldierSystem();
    	
    	setTitle("Army");
        setSize(500, 450);
        setResizable(false);
        setLocation(350, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        ImageIcon bgImage = new ImageIcon("Soviet.jpg");
        JLabel bg = new JLabel(bgImage);
        cPane.add(bg);

		loadButton = new JButton("Load");
        loadButton.addActionListener(this);
        cPane.add(loadButton);

        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        cPane.add(saveButton);

        battleButton = new JButton("Battle");
        battleButton.addActionListener(this);
        cPane.add(battleButton);

        createSoldierMenu();
    	
    	JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.gray);

        menuBar.add(soldierMenu);
    	    	
    } //constructer ends
    
    
    public void soldierSystem(){
    	soldiers = new LinkedList<Offical>();
    } //sS ends
    	
      //save 
    public void save() throws IOException {
        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("soldiers.dat"));
        os.writeObject(soldiers);
        os.close();
    }

    //load

    public void open() {
        try {
            ObjectInputStream is;
            is = new ObjectInputStream(new FileInputStream("soldiers.dat"));
            soldiers = (LinkedList<Offical>) is.readObject();
            is.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File failed to load");
            e.printStackTrace();
        }

    } //end of open	



	public void addSoldier(){
		
		Random rnd = new Random();
		
		Offical soldier = new Offical();
			soldier.setUnit(JOptionPane.showInputDialog("What is your unit soldier??"));
			soldier.setRegNo(Integer.parseInt(JOptionPane.showInputDialog("What is your regiment number soldier??"))); 
			soldier.setMorale(rnd.nextInt(10));
			soldier.setArms(rnd.nextInt(10));    //FIX
			soldier.setSupport(rnd.nextInt(10));
			soldiers.add(soldier);
	} //end add soldier
	
	public void display(){
		
		JTextArea area = new JTextArea ();
		int numSoldiers = soldiers.size();
		
		if (numSoldiers  > 0){
			
			area.setText("Current enlistments: \n\n");
			for (int i = 0; i < numSoldiers; i++){
			
				area.append(soldiers.get(i).toString());
		}
		
		showMessage(area);
		
		}
		
		else {
			showMessage("The trenches are empty");
		}
	}  //end display
	
	
	//from here
	
	
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
				addSoldier();
			}
		
 			else if (event.getActionCommand().equals("Display")){
 				display();
 			}
 		
 			else if (event.getActionCommand().equals("Save")) 
        	    try {
            	    save();
                	showMessage ("Soldier details saved");
         		} 
            	catch (IOException ex) {
            		showMessage("Not able to save the file:\n"+
      	 				"Check the console printout for clues to why ");
      	 			ex.printStackTrace();
            	}
            
           
           else if (event.getActionCommand().equals ("Load")){
      	 		open();
         		display();
      			}
            
		}//actionPreformed ends
	
	
		private void createSoldierMenu(){
		
			JMenuItem item;
		
		soldierMenu = new JMenu("New");
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
		
		}//end of soldier menu
	
	


}//class ends