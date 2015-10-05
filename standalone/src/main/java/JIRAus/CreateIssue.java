package JIRAus;

import java.io.IOException;

import org.junit.Test;

import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.SearchRestClient;
import com.atlassian.jira.rest.client.api.domain.BasicIssue;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.SearchResult;
import com.atlassian.jira.rest.client.api.domain.input.FieldInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;


    public class CreateIssue {

     
        private static final String PROJECT_KEY = "DEMO";
        private static final long BUG_TYPE_ID = 1L; // JIRA magic value
     
        /**
         * Create an minimal issue, verify that we can search for it.
         */
        @Test
        public void CreateIssue(JiraRestClient client, String summary) throws IOException {
            
        	
        	
            final IssueInputBuilderExt builder = new IssueInputBuilderExt(PROJECT_KEY, BUG_TYPE_ID, summary);
            //final IssueInput input2 = builder.setPhoneNum("ss").build();
            final IssueInput input = builder.setDescription("opiiiis").build();
            FieldInput pole = input.getField("summary");
            String wartoscPola = pole.getValue().toString();
            System.out.println("Tworzę zgłoszenie: " + wartoscPola);
            try {
                // create issue
                final IssueRestClient issueClient = client.getIssueClient();
                final BasicIssue issue = issueClient.createIssue(input).claim();
                
     

                // post 2.0.0-m25 we can delete issue to reduce clutter
            } finally {
                }
            }
    }
