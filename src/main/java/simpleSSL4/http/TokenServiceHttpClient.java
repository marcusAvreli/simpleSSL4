package simpleSSL4.http;

import simpleSSL4.AccessToken;
import simpleSSL4.oauth2.AccessTokenGrantRequest;

public interface TokenServiceHttpClient {


	/**
	 * 
	 * @param path
	 *            The URL path to an OAuth token service. The default value is
	 *            "token" (for reference - {@link #DEFAULT_PATH}). Different
	 *            implementations may support either or both relative and
	 *            absolute paths.
	 * @param payload
	 *            An OAuth grant request for access or refresh token.
	 * @param <T>
	 *            Type of the returned token, extending {@link net.oauth2.Token}
	 * @return A valid Token that can be used by the client application for
	 *         requests to a Resource Server protected by the Authorization
	 *         Server that issued this Token.
	 * @throws IOException
	 *             thrown in case of networking or other HTTP errors
	 * @throws OAuth2ProtocolException
	 *             thrown in case of OAuth protocol errors.
	 */
	<T extends AccessToken> T post(String path, AccessTokenGrantRequest payload);

}