package simpleSSL4;
//https://github.com/SheekhaJ/HPALMJava/blob/b7bc76287578059a84fb444182d7454432eaada9/HPALMJava/src/main/java/com/authentication/Constants.java
public final class Constants {	
	private static String hostURL;	
	private static String baseurl;
	
	private static String clientId;
	private static String clientSecret;
	static{		
		hostURL="https://192.168.243.133:8443/iiq";
		baseurl="https://192.168.243.133:8443/iiq";
		clientId="ectAJlZCfeb1AvhGgozgj7dkYl7gDVLa";
		clientSecret="m34XrqOjqDjz9HSx";	
	}
	public static String getHostURL() {
		return hostURL;
	}
	
	public static String getClientId() {
		return clientId;
	}

	public static String getClientSecret() {
		return clientSecret;
	}
	public static String getBaseurl() {
		return baseurl;
	}

	
}