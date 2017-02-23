package sdk.onesignal.java;

import sdk.onesignal.java.clients.NotificationClient;
import sdk.onesignal.java.communicators.Communicator;
import sdk.onesignal.java.communicators.NotificationCommunicator;
import sdk.onesignal.java.domain.Authentication;

/**
 * @author NetoDevel
 */
public class OneSignal {
	
	private final Authentication auth; 
	
	private final Communicator communicator;
	
	public OneSignal(final Authentication auth, final Communicator communicator) {
		this.auth = auth;
		this.communicator = communicator;
	}
	
	public NotificationClient notification() {
		NotificationCommunicator notificationCommunicator = communicator.build(NotificationCommunicator.class, auth);
		return new NotificationClient(notificationCommunicator);
	}
	
}
