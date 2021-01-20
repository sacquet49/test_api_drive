package com.munsif.ssd.oauth.constant;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.Collections;
import java.util.List;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.DriveScopes;

public class ApplicationConstant {

	// public static HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	public static Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.gicm.net", 3128));
	public static HttpTransport HTTP_TRANSPORT = new NetHttpTransport.Builder().setProxy(proxy).build();
	static {
		Authenticator.setDefault(
						new Authenticator() {
							@Override
							public PasswordAuthentication getPasswordAuthentication() {
								return new PasswordAuthentication("***", "***".toCharArray());
							}
						}
		);
	}
	public static JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

	public static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE);

	public static final String USER_IDENTIFIER_KEY = "MY_TEST_USER";
	public static final String APPLICATION_NAME = "SSD OAuth Spring App";
	public static final String PARENT_FOLDER_NAME = "OAuth Demo App Uploaded";
}
