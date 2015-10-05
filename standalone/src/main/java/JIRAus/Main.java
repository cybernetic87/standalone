package JIRAus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.junit.experimental.theories.Theories;
import org.springframework.beans.factory.annotation.Autowired;

import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClientFactory;
import com.atlassian.jira.rest.client.api.domain.User;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;

/**
 * Entry-point invoked when the jar is executed.
 */
public class Main
{	
	
	
	//private static final String JIRA_URL = "http://localhost:2990/jira";
    //private static final String JIRA_URL = "https://jirastg.amg.net.pl";
    //private static final String JIRA_ADMIN_USERNAME = "kkierski";
    //private static final String JIRA_ADMIN_PASSWORD = "pass";

	public static void main(String[] args) throws Exception
    {
    	MainWindow mainWindow = new MainWindow();
    	mainWindow.setVisible(true);
    	
    	

        // Invoke the JRJC Client
       // Promise<User> promise = client.getUserClient().getUser("admin");
        //User user = promise.claim();

        // Print the result
        //System.out.println(String.format("Your admin user's email address is: %s\r\n", user.getEmailAddress()));
       //1 System.out.println(String.format("Your admin user's name is: %s\r\n", user.getName()));
        
      /*  IssueTest it = new IssueTest();
        System.out.println("Creating issue");
        it.createMinimalIssueAndSearch(client);
        System.out.println("Creating issue completed"); (*/
        
      /*  System.out.println("1. Search Issue");
        System.out.println("2. Create Issue");
        System.out.println("Selection:");
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();
        sc.nextLine(); */
        
  //      mainWindow.btnNewButton.addActionListener(new ActionListener() {
			
	//		@Override
//			public void actionPerformed(ActionEvent e) {
//				String summarySearch = "Konfiguracja";
//	        	SearchIssue si = new SearchIssue();
//	        	si.SearchIssue(client, summarySearch, mainWindow);
//			}
//    	 	
//    	------------------------
//    	JiraRestClient client;
//    	 	       

//      do  {
//    	   System.out.println("1. Search Issue");
//           System.out.println("2. Create Issue");
//           System.out.println("Selection:");
//           Scanner sc = new Scanner(System.in);
//           int selection = sc.nextInt();
//           sc.nextLine();
//        if (selection == 1) {
//        	System.out.println("Summary to search ?");
//        	String summarySearch = sc.nextLine();
//        	SearchIssue si = new SearchIssue();
//        	si.SearchIssue(client, summarySearch, mainWindow);
//        }
//        else 
//        {
//        System.out.println("Enter new issue summary ?");
//        CreateIssue ci = new CreateIssue();
//        String summaryCreate = sc.nextLine();
//        ci.CreateIssue(client, summaryCreate);
//        }
//        // Done
//        System.out.println("Complete. Exiting.");
//        //System.exit(0);
//    }
//       while (1 == 1);
   }
}
