package project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FileMenuHandler implements ActionListener {
	private JFrame jframe;
	public FileMenuHandler (JFrame jf) {
		jframe = jf;
	}
	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Open")) {    //If an user click open, then...
			JFileChooser fc = new JFileChooser();  //file chooser
			fc.setCurrentDirectory(new java.io.File("C:"));
			fc.showOpenDialog(fc);
			File file = fc.getSelectedFile();
			
			UnsortedCandleList ul = new UnsortedCandleList(); 
			ul.add(file);  //the file will be read by add method and create unsorted list
			SortedCandleList sl = new SortedCandleList(); 
			sl.add(ul);    //sorted list will be made using unsorted list.
			
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(1,2));
			Container myContentPane = jframe.getContentPane();  //container to contain text area. 
			
			JTextArea left = new JTextArea();
			JTextArea right = new JTextArea();
			
			myContentPane.add(left);
			myContentPane.add(right);
			
			left.append(ul.toString());   //Print out object using toString method
			left.append("\n");

			right.append(sl.toString());
			right.append("\n");


			panel.add(left);
			panel.add(right);
			
			jframe.add(panel);
		
		}
		else if (menuName.equals("Quit")) {   //If an user click quit, then...
			System.exit(0);
		}
	} //actionPerformed
}