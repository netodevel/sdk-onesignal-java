package sdk.onesignal.java.notification.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import sdk.onesignal.java.OneSignal;
import sdk.onesignal.java.communicators.ProdutionCommunicator;
import sdk.onesignal.java.domain.Authentication;
import sdk.onesignal.java.domain.Data;
import sdk.onesignal.java.domain.Notification;

/**
 * @author NetoDevel
 */
public class PostNotificationTest {

	public static final String API_KEY = "";
	
	@Test
	public void testPostNotification() {
		OneSignal oneSignal = new OneSignal(new Authentication(API_KEY), new ProdutionCommunicator());
		oneSignal.notification().postNotification(prepareNotification());
	}
	
	private Notification prepareNotification() {
		Notification notification = new Notification();
		notification.setAppId("76fb68fc-cb8f-4b0f-b9e2-e71218cf256e");
		
		HashMap<String, String> contents = new HashMap<String, String>();
		contents.put("en", "English Message");
		notification.setContents(contents);
		
		Data data = new Data();
		data.setFoo("bar");
		notification.setData(data);
		
//		List<String> segments = new ArrayList<String>();
//		segments.add("All");
//		notification.setIncludedSegments(segments);
		
		List<String> playersId = new ArrayList<String>();
		playersId.add("a578bc7b-887d-4a10-bf8f-202d372dc2c3");
		notification.setIncludePlayerIds(playersId);
		
		return notification;
	}
	
}
