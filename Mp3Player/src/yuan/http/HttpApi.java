package yuan.http;

import java.io.InputStream;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;

public interface HttpApi {
	
	public abstract HttpPost createHttpPost(String serverUrl, List<NameValuePair> nameValuePair);
	
	public abstract InputStream doHttpPost();	
}
