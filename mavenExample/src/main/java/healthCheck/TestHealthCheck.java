package healthCheck;


import java.net.HttpURLConnection;
import java.net.URL;

import fit.ColumnFixture;

public class TestHealthCheck extends ColumnFixture{
	
	 String URLGiven;
	 HttpURLConnection connection;
	 int Responsecode;
	 String Responsemsg;
	 
	public String getRequest() throws Exception {
		URL url = new URL(URLGiven);
	    connection = (HttpURLConnection) url.openConnection();
	    connection.setRequestMethod("GET");
	    connection.connect();
	    return "URLHIT";
    }
	
	public int getResponseCode() throws Exception {
		Responsecode = connection.getResponseCode();
		System.out.println(Responsecode);
		return Responsecode;
	}
	public String getResponsemsg() throws Exception {
		Responsemsg = connection.getResponseMessage();
		System.out.println(Responsemsg);
		return Responsemsg;
	}
	
	
}
