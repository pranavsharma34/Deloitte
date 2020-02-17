package run;

import java.util.Hashtable;

import org.apache.http.HttpHeaders;

import actions.WebRequests;

public class Main {

	public static void main(String[] args) throws Exception {
		String urlPath = "https://www.google.com/search?q=mkyong";
		Hashtable<String, String> headerTable = new Hashtable<String, String>();
		headerTable.put("custom-key", "mykong");
		headerTable.put(HttpHeaders.USER_AGENT, "Googlebot");
		WebRequests webRequests = new WebRequests();
		webRequests.sendGet(urlPath, headerTable);
		webRequests.close();
	}
}
