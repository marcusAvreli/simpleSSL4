package simpleSSL4.client;

import simpleSSL4.AccessToken;

public interface TokenService {
	
	String DEFAULT_URL_PATH = "token";

	/**
	 * Sends a request for an Access Token to the backend Token Service. 
	 * 
	 * @return
	 * @throws OAuth2ProtocolException
	 * @throws IOException
	 */
	<T extends AccessToken> T fetch();

	/**
	 * Sends a refresh token request to the Token Service using the supplied refreshTokenSeting.
	 *  
	 * @param refreshTokenString The refresh token supplied with the access token fetched initially 
	 * @return new, refreshed access token
	 * @throws OAuth2ProtocolException
	 * @throws IOException
	 * @throws RuntimeException if this delegate and/or the backend token service does not support refresh of tokens.    
	 */
	<T extends AccessToken> T refresh(String refreshTokenString);
	
}