package co.com.santanderconsumer.trasnversal.exceptions;
/**
 * 
 * @author l.ruizs
 *
 */
public class SantanderException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4391708507062894060L;
	
	public SantanderException(String message) {
		super(message);
	}
	
	public SantanderException(Throwable cause) {
		super(cause);
	}
	
	public SantanderException(String message, Throwable cause) {
		super(message, cause);
	}

}
