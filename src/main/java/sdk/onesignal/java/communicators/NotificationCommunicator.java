package sdk.onesignal.java.communicators;

import feign.RequestLine;
import sdk.onesignal.java.domain.Notification;

/**
 * @author NetoDevel
 */
public interface NotificationCommunicator {
	
	@RequestLine("POST /notifications")
	Notification postNotification(Notification notification);

}
