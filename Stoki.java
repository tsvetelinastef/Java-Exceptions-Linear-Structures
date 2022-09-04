package lab6;

public abstract class Stoki {
	double cena;
	int nomer;


	public Stoki()
	{
		this.cena=0.0;
		this.nomer=0;
	
	}
	public Stoki(double cena,int nomer) {
		this.cena=cena;
		this.nomer=nomer;
	}
	public double getCena() {
		return cena;
		
	}
	public void setCena(double cena) {
		this.cena=cena;
	}
	public int getNomer() {
		return nomer;
		}
	public void setNomer(int nomer) {
		this.nomer=nomer;
	}
	public abstract double checkPromo(double cena) throws PriceException;
}