package sdk.onesignal.java.utils;

import static feign.Util.checkNotNull;
import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @author NetoDevel
 */
public class BasicAuthOneSignal implements RequestInterceptor {

    private final String keyValue;

    public BasicAuthOneSignal(final String keyValue) {
        checkNotNull(keyValue, "keyvalue");
        this.keyValue = keyValue;
    }

    public void apply(final RequestTemplate template) {
        template.header("Authorization", "Basic " + keyValue);
    }
    
}
