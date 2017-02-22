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
	
}
