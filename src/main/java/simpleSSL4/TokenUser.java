package simpleSSL4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simpleSSL4.client.TokenChangeObserver;

public class TokenUser  implements TokenChangeObserver<AccessToken>{
	private static final Logger logger = LoggerFactory.getLogger(TokenUser.class);
	@Override
	public void tokenChanged(TemporalAccessToken<AccessToken> newToken, TemporalAccessToken<AccessToken> oldToken) {
		// TODO Auto-generated method stub
		logger.info("token_changed");
		//logger.info("token_new:"+newToken);
		//logger.info("token_old:"+oldToken);
		
	}

}
