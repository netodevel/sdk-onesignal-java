package sdk.onesignal.java.communicators;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import sdk.onesignal.java.domain.Authentication;
import sdk.onesignal.java.utils.FixedHeadersInterceptor;

public class ProdutionCommunicator implements Communicator {

	public <T> T build(Class<T> clazz, Authentication auth) {
		Gson gson = new GsonBuilder().
				setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
		return Feign
                .builder()
                .decoder(new GsonDecoder(gson)) 
                .requestInterceptor(new FixedHeadersInterceptor()) 
                .logger(new Logger.JavaLogger().appendToFile("/home/neto/Documents/http.log"))
                .logLevel(Logger.Level.FULL)
                .encoder(new GsonEncoder(gson)) 
                .target(clazz, "https://onesignal.com/api/v1"); 
	}

}
