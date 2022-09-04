package lab6;

public class Televizori extends Stoki implements ElectricalAppliance {
	private String proizveditel;
	private String model;
	private int power;

	public Televizori()
	{
		super();
		this.proizveditel=" ";
		this.model=" ";
		this.power=0;
	}
	public Televizori(double cena,int nomer,String proizveditel,String model,int power) {
		this.cena=cena;
		this.nomer=nomer;
		this.setProizveditel(proizveditel);
		this.setModel(model);
		this.setPower(power);
	}
	public String getProizveditel() {
		return proizveditel;
}
	public void setProizveditel(String proizveditel) {
		this.proizveditel=proizveditel;
	
}
	public String getModel() {
		return model;	
		
	}
	public void setModel(String model) {
		this.model=model;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power=power;
	}
	
	@Override
	public double checkPromo(double cena) throws PriceException{
		cena=0.91*cena;
		return cena;
	}
	@Override
	public double Razhod() throws PowerException{
		return power*30*24;
	}
}











