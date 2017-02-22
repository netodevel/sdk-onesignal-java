package sdk.onesignal.java.communicators;

import sdk.onesignal.java.domain.Authentication;

public interface Communicator {

	public <T> T build(final Class<T> clazz, Authentication auth);
	
}
