
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
		
		resButton = new JButton("Resistance");
                resButton.addActionListener(this);
		cPane.add(resButton);
		
		armButton = new JButton("Army");
                armButton.addActionListener(this);
		cPane.add(armButton);
						
	}//constructer ends
	

        @Override
	public void actionPerformed (ActionEvent event){
            if (event.getActionCommand() == "Resistance"){
                ResistanceGUI a = new ResistanceGUI();
                a.setVisible(true);
                this.setVisible(false);
            }
	
	}//actionPreformed ends
	
	
	
	}//Class ends

