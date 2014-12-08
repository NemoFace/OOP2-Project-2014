
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

public class ResistanceGUI extends JFrame implements ActionListener {

    JMenu rebelMenu;
    JButton saveButton;
    JButton battleButton;
    JButton loadButton;
    Resistance rebel;

    LinkedList<Resistance> rebels; //link list for rebel members

    public static void main(String[] args) {
        ResistanceGUI frame = new ResistanceGUI();
        frame.setVisible(true);
    }//main ends

    public ResistanceGUI() {

        rebelSystem(); //for linklist

        setTitle("Resistance");
        setSize(500, 550);
        setResizable(false);
        setLocation(350, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        ImageIcon bgImage = new ImageIcon("AntiSoviet.jpg");
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

        createRebelMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.gray);

        menuBar.add(rebelMenu);

    }//constructer ends

    public void rebelSystem() {
        rebels = new LinkedList<Resistance>();
    }

    //save 
    public void save() throws IOException {
        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("rebels.dat"));
        for(Resistance r:rebels)
        {
        	System.out.println(r.toString());
        }
        os.writeObject(rebels);
        os.close();
    }

    //load

    public void open() {
        try {
            ObjectInputStream is;
            is = new ObjectInputStream(new FileInputStream("rebels.dat"));
            rebels = (LinkedList<Resistance>) is.readObject();
            is.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File failed to load");
            e.printStackTrace();
        }

    }

    
    //**REFERENCED FROM BICYCLE FRAME4**//
    public void addRebel() {
        Random rnd = new Random();

        rebel = new Resistance();
        rebel.setName(JOptionPane.showInputDialog("What is your name comarad??"));
        rebel.setGender(JOptionPane.showInputDialog("Are you Male or Female? (m/f)").charAt(0));
        rebel.setNat(JOptionPane.showInputDialog("What country do you hail from??"));
        rebel.setResMor(rnd.nextInt(10));
        rebel.setArms(rnd.nextInt(10));    //FIX
        rebel.setSupport(rnd.nextInt(10));
        System.out.println(rebel.toString());
        rebels.add(rebel);
    }

    public void display() {
        JTextArea area = new JTextArea();

        int numRebels = rebels.size();
        if (numRebels > 0) {
            area.setText("Current memebers of the Resistance:\n\n ");
            for (int i = 0; i < numRebels; i++) {
                area.append(rebels.get(i).toString());  //Code edited by John (LEARN!!!!)
            }
            showMessage(area);
        } 
        
        
        else {
            showMessage("The trenches are empty");
        }
    }
    
    
       public void showMessage(String s) {
        JOptionPane.showMessageDialog(this, s);
    }

    public void showMessage(JTextArea s) {
        JOptionPane.showMessageDialog(this, s);
    }
    
    //**END REFERENCE**//
    
    public void battle(){
    	JTextArea winLose = new JTextArea();
        
        int x = rebel.getMorale();
        int y = rebel.getArms();
        int z = rebel.getSupport();
        int total = (x + y + z); 
    	if (total < 15 ){
    		FailGUI f = new FailGUI();
    		f.setVisible(true);
                this.setVisible(false);
    		
    		JOptionPane.showMessageDialog(this, "Your total: " + total + "\n\nThe enemy has defeated you");
        } 
        	
        else if (total == 15)
        {
        	DrawGUI d = new DrawGUI();
    		d.setVisible(true);
                this.setVisible(false);
        	JOptionPane.showMessageDialog(this, "Your total: " + total + "\n\nPeace has been found");
        	
        }
       else
        {
        	
        	WinGUI w = new WinGUI();
    		w.setVisible(true);
                this.setVisible(false);
    		 JOptionPane.showMessageDialog(this, "Your total: " + total + "\n\nVictory!!");
        }
     
    }  
  //**REFERENCED FROM BICYCLE FRAME4**//
    public void actionPerformed(ActionEvent event) {
        String menuName;
        menuName = event.getActionCommand();

        if (menuName.equals("Quit")) {
            System.exit(0);
        } 
        else if (event.getActionCommand().equals("Add")) {
            addRebel();
        }
        else if (event.getActionCommand().equals("Display")) {
            display();
        }
        else if (event.getActionCommand().equals("Save")) 
            try {
                save();
                showMessage ("Rebel details saved");
         		} 
            catch (IOException ex) {
            	showMessage("Not able to save the file:\n"+
      	 	"Check the console printout for clues to why ");
      	 	ex.printStackTrace();
            }
            
            
       else if (event.getActionCommand() .equals ("Load")){
      	 open();
         display();
      	}
      	
      	else if (event.getActionCommand() .equals ("Battle")){
      		battle();
      	}
            
            

    }//actionPreformed ends
    
       //**END REFERENCE**//

    private void createRebelMenu() {

        JMenuItem item;

        rebelMenu = new JMenu("New");
        item = new JMenuItem("Add");
        item.setBackground(Color.yellow);
        item.addActionListener(this);
        rebelMenu.add(item);

        item = new JMenuItem("Display");
        item.setBackground(Color.yellow);
        item.addActionListener(this);
        rebelMenu.add(item);

        item = new JMenuItem("Quit");
        item.setBackground(Color.green);
        item.addActionListener(this);
        rebelMenu.add(item);

    }

}
