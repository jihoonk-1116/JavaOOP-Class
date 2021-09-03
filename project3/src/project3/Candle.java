package project3;    //Candle class

public class Candle {
	private float price;  
	private int width;
	private int height;
	private boolean lit;
	
	public Candle() {
		this.price = 0;
		this.width = 0;
		this.height = 0;
	}
	public Candle(int height, int width, float price) {
		this.price = price;
		this.width = width;
		this.height = height;
	}
	//Getters and Setters 
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isLit() {
		return lit;
	}
	public void setLit(boolean lit) {
		this.lit = lit;
	}
	// toString method to return a object’s information.
	public String toString() {
		return height + "," + width + "," + price;
	}
}
