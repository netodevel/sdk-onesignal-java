package sdk.onesignal.java.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author neto
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
	private String data;
	
	@SerializedName("contents")
	@Expose
	private HashMap<String, String> contents;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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
	
}
