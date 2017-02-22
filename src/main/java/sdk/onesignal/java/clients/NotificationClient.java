package sdk.onesignal.java.clients;

import sdk.onesignal.java.communicators.NotificationCommunicator;
import sdk.onesignal.java.domain.Notification;

/**
 * @author NetoDevel
 */
public class NotificationClient {

	private NotificationCommunicator notificationCommunication;
	
	public NotificationClient(NotificationCommunicator notificationCommunicator) {
		this.notificationCommunication = notificationCommunicator;
	}

	/**
	 * Create notification
	 * @param notification
	 * @return
	 */
	public Notification postNotification(Notification notification) {
		return notificationCommunication.postNotification(notification);
	}
	
}
