package sdk.onesignal.java.domain;

import java.util.HashMap;
import java.util.List;

/**
 * @author NetoDevel
 */
public class NotificationBuilder {

	private String appId;
	private HashMap<String, String> content;
	private List<String> includedSegments;
	private List<String> includePlayerIds;
	private Data data;
	
	public NotificationBuilder(String appId, HashMap<String, String> content) {
		this.appId = appId;
		this.content = content;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public HashMap<String, String> getContent() {
		return content;
	}

	public void setContent(HashMap<String, String> content) {
		this.content = content;
	}

	public List<String> getIncludedSegments() {
		return includedSegments;
	}

	public void setIncludedSegments(List<String> includedSegments) {
		this.includedSegments = includedSegments;
	}

	public List<String> getIncludePlayerIds() {
		return includePlayerIds;
	}

	public void setIncludePlayerIds(List<String> includePlayerIds) {
		this.includePlayerIds = includePlayerIds;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public NotificationBuilder withIncludedSegments(List<String> includedSegments) {
		this.includedSegments = includedSegments;
		return this;
	}
	
	public NotificationBuilder withIncludedPlayerIds(List<String> playersId) {
		this.includePlayerIds = playersId;
		return this;
	}
	
	public NotificationBuilder withData(Data data) {
		this.data = data;
		return this;
	}
	
	public Notification build() {
		validateNotification(appId, content);
		return new Notification(this);
	}
	
	private void validateNotification(String appId, HashMap<String, String> content) {
		if (appId == null || appId == "") {
			throw new IllegalArgumentException("app id can not be null");
		}
		if (content == null || content.size() == 0) {
			throw new IllegalArgumentException("content can not be null");
		}
		if(this.includedSegments == null && this.includePlayerIds == null) {
			throw new IllegalArgumentException("You must specify included_segments or players_id");
		}
	}
	
}
