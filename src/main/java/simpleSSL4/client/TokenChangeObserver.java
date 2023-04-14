package simpleSSL4.client;

import simpleSSL4.AccessToken;
import simpleSSL4.TemporalAccessToken;

@FunctionalInterface
public interface TokenChangeObserver<T extends AccessToken> {

	/**
	 * Fired by {@link TokenChangeObservable} when a token value has changed,
	 * either because it was fetched for the first time, or because it was
	 * refreshed.
	 * 
	 * @param newToken
	 * @param oldToken
	 */
	public void tokenChanged(TemporalAccessToken<T> newToken, TemporalAccessToken<T> oldToken);

}