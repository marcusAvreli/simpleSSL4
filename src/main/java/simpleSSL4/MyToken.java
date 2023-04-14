package simpleSSL4;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MyToken extends AccessToken {
	private String geolocation;

	public MyToken() {
		
	}
	

	public MyToken(final String accessToken,final long expiresIn, final String refreshToken, 				 final Collection<String> scope,				 String geolocation) {
		super(accessToken, "Bearer", expiresIn, refreshToken, scope);
		this.geolocation = geolocation;
	}
	@JsonProperty("geolocation")
	public String getGeolocation() {
		return geolocation;
	}
}