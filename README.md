# OneSignal Java Push Notification

# About
OneSignal is a free push notification service for mobile apps. 
This plugin makes it easy to integrate with java projects.

<p align="center">
  <img src="art/mob.png" alt="Push Notification" />
</p>

# Install

```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

	<dependency>
	    <groupId>com.github.NetoDevel</groupId>
	    <artifactId>sdk-onesignal-java</artifactId>
	    <version>0.1</version>
	</dependency>

```
# Usage

### Push Notification specific devices
```java
  public static final String API_KEY = "";
  public static final String APP_ID = "";
  
  OneSignal oneSignal = new OneSignal(new Authentication(API_KEY), new ProdutionCommunicator());
  oneSignal.notification().postNotification(prepareNotification());
  
  HashMap<String, String> contents = new HashMap<String, String>();
  contents.put("en", "Message");
  oneSignal.notification().postNotification(
				new NotificationBuilder(APP_ID, contents)
				.withIncludedPlayerIds(Arrays.asList("5aa94fdc-f6ba-4c11-8cc2-ffda8e30a074"))
				.build());
 

```




# License

    The MIT License (MIT)

    Copyright (c) 2017 José Vieira 

    Permission is hereby granted, free of charge, to any person obtaining a 
    copy of this software and associated documentation files (the "Software"), 
    to deal in the Software without restriction, including without limitation 
    the rights to use, copy, modify, merge, publish, distribute, sublicense, 
    and/or sell copies of the Software, and to permit persons to whom the Software is 
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included 
    in all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
    INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR 
    PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE 
    FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
    ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
