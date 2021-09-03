package project4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditMenuHandler implements ActionListener{
	JFrame jframe;
	public EditMenuHandler(JFrame jf) {
		jframe = jf;
	} //constructor
	public void actionPerformed(ActionEvent e) {
		String menuName = e.getActionCommand();
		if(menuName.equals("Search")) {
			CandleList list = new SortedCandleList();
			list = FileMenuHandler.getList();  //list can be defined by a get method because using static field variale.
			float price=0;
			price = Float.parseFloat(JOptionPane.showInputDialog("Input candle price to search")); //read price value to sort from an user
			createText(list,price); 
		} 
	} //actionPerformed
	public void createText(CandleList cl, float price) { //Add new text area with new container as making a new panel, and print sorted result.
		JPanel panel = new JPanel();
		Container content = jframe.getContentPane();   
		JTextArea text = new JTextArea();
		panel.setLayout(new GridLayout(1,1));
		content.add(text);	//add text to container
		text.append(cl.toStringForSearch(price));  //print sorting result out using toStringForSearch at CandleList class
		panel.add(text); 
		jframe.add(panel);
	} //createText
}//EditMenuHandler

