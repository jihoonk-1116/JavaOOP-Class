package project4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FileMenuHandler implements ActionListener {
	private JFrame jframe;
	private static CandleList cl;   //Define CandleList cl as static field since this data will be used 
									//after opening a text file until exit.
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
			setList(sl);
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(1,3));
			Container myContentPane = jframe.getContentPane();  //container to contain text area. 
			
			JTextArea left = new JTextArea();
			JTextArea medium = new JTextArea();
			JTextArea right = new JTextArea();
			
			myContentPane.add(left);
			myContentPane.add(right);
			myContentPane.add(medium);
			
			medium.append("Hi");
			medium.append("\n");
			
			left.append(ul.toString());   //Print out object using toString method
			left.append("\n");

			right.append(sl.toString());
			right.append("\n");


			panel.add(left);
			panel.add(medium);
			panel.add(right);
			
			jframe.add(panel);
		
		}
		else if (menuName.equals("Quit")) {   //If an user click quit, then...
			System.exit(0);
		}
	} //actionPerformed
	//Getter, Setter for sending Candlelist data to EditMenuHandler
	public void setList(CandleList l) {
		cl = l;
	} 
	public static CandleList getList(){
		return cl;
	} 
}