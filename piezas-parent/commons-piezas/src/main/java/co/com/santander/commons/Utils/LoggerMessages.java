/**
 * 
 */
package co.com.santander.commons.Utils;

import org.json.JSONObject;
import org.slf4j.Logger;

import co.com.santander.commons.dto.RequestHeaderDTO;


/**
 * @author j.ladinoh
 *
 */
public class LoggerMessages {
	
	static Logger log;

	
	/**
	 * Messages for trace calling service
	 */
	private static final String SUCCESS = " service consumed successfully, response: ";
	public static final String ERROR_UNCONTROLLED = " uncontrolled error consuming service: ";
	
	private static final String CALLING_CLIENT_FROM = " calling client from ";
	private static final String NOT_INFORMATION_OBJECT = "not information from calling";
	
	/**
	 * Other messages of log
	 */
	public static final String LOADED_KEYSTORE  = "Loaded keystore: ";
	public static final String LOADED_TRUSTSTORE = "Loaded trustStore: ";
	
	/**
	 * Log creation when consumption start
	 * 
	 * @param cliente
	 * @param request
	 * @param jsonBody
	 * @param endpoint
	 */
	
	
	/**
	 * Log creation when consumption start
	 * 
	 * @param cliente
	 * @param request
	 * @param jsonBody
	 * @param endpoint
	 */
	public static void generateInitialLog(String client, RequestHeaderDTO request, String jsonBody, String endpoint) {
		// Log of request header
		log.info(client.toLowerCase() + getCallingInformationObject(request, endpoint, true));
		// Log of request body
		log.info(client.toLowerCase() + getCallingInformationObject(jsonBody == null ? String.valueOf("") : jsonBody, endpoint, false));
	}
	
	/**
	 * Log simple creation when consumption start
	 * 
	 * @param cliente
	 * @param fromCalling
	 */
	public static void generateInitialLogSimple(String client, String fromCalling) {
		log.info(client.toLowerCase().concat(CALLING_CLIENT_FROM.concat(fromCalling.concat("."))));
	}
	
	/**
	 * Log creation when consumption ends
	 * 
	 * @param client
	 * @param isError
	 * @param message
	 * @param request
	 */
	public static void generateFinalLog(String client, boolean isError, String message, RequestHeaderDTO request) {
		if(!isError)
			log.info(client.toLowerCase() + matchRequestWithResponse(request) + message);
		else
			log.error(client.toLowerCase() + ERROR_UNCONTROLLED + message);
	}
	
	/**
	 * Log simple creation when consumption ends
	 * 
	 * @param client
	 * @param isError
	 * @param message
	 */
	public static void generatFinalLogSimple(String client, boolean isError, String message) {
		if(!isError)
			log.info(client.toLowerCase().concat(". ") + message);
		else
			log.error(client.toLowerCase() + ERROR_UNCONTROLLED + message);
	}
	
	// Private methods
	
	/**
	 * Creation message of response log
	 * 
	 * @param request
	 * @return
	 */
	private static String matchRequestWithResponse(RequestHeaderDTO request) {
		if(request != null)
			return SUCCESS.concat("{\"tipoIdentificacion\":\"" + request.getTipoIdentificacion() + "\"\"identificacion\":\"" + request.getIdentificacion()).concat("\"}. ");
		return NOT_INFORMATION_OBJECT;
	}

	/**
	 * Creation message of request log
	 * 
	 * @param request
	 * @param fromCalling
	 * @param isHeader
	 * @return
	 */
	private static String getCallingInformationObject(Object request, String fromCalling, boolean isHeader) {
		String information = (isHeader ? CALLING_CLIENT_FROM.concat(fromCalling.concat(".")) : "").concat(isHeader ? " Auditory: " : " Request: ");
		if(request != null) {
			if(isHeader)
				information += new JSONObject(request).toString();
			else
				information += request.toString();
		} else
			information += NOT_INFORMATION_OBJECT;
		return information;
	}
	
	
}
