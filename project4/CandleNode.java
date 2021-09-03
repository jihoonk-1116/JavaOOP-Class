//CandleNode class
//Initialize a node using this class.

package project4;

public class CandleNode {
	protected Candle data;
	protected CandleNode next;
	public CandleNode() {    //no argument constructor.
		this.data = null;
		this.next = null;
		
	}
	public CandleNode(Candle c) {
		this.data = c;
		this.next = null;
	}
	
	public CandleNode(Candle c, CandleNode next) {
		this.data = c;
		this.next = next;
	}
	public String toString() {
		return String.valueOf(this.next.data);
	}
}
