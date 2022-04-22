package JAVANet;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import java.net.URL;

public class HttpURLConnectionExample {

	public void getMethodExample() throws IOException {
		URL url = new URL("https://reqres.in/api/users");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int code = connection.getResponseCode();
		System.out.println("Response Code is:" +code);

		String msg = connection.getResponseMessage();
		System.out.println("Response msg is:" +msg);

		InputStream input = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(input);
		BufferedReader bufferreader = new BufferedReader(reader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferreader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public void postMethodExample() throws IOException {
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonbody = "{\"name\":\"jaga mass\",\"salary\":\"120000\",\"age\":\"25\"}";
		byte[] inputjson = jsonbody.getBytes();
		OutputStream output = connection.getOutputStream();
		output.write(inputjson);

		System.out.println(connection.getResponseCode());
		System.out.println(connection.getResponseMessage());

		InputStream input = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(input);
		BufferedReader bufferreader = new BufferedReader(reader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferreader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);

	}
     public void putMethodExample() throws IOException {
    	URL url = new URL("http://dummy.restapiexample.com/api/v1/update/21/");
 		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
 		connection.setRequestMethod("PUT");
 		connection.setRequestProperty("Content-Type", "application/json");
 		connection.setDoOutput(true);

 		String jsonbody = "{\"name\":\"jaga mass\",\"salary\":\"120000\",\"age\":\"27\"}";
 		byte[] inputjson = jsonbody.getBytes();
 		OutputStream output = connection.getOutputStream();
 		output.write(inputjson);

 		System.out.println(connection.getResponseCode());
 		System.out.println(connection.getResponseMessage());

 		InputStream input = connection.getInputStream();
 		InputStreamReader reader = new InputStreamReader(input);
 		BufferedReader bufferreader = new BufferedReader(reader);
 		String line;
 		StringBuffer buffer = new StringBuffer();
 		while((line = bufferreader.readLine())!=null) {
 			buffer.append(line);
 		}
 		System.out.println(buffer);
 		}
     
     public void DeleteMethodExample() throws IOException {
     	URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/2/");
  		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
  		connection.setRequestMethod("DELETE");
  		connection.setRequestProperty("Content-Type", "application/json");
  		connection.setDoOutput(true);

  	    System.out.println(connection.getResponseCode());
  		System.out.println(connection.getResponseMessage());

  		InputStream input = connection.getInputStream();
  		InputStreamReader reader = new InputStreamReader(input);
  		BufferedReader bufferreader = new BufferedReader(reader);
  		String line;
  		StringBuffer buffer = new StringBuffer();
  		while((line = bufferreader.readLine())!=null) {
  			buffer.append(line);
  		}
  		System.out.println(buffer);
  		}



	public static void main(String[] args) throws IOException {
		HttpURLConnectionExample example = new HttpURLConnectionExample();
//		example.getMethodExample();
		example.postMethodExample();

	}

}
