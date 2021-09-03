//Sorted Linked List class

package project4;


public class SortedCandleList extends CandleList{  //Extends of the CandleList class
	public SortedCandleList() {      //Default constructor
		CandleNode cn = new CandleNode();   
		first = cn;
		last = cn;
		size = 0;
	}
	public void add(CandleList c) {    //Sorted addition
		Candle candle = new Candle();
		CandleNode node = new CandleNode();
		node = c.first;
		while(node.next != null) {
			candle = node.data; 
			selectionSort(candle);   //A new object of candle will be located in proper location
			node = node.next;        //Move to next node.
			if(node.next == null) {
				selectionSort(candle); //In case of the last, selectionSort will be operated.  
			}
		}
	}
	public void selectionSort(Candle c)   //Sorting method
	    { 
		
			 CandleNode new_node = new CandleNode(c);
	         CandleNode current; 
	  
	         if (size == 0 || first.data.getPrice() >= new_node.data.getPrice()) 
	         { 	//add the new node in front of the first node if the node is the first element or the new node is less than or equal the first node. 
	        		 new_node.next = first; 
	        		 first = new_node; 
	        		 size++;
	         } 
	         else { 
	            current = first; 
	            while (true) {  //Searching until that the current node will be the last or finding that a new node will be less than another node.  
	            	if(current.next.data == null)
	            		break;
	            	else if(current.next.data.getPrice() > new_node.data.getPrice())
	            		break;
	            	else
	                  current = current.next;  //the current node will be a next node
	            }
	            new_node.next = current.next;  //The next of new node will be assigned the next of current by the while loop logic. 
	            current.next = new_node; 	  // The new node will be located behind the current node by the while loop logic.
	            size++;
	         } 
	     } 
		
	
	public String toString() {
		if(first == null) {
			return "[]";
		}
		CandleNode temp = first;
		String str = "[Sorted CandleList]\n";
		while(temp.next != null) {
			str += temp.data +"'\n";
			temp = temp.next;
		}
		return str +"\n";
	}

}
