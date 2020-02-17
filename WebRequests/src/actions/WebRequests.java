package actions;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class WebRequests {

	private final CloseableHttpClient _httpCient = HttpClients.createDefault();
	
	public void close() throws IOException {
		_httpCient.close();
	}
	
	public void sendGet(String urlPath, Hashtable<String, String> headerTable) throws Exception {
		HttpGet getRequest = new HttpGet(urlPath);
		Set<String> keys = headerTable.keySet();
		for (String key: keys) {
			getRequest.addHeader(key, headerTable.get(key));
		}
		CloseableHttpResponse getResponse = _httpCient.execute(getRequest);
		String status = getResponse.getStatusLine().toString();
		HttpEntity entity = getResponse.getEntity();
		Header header = entity.getContentType();
		System.out.println(status);
		System.out.println(header);
		System.out.println(getResponse.toString());
	}
	
	public void sendPost(String urlPath, List<BasicNameValuePair> pairs) throws Exception {
		HttpPost postRequest = new HttpPost(urlPath);
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		for (int i = 0; i < pairs.size(); i++) {
			urlParameters.add(pairs.get(i));
		}
		postRequest.setEntity(new UrlEncodedFormEntity(urlParameters));
		CloseableHttpResponse getResponse = _httpCient.execute(postRequest);
		EntityUtils.toString(getResponse.getEntity());
	}
	
}