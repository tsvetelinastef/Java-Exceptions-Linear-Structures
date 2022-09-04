package lab6;

public class Knigi extends Stoki{
	private String avtor;
	private String zaglavie;

	
	public Knigi() {
		super();
		this.avtor=" ";
		this.zaglavie=" ";
	}
	
	public Knigi(double cena,int nomer,String avtor,String zaglavie) {
		this.cena=cena;
		this.nomer=nomer;
		this.avtor=avtor;
		this.zaglavie=zaglavie;
	}
	
	public String getAvtor() {
		return avtor;
	}
	public void setAvtor(String avtor) {
		this.avtor=avtor;
	}
	public String getZaglavie() {
		return zaglavie;
	}
	public void setZaglavie(String zaglavie) {
		this.zaglavie=zaglavie;
	}

	@Override
	public double checkPromo(double cena) throws PriceException {
		cena=0.91*cena;
		return cena;
}
}










