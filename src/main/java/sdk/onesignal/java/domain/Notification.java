package sdk.onesignal.java.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author NetoDevel
 */
public class Notification implements Serializable {

	private static final long serialVersionUID = 1L;

	@SerializedName("app_id")
	@Expose
	private String appId;
	
	@SerializedName("included_segments")
	@Expose
	private List<String> includedSegments;

	@SerializedName("data")
	@Expose
	private Data data;
	
	@SerializedName("contents")
	@Expose
	private HashMap<String, String> contents;
	
	@SerializedName("include_player_ids")
	private List<String> includePlayerIds;
	
	@SerializedName("isAppInFocus")
	@Expose
	private Boolean isAppInFocus;
	
	@SerializedName("shown")
	@Expose
	private Boolean shown;
	
	@SerializedName("large_icon")
	@Expose
	private String largeIcon;
	
	@SerializedName("small_icon")
	@Expose
	private String smallIcon;
	
	public Notification(){
	}
	
	public Notification(NotificationBuilder notificationBuilder){
		this.appId = notificationBuilder.getAppId();
		this.contents = notificationBuilder.getContent();
		this.includedSegments = notificationBuilder.getIncludedSegments();
		this.includePlayerIds = notificationBuilder.getIncludePlayerIds();
	}
	
	public String getAppId() {
		return appId;
	}
	
	public void setAppId(String appId) {
		this.appId = appId;
	}

	public HashMap<String, String> getContents() {
		return contents;
	}

	public void setContents(HashMap<String, String> contents) {
		this.contents = contents;
	}

	public List<String> getIncludedSegments() {
		return includedSegments;
	}

	public void setIncludedSegments(List<String> includedSegments) {
		this.includedSegments = includedSegments;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public List<String> getIncludePlayerIds() {
		return includePlayerIds;
	}

	public void setIncludePlayerIds(List<String> includePlayerIds) {
		this.includePlayerIds = includePlayerIds;
	}
	
	public Boolean getIsAppInFocus() {
		return isAppInFocus;
	}

	public Notification isAppInFocus(Boolean appInFocus) {
		this.isAppInFocus = appInFocus;
		return this;
	}

	public Boolean getShown() {
		return shown;
	}
	
	public Notification withShown(Boolean shown) {
		this.shown = shown;
		return this;
	}

	public String getLargeIcon() {
		return largeIcon;
	}

	public Notification withLargeIcon(String largeIcon) {
		this.largeIcon = largeIcon;
		return this;
	}

	public String getSmallIcon() {
		return smallIcon;
	}

	public Notification withSmallIcon(String smallIcon) {
		this.smallIcon = smallIcon;
		return this;
	}
	
}
