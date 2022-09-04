package lab6;

public class Test {

	public static void main(String[] args) {
		
		Knigi k1=new Knigi(150,1,"Viktor Mart","Life it self");
		Televizori t1=new Televizori(750,2,"LG","4k",1000);
		
		try 
		{
			k1.checkPromo(k1.cena);
			t1.checkPromo(t1.cena);
		}
		catch(PriceException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			t1.Razhod();
		}
		catch(PowerException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
