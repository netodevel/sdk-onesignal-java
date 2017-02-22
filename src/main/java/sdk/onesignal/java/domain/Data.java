package sdk.onesignal.java.domain;

import java.io.Serializable;

/**
 * @author NetoDevel
 */
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String foo;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
	
}
