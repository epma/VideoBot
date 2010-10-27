
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import twitter4j.*;
import twitter4j.http.AccessToken;
import twitter4j.http.RequestToken;

public class real {
	/*public static void main(String args[]) throws Exception{
	    // The factory instance is re-useable and thread safe.
	    Twitter twitter = new TwitterFactory().getInstance();
	    twitter.setOAuthConsumer("gi00VVuh4rFH8BUwQGP3g", "uHNyACtft8nGIZs18G3dIqaGXZ7GkdOJBBjIiCJEYGo");
	    RequestToken requestToken = twitter.getOAuthRequestToken();
	    AccessToken accessToken = null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    while (null == accessToken) {
	      System.out.println("Open the following URL and grant access to your account:");
	      System.out.println(requestToken.getAuthorizationURL());
	      System.out.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
	      String pin = br.readLine();
	      try{
	         if(pin.length() > 0){
	           accessToken = twitter.getOAuthAccessToken(requestToken, pin);
	         }else{
	           accessToken = twitter.getOAuthAccessToken();
	         }
	      } catch (TwitterException te) {
	        if(401 == te.getStatusCode()){
	          System.out.println("Unable to get the access token.");
	        }else{
	          te.printStackTrace();
	        }
	      }
	    }
	 
	    //persist to the accessToken for future reference.
	    storeAccessToken(twitter.verifyCredentials().getId() , accessToken);
	    Status status = twitter.updateStatus(args[0]);
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	    System.exit(0);
	  }
	
	  private static void storeAccessToken(int useId, AccessToken accessToken){
	   System.out.println("AccessToken : "+accessToken.getToken());
	   System.out.println("AccessToken Secret : "+accessToken.getTokenSecret());
	   System.out.println(accessToken);
	  }*/
	private static AccessToken loadAccessToken(int useId){
	    String token = "167716477-D5JESmqg6yDBXUqjopK53PNWLIWGFJcrsemluiT1"; // load from a persistent store
	    String tokenSecret = "6hUSCHKRIA48kCujkXHcAVSN8OUfuOz91RAHCfHhJVY"; // load from a persistent store
	    return new AccessToken(token, tokenSecret);
	  }

	public static void main(String args[]) throws Exception{
	    // The factory instance is re-useable and thread safe.
	    TwitterFactory factory = new TwitterFactory();
	    Twitter twitter = factory.getInstance();
	    twitter.setOAuthConsumer("gi00VVuh4rFH8BUwQGP3g", "uHNyACtft8nGIZs18G3dIqaGXZ7GkdOJBBjIiCJEYGo");
	    AccessToken accessToken = loadAccessToken(167716477);
	    twitter.setOAuthAccessToken(accessToken);
	    Status status = twitter.updateStatus("asgrbnbnbn");
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");

	    List<Status> statuses = twitter.getFriendsTimeline();
	    System.out.println("Showing friends timeline.");
	    for (Status status1 : statuses) {
	        System.out.println(status1.getUser().getName() + ":" +
	                           status1.getText());

	       

	    System.exit(0);
	    
	    
	}
}

