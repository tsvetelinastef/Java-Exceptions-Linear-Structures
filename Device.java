package lab9;

import java.util.Scanner;


public class Device {
	 protected String marka;
	 protected String model;
	 protected int price;
	
	 public Device() {
	
		this.setMarka("");
		this.setModel("");
		this.setPrice(0);
}
	public Device(String marka, String model, int price)
{
		this.setMarka(marka);
		this.setModel(model);
		this.setPrice(price);
			
}
	public String getMarka() {
		return marka;
}
	public void setMarka(String marka) {
		this.marka = marka;
}
	public String getModel() {
		return model;
}
	public void setModel(String model) {
		this.model = model;
}
	public int getPrice() {
		return price;
}
	public void setPrice(int price) {
		this.price = price;
}
	public void Input()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Marka:");
	marka=sc.next();
	System.out.println("Model:");
	model=sc.next();
	System.out.println("Price:");
	price=sc.nextInt();
}
	public void Output(Device ob)
{
	
	
	marka=ob.getMarka();
	System.out.println(marka);
	model=ob.getModel();
	System.out.println(model);
	price=ob.getPrice();
	System.out.println(price);
} 


}
