package lab6;

public class PriceException extends Exception {
	
	private static final long serialVersionUID=1L;
	
	@Override
	public String getMessage() {
		return "Invalid price!";
	}


}
