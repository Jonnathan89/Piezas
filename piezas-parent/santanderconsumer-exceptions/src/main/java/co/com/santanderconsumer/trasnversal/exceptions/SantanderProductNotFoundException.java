/**
 * 
 */
package co.com.santanderconsumer.trasnversal.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/**
 * @author l.ruizs
 *
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Invalid product id")
public class SantanderProductNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1155583810475911253L;
}
