package sdk.onesignal.java.communicators;

import sdk.onesignal.java.domain.Authentication;

/**
 * @author NetoDevel
 */
public interface Communicator {

	public <T> T build(final Class<T> clazz, final Authentication auth);
	
}
