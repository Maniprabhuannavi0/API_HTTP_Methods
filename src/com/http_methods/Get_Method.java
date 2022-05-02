package com.http_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Get_Method {
	public void getResponse() throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		// response code
		int responseCode = connection.getResponseCode();
		System.out.println(responseCode);

		// response message
		String responseMessage = connection.getResponseMessage();
		System.out.println(responseMessage);

		// response Body
		InputStream inputStream = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader bufferedreader = new BufferedReader(reader);
		StringBuffer buffer = new StringBuffer();
		String lines;
		while ((lines = bufferedreader.readLine()) != null) {
			buffer.append(lines);
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws IOException {
		Get_Method getting = new Get_Method();

		getting.getResponse();
	}
}
