package project3;   

import javax.swing.*;
import java.awt.*;



public class CandleGUI extends JFrame{  
	JMenuBar menuBar;
	public CandleGUI(String title, int height, int width) {
		setTitle(title);
		setSize(height,width);
		setLocation  (400,200);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,2));
		menuBar  = new JMenuBar();
		createFileMenu();
		setJMenuBar(menuBar);  //Set Menu bar into 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}		//Constructor
	private void createFileMenu( ) {
		JMenuItem   item;

		JMenu fileMenu = new JMenu("File");  
		FileMenuHandler fmh  = new FileMenuHandler(this);

		item = new JMenuItem("Open");    //Add 'open' into item class
		item.addActionListener( fmh );
		fileMenu.add( item );			//Add 'open' item into the file menu

		fileMenu.addSeparator();           //add a horizontal separator line

		item = new JMenuItem("Quit");       //Add 'Quit' into item class
		item.addActionListener( fmh );		//add Actionlistener 
		fileMenu.add( item );				//Add 'quit' item into the file menu


		menuBar.add(fileMenu);

	} 
}
