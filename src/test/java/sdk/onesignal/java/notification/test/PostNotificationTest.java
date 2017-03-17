package sdk.onesignal.java.notification.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

import sdk.onesignal.java.OneSignal;
import sdk.onesignal.java.communicators.ProdutionCommunicator;
import sdk.onesignal.java.domain.Authentication;
import sdk.onesignal.java.domain.NotificationBuilder;

/**
 * @author NetoDevel
 */
public class PostNotificationTest {

	public static final String API_KEY = "";
	public static final String APP_ID = "";
	OneSignal oneSignal = new OneSignal(new Authentication(API_KEY), new ProdutionCommunicator());

	@Test
	public void testPostNotification() {
		HashMap<String, String> contents = new HashMap<String, String>();
		contents.put("en", "Message");
		oneSignal.notification().postNotification(
				new NotificationBuilder(APP_ID, contents)
				.withIncludedPlayerIds(Arrays.asList("5aa94fdc-f6ba-4c11-8cc2-ffda8e30a074"))
				.build());
	}
	
	@Test
	public void testValidateNotificationAppId() {
		HashMap<String, String> contents = new HashMap<String, String>();
		contents.put("en", "Message");
		try {
			oneSignal.notification().postNotification(new NotificationBuilder("", contents).build());
		} catch (Exception e) {
			assertEquals("app id can not be null", e.getMessage());
		}
	}
	
	@Test
	public void testValidateNotificationContent() {
		HashMap<String, String> contents = new HashMap<String, String>();
		try {
			oneSignal.notification().postNotification(new NotificationBuilder(APP_ID, contents).build());
		} catch (Exception e) {
			assertEquals("content can not be null", e.getMessage());
		}
	}
	
	@Test
	public void testValidateNotificationIncludedSegmentsOrPlayersId() {
		HashMap<String, String> contents = new HashMap<String, String>();
		contents.put("en", "Message");
		try {
			oneSignal.notification().postNotification(new NotificationBuilder(APP_ID, contents).build());
		} catch (Exception e) {
			assertEquals("You must specify included_segments or players_id", e.getMessage());
		}
	}

}



