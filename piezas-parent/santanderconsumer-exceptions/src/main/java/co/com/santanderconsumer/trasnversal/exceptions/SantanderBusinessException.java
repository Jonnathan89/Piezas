/**
 * 
 */
package co.com.santanderconsumer.trasnversal.exceptions;

import org.springframework.http.HttpStatus;

/**
 * @author l.ruizs
 *
 */
public class SantanderBusinessException extends RuntimeException {

	/**
	 * Version Id
	 */
	private static final long serialVersionUID = 7953146244100871041L;

	/**
	 * codigo de error
	 */
	private HttpStatus status;
	
	/**
	 * 
	 * @param allTrackable
	 * @return
	 */
	public static SantanderBusinessException transformToException(Throwable allTrackable) {
		if(allTrackable.getCause() == null) {
			SantanderBusinessException es = new SantanderBusinessException(allTrackable.getMessage());
			return es;
		} else {
			if (allTrackable.getCause().getCause() == null) {
				SantanderBusinessException es = new SantanderBusinessException(allTrackable.getMessage());
				es.setStatus(es.getStatus());
				StackTraceElement[] elements = allTrackable.getStackTrace();
				es.setStackTrace(new StackTraceElement[] { elements[0], elements[1] });
				return es;	
			} else 
				return (SantanderBusinessException) transformToException(allTrackable.getCause());
		}
	}

	/**
	 * Transform SantanderException to SantanderBusinessException
	 * 
	 * @param allTrackable
	 * @return
	 */
	public static SantanderBusinessException transformToException(SantanderException allTrackable) {
		SantanderBusinessException es = new SantanderBusinessException(allTrackable.getMessage());
		es.setStatus(es.getStatus());
		StackTraceElement[] elements = allTrackable.getStackTrace();
		es.setStackTrace(new StackTraceElement[] { elements[0], elements[1] });
		return es;
	}

	/**
	 * Constructor indicando estado de la excepcion
	 * 
	 * @param status
	 */
	public SantanderBusinessException(HttpStatus status) {
		this.setStatus(status);
	}

	/**
	 * Nueva excepcion asociada a servicios indicando el mensaje
	 * 
	 * @param message
	 */
	public SantanderBusinessException(String message) {
		super(message);
	}

	/**
	 * Constructor indicando estado y mensaje de excepcion
	 * 
	 * @param status
	 * @param message
	 */
	public SantanderBusinessException(HttpStatus status, String message) {
		super(message);
		this.setStatus(status);
	}

	/**
	 * Constructor indicando estado, mensaje y causa de la excepcion
	 * 
	 * @param status
	 * @param message
	 * @param thrwbl
	 */
	public SantanderBusinessException(HttpStatus status, String message, Throwable thrwbl) {
		super(message, thrwbl);
		this.setStatus(status);
	}

	/**
	 * Constructor indicando estado y causa de la excepcion
	 * 
	 * @param status
	 * @param thrwbl
	 */
	public SantanderBusinessException(HttpStatus status, Throwable thrwbl) {
		super(thrwbl);
		this.setStatus(status);
	}

	/**
	 * Constructor indica mensaje y causa de la excepcion
	 * 
	 * @param message
	 * @param thrwbl
	 */
	public SantanderBusinessException(String message, Throwable thrwbl) {
		super(message, thrwbl);
	}

	/**
	 * Constructo indicando estado, mensaje y causa indicando: enableSuppression y
	 * writableStackTrace
	 * 
	 * @param status  codigo de estado
	 * @param message mensaje
	 * @param thrwbl  cuasa
	 * @param bln     enableSuppression
	 * @param bln1    writableStackTrace
	 */
	public SantanderBusinessException(HttpStatus status, String message, Throwable thrwbl, boolean bln, boolean bln1) {
		super(message, thrwbl, bln, bln1);
		this.setStatus(status);
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
