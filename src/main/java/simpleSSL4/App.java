package simpleSSL4;

import java.io.IOException;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simpleSSL4.client.NoRetryPolicy;
import simpleSSL4.client.OAuthTokenServiceDelegate;
import simpleSSL4.client.RetryPolicy;
import simpleSSL4.oauth2.AccessTokenGrantRequest;


public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	public static void main(String... args){
		MyClient myClient = new MyClient(MyToken.class);
		AccessTokenGrantRequest grant  = new AccessTokenGrantRequest("grant_type","client_id", "secret", null);
		//auth.post("/oauth2/generateToken", request);
		OAuthTokenServiceDelegate oauth = new OAuthTokenServiceDelegate(grant,myClient,"/oauth2/generateToken");
		//AccessToken token = oauth.fetch();
		RetryPolicy policy = new NoRetryPolicy();
		AutoRenewingTokenProvider<MyToken> auto = new AutoRenewingTokenProvider<MyToken>(oauth,policy,myClient);
		TokenUser tokenUser = new TokenUser();
		auto.attach(tokenUser);
	
		try {
			auto.start();
			if(auto.isActive()) {
				logger.info("yes, is active");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
