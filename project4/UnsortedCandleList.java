//Unsorted Candle List.
package project4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class UnsortedCandleList extends CandleList{ //Extends of the CandleList class
	public UnsortedCandleList() {    //Default constructor
		CandleNode cn = new CandleNode();
		first = cn;
		last = cn;
		size = 0;
	}
		public void add(File filename) { 
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filename));
			//Initialize variables
			String line = "";
			while (true) {
				line = reader.readLine();
				if (line == null) {  //If the line does not exist, 
							//stop the while loop.
					break;
				}
				StringTokenizer st = new StringTokenizer(line, ",");  //Token is ‘,’
				int height = 0;
				int width = 0;
				float price = 0;
				try {
					height = Integer.parseInt(st.nextToken());
					width = Integer.parseInt(st.nextToken());
					price = Float.parseFloat(st.nextToken());		            
					Candle c = new Candle(height, width, price); //Create Candle c
					append(c);				//A new object of candle will be located behind an added node using append method (add last)
				} catch (Exception e) {
					System.out.println(e + ": Invalid format, skipping"); //If the line does not have the number of token properly,
				}								//the line will be excepted. 
				
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String toString() {
		if(first == null) {
			return "[]";
		}
		CandleNode temp = first;
		String str = "[Unsorted CandleList]\n";
		while(temp.next != null) {
			str += temp.data +"'\n";
			temp = temp.next;
		}
		str += temp.data;
		return str+"\n";
	}
}