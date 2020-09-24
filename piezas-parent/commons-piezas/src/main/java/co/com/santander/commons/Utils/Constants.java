package co.com.santander.commons.Utils;

public enum Constants {

	ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS(EndPoints.ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS),
	ENDPOINT_CREATE_MUEBLES_ACCESORIOS (EndPoints.ENDPOINT_CREATE_MUEBLES_ACCESORIOS),
	ENDPOINT_CREATE_USER(EndPoints.ENDPOINT_CREATE_USER),
	ENDPOINT_GENERATE_TOKEN (EndPoints.ENDPOINT_GENERATE_TOKEN),		
	ENDPOINT_VALIDATE_USER(EndPoints.ENDPOINT_VALIDATE_USER),
	ENDPOINT_USER_TYPE(EndPoints.ENDPOINT_USER_TYPE),
	USERTYPE_TOKEN(EndPoints.USERTYPE_TOKEN),
	ENDPOINT_USER_TYPE_FEIGN(EndPoints.ENDPOINT_USER_TYPE_FEIGN),
	ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS_FEIGN(EndPoints.ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS_FEIGN),
	//message
	ACCESO_DATOS_PIEZAS(),
	SERVICE_BACK();
	
	
	private String valueString ;
    private int valueInt;
    
    Constants(){}
    
    Constants(String valueString) {
    	this.valueString = valueString;
    }
    
    Constants(int valueInt){
    	this.valueInt = valueInt;
    }

	public String getValueString() {
		return valueString;
	}

	public int getValueInt() {
		return valueInt;
	}
	
	
	public static class EndPoints {
		public static final String ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS = "/findAllMuebleAccesorio";
		public static final String ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS_FEIGN = "/muebleAccesorio-services/findAllMuebleAccesorio";
		public static final String ENDPOINT_CREATE_MUEBLES_ACCESORIOS = "/createMuebleAccesorio" ;
		public static final String ENDPOINT_CREATE_MUEBLES_ACCESORIOS_FEIGN = "/muebleAccesorio-services/createMuebleAccesorio" ;
		public static final String ENDPOINT_CREATE_USER = "/createuser";
		public static final String ENDPOINT_GENERATE_TOKEN = "/generateToken" ;		
		public static final String ENDPOINT_VALIDATE_USER = "/validateUser" ;
		public static final String ENDPOINT_USER_TYPE = "/typeuser" ;
		public static final String ENDPOINT_USER_TYPE_FEIGN = "/token-services/typeuser";
		public static final String USERTYPE_TOKEN = "token" ;
		
		
	}
	
}
