package com.http_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Put_Example {

	public static void putRequest() throws IOException {
		// TODO Auto-generated method stub
//2957
		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/2957/");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		// jsonbody setup
		String jsonBody = "{\"name\":\"mani\",\"salary\":\"95000\",\"age\":\"24\"}";

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
putRequest();
	}
}
