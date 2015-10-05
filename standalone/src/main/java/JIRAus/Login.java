package JIRAus;

import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClientFactory;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;

public class Login {
	public static JiraRestClient login(String username, String password, String urlserver) throws URISyntaxException{
		System.setProperty("javax.net.ssl.trustStore", "C:/Program Files/Java/jre1.8.0_45/lib/security/cacerts");

	    // Print usage instructions
	    StringBuilder intro = new StringBuilder();
	    intro.append("**********************************************************************************************\r\n");
	    intro.append("* JIRA Java REST Client ('JRJC') example.                                                    *\r\n");
	    intro.append("* NOTE: Start JIRA using the Atlassian Plugin SDK before running this example.               *\r\n");
	    intro.append("* (for example, use 'atlas-run-standalone --product jira --version 6.0 --data-version 6.0'.) *\r\n");
	    intro.append("**********************************************************************************************\r\n");
	    System.out.println(intro.toString());

		// Construct the JRJC client
		System.out.println(String.format("Logging in to %s with username '%s' and password '%s'", urlserver, username, password));
		JiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();
			URI uri = new URI(urlserver);
			JiraRestClient client = factory.createWithBasicHttpAuthentication(uri, username, password);
			System.out.println("zalogowano");
			return client;			
	}
}
