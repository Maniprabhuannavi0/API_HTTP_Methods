package com.http_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Post_Example {

	public void postRequest() throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		
		//connect() it will only for get method
		//connection.connect();
		
		connection.setRequestProperty("Content-Type", "application/json");

		// if we want to send a output to Body
		connection.setDoOutput(true);

		// jsonbody setup
		String jsonBody = "{\"name\":\"mani\",\"salary\":\"95000\",\"age\":\"23\"}";

		// using byte going to read it

		byte[] bytes = jsonBody.getBytes();

		// to write a body
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(bytes);

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
		Post_Example p = new Post_Example();
		p.postRequest();
	}
}
