package simpleSSL4.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simpleSSL4.AccessToken;
import simpleSSL4.App;
import simpleSSL4.MyToken;
import simpleSSL4.http.TokenServiceHttpClient;
import simpleSSL4.oauth2.AccessTokenGrantRequest;

public class OAuthTokenServiceDelegate implements TokenService{
	private static final Logger logger = LoggerFactory.getLogger(OAuthTokenServiceDelegate.class);
	private AccessTokenGrantRequest grant;
	private TokenServiceHttpClient client;
	//private RefreshTokenGrantRequest refreshTokenGrantRequest;
	private String pathToTokenEndpoint;
	public OAuthTokenServiceDelegate(final AccessTokenGrantRequest grant,TokenServiceHttpClient client,  String pathToTokenEndpoint) {
		this.grant = grant;
		this.client = client;
		
		this.pathToTokenEndpoint = pathToTokenEndpoint;
	}
	@Override
	public <T extends AccessToken> T fetch() {
		// TODO Auto-generated method stub
		logger.info("fetch_called");
		T token = client.post(pathToTokenEndpoint, grant);
		return token;
	}

	@Override
	public <T extends AccessToken> T refresh(String refreshTokenString) {
		logger.info("refresh_called");
		T token = client.post(pathToTokenEndpoint, grant);
		return  token;
	}

}
