package sdk.onesignal.java.domain;


/**
 * @author NetoDevel
 */
public class Authentication {

	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Authentication(String key) {
		super();
		this.key = key;
	}
	
}
