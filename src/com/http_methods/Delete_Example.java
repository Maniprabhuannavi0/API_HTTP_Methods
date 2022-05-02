package com.http_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Delete_Example {

	public static void deleteRequest() throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/2957/");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("DELETE");
		connection.setDoOutput(true);

		System.out.println(connection.getResponseCode());
		System.out.println(connection.getResponseMessage());
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader buffer = new BufferedReader(reader);
		StringBuffer strbuffer = new StringBuffer();

		String lines;

		while ((lines = buffer.readLine()) != null) {
			strbuffer.append(lines);
		}
		System.out.println(strbuffer);

	}

	public static void main(String[] args) throws IOException {
		deleteRequest();
	}
}
