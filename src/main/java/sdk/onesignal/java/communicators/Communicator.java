package sdk.onesignal.java.communicators;

/**
 * @author NetoDevel
 */
public interface Communicator {

	public <T> T build(final Class<T> clazz);
	
}
