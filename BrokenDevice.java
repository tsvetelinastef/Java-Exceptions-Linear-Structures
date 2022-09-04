package lab9;

public class BrokenDevice extends Device {
	private String simpthoms;
	private int time;
	
	
	public BrokenDevice() {
		super();
		this.setSimpthoms("");
		this.setTime(0);
		
	}
	public BrokenDevice(String marka, String model, int  price, String simpthoms, int time)
	{
		this.marka=marka;
		this.model=model;
		this.price=price;
		this.setSimpthoms(simpthoms);
		this.setTime(time);
	}
	public String getSimpthoms() {
		return simpthoms;
	}
	public void setSimpthoms(String simpthoms) {
		this.simpthoms = simpthoms;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
}
