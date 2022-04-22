package unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;


public class Unirest_Example_Jar {
	
	
	public void getRequestExample() throws Exception { 
HttpResponse<JsonNode> jsonresponse = Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();	
    System.out.println("Status is:" +jsonresponse.getStatus());
    System.out.println("Statustext is:" +jsonresponse.getStatusText());
    System.out.println("Body is:" +jsonresponse.getBody());
	  
	}
	public void postRequestExample() throws Exception { 
		HttpResponse<JsonNode> jsonresponse = Unirest.post("http://dummy.restapiexample.com/api/v1/create").
				body("[\"name\":\"jaga master\",\"salary\":\"12000000\",\"age\":\"25\"]").asJson();	
		    System.out.println("Status is:" +jsonresponse.getStatus());
		    System.out.println("Statustext is:" +jsonresponse.getStatusText());
		    System.out.println("Body is:" +jsonresponse.getBody());
	}
	public void putRequestExample() throws Exception { 
		HttpResponse<JsonNode> jsonresponse = Unirest.put("http://dummy.restapiexample.com/api/v1/update/3720/").
				body("[\"name\":\"jaga waste\",\"salary\":\"10000\",\"age\":\"26\"]").asJson();	
		    System.out.println("Status is:" +jsonresponse.getStatus());
		    System.out.println("Statustext is:" +jsonresponse.getStatusText());
		    System.out.println("Body is:" +jsonresponse.getBody());
	}
	public void deleteRequestExample() throws Exception { 
HttpResponse<JsonNode> jsonresponse = Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/6886/").asJson();	
		    System.out.println("Status is:" +jsonresponse.getStatus());
		    System.out.println("Statustext is:" +jsonresponse.getStatusText());
		    System.out.println("Body is:" +jsonresponse.getBody());
	}
	
	public static void main(String[] args) throws Exception {
		Unirest_Example_Jar example = new Unirest_Example_Jar();
//		example.getRequestExample();
//		example.postRequestExample();
		example.putRequestExample();
//		example.deleteRequestExample();
   }
}
