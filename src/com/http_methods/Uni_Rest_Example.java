package com.http_methods;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequestWithBody;
import com.mashape.unirest.request.body.RequestBodyEntity;

public class Uni_Rest_Example {

	public static void getRequestExample() throws UnirestException {
		// TODO Auto-generated method stub
		GetRequest getRequest = Unirest.get("http://dummy.restapiexample.com/api/v1/employees");
		HttpResponse<JsonNode> asJson = getRequest.asJson();
		System.out.println(asJson.getStatus());
		System.out.println(asJson.getStatusText());
		System.out.println(asJson.getBody());

	}

	public static void postRequestExampl() throws UnirestException {
		// TODO Auto-generated method stub

		HttpRequestWithBody post = Unirest.post("http://dummy.restapiexample.com/api/v1/create");
		RequestBodyEntity body = post.body("{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}");
		HttpResponse<JsonNode> asJson = body.asJson();

		System.out.println(asJson.getStatus());
		System.out.println(asJson.getStatusText());
		System.out.println(asJson.getBody());
	}

	public static void putRequestExample() throws UnirestException {
		// TODO Auto-generated method stub
		HttpRequestWithBody put = Unirest.put("http://dummy.restapiexample.com/api/v1/update/2957/");
		RequestBodyEntity body = put.body("{\"name\":\"test\",\"salary\":\"123\",\"age\":\"24\"}");
		HttpResponse<JsonNode> asJson = body.asJson();

		System.out.println(asJson.getStatus());
		System.out.println(asJson.getStatusText());
		System.out.println(asJson.getBody());
	}

	public static void deleteRequestExample() throws UnirestException {
		// TODO Auto-generated method stub
		HttpRequestWithBody delete = Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/2957/");
		HttpResponse<JsonNode> asJson = delete.asJson();
		System.out.println(asJson.getStatus());
		System.out.println(asJson.getStatusText());
		System.out.println(asJson.getBody());
	}

	public static void main(String[] args) throws UnirestException {
		// getRequestExample();
		// postRequestExampl();
		deleteRequestExample();
	}
}
