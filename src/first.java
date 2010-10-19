import twitter4j.*;
import twitter4j.http.AccessToken;
import twitter4j.http.RequestToken;

public class first
{
	public static void main(String args[])
	{
	final String CONSUMER_KEY="gi00VVuh4rFH8BUwQGP3g";
	final String CONSUMER_SECRET="uHNyACtft8nGIZs18G3dIqaGXZ7GkdOJBBjIiCJEYGo";
	
	Twitter twitter = new Twitter();
	twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);

	RequestToken requestToken = null;
	try {
	   requestToken = twitter.getOAuthRequestToken();
	} catch (TwitterException te) {
	}
	requestToken.getToken();
	requestToken.getTokenSecret();
	requestToken.getAuthorizationURL();
	System.out.println(requestToken);
	

	}
}
