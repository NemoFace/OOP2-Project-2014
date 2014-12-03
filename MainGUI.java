
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

	JButton resButton;
	JButton armButton;

	public static void main(String [] args){
		MainGUI frame = new MainGUI();
		frame.setVisible(true);
	}//main ends
	

	public MainGUI(){
		
				
		setTitle("Choose a Side");
		setSize(700, 400);
		setResizable(false);
		setLocation(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		ImageIcon bgImage = new ImageIcon("ww2.jpg");
		JLabel bg = new JLabel (bgImage);
		cPane.add(bg);
		
		resButton = new JButton("Resistance");
                resButton.addActionListener(this);
		cPane.add(resButton);
		
		armButton = new JButton("Army");
                armButton.addActionListener(this);
		cPane.add(armButton);
						
	}//constructer ends
	
	public void actionPerformed (ActionEvent event){
            if (event.getActionCommand() == "Resistance"){
                ResistanceGUI r = new ResistanceGUI();
                r.setVisible(true);
                this.setVisible(false);
            }
            
            else if (event.getActionCommand() == "Army"){
            	ArmyGUI a = new ArmyGUI();
            	a.setVisible(true);
            	this.setVisible(false);
            }
            
	
	}//actionPreformed ends
	
	
	
	}//Class ends

