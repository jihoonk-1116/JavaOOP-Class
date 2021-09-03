//CandleList abstract class

package project3;

public abstract class CandleList {
	protected CandleNode first;
	protected CandleNode last;
	protected int size = 0;
	public CandleList() {
		CandleNode cn = new CandleNode();
		first = cn;
		last = cn;
		size = 0;
	}
	public void append(Candle c) {   //add a new node into the last of linked list
		CandleNode n = new CandleNode(c);   //Create a new node.
		if(size == 0) { //if a new node is the first element of the list.
			last = n;   //last will be a new node
			first = n;  //first will be a new node
			size++;
			
		} 
		
			last.next = n;   // the next node of the pointed last node. 
			last = n;        // The last node will be the new node. 
			size++;		     // size  + 1 
		}
	
	public String toString() {   //Print out using toString method
		if(first == null) {
			return "[]";
		}
		CandleNode temp = first;
		String str = "[";
		while(temp.next != null) {
			str += temp.data +"'";
			temp = temp.next;
		}
		str += temp.data;
		return str +"]";
	}
}
