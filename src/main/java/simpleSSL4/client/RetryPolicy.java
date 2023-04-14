package simpleSSL4.client;

public interface RetryPolicy {
	long periodBetweenRetries();

	long maxRetries();

	boolean onException(Throwable t);
}