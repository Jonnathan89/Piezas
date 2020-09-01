package co.com.santander.commons.Utils;

public enum Constants {

	ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS(EndPoints.ENDPOINT_FIND_ALL_MUEBLES_ACCESORIOS),
	ENDPOINT_CREATE_MUEBLES_ACCESORIOS (EndPoints.ENDPOINT_CREATE_MUEBLES_ACCESORIOS),
	
	//message
	ACCESO_DATOS_PIEZAS();
	
	
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
		public static final String ENDPOINT_CREATE_MUEBLES_ACCESORIOS = "/createMuebleAccesorio" ;
		
	}
	
}
