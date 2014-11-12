//Niamh Moylan

//Git Test



import javax.swing.*;
import java.awt.event.*;

public class ForGit extends JFrame {
	
	public ForGit (){
		super ("Bicycle Shop");
		setSize(400,200);
		setLocation (100, 200);
		
		addWindowListener(new WindowEventHandler());
	}
	
	private class WindowEventHandler extends WindowAdapter {
		public void windowClosing (WindowEvent e){
			JOptionPane.showMessageDialog(null,"Click 'OK' to exit");
	      System.exit(0);
		}	
		
	}
		
	}