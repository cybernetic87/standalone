package JIRAus;

import java.io.IOException;

import javax.swing.SwingUtilities;

import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.SearchRestClient;
import com.atlassian.jira.rest.client.api.domain.BasicIssue;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.SearchResult;
import com.atlassian.jira.rest.client.api.domain.User;

public class SearchIssue {
	
	public void SearchIssue(JiraRestClient client, String summary) throws IOException {
        final SearchRestClient searchClient = client.getSearchClient();
        final String jql = "project in (MINFINTREZOR) and summary ~ '"+summary+"'";
        final SearchResult results = searchClient.searchJql(jql).claim();
        //assertEquals(1, results.getTotal());
        int totalResults = results.getTotal();
        final IssueRestClient issueClient = client.getIssueClient();
        // retrieve results. We know there's only one.
        for (final BasicIssue result : results.getIssues()) {
            final Issue actual = issueClient.getIssue(result.getKey()).claim();
            //issueClient.addComment(actual.getCommentsUri(), Comment.valueOf("comment1")).claim();
            //issueClient.addComment(actual.getCommentsUri(), Comment.valueOf("comment2")).claim();
            //issueClient./addComment(actual.getCommentsUri(), Comment.valueOf("comment3")).claim();
           /* issueClient.transition(actual.getTransitionsUri(), new TransitionInput(2)).claim();
            issueClient.transition(actual.getTransitionsUri(), new TransitionInput(3)).claim();
            issueClient.transition(actual.getTransitionsUri(), new TransitionInput(4)).claim();
            issueClient.transition(actual.getTransitionsUri(), new TransitionInput(5)).claim(); */
            //assertEquals(PROJECT_KEY, actual.getProject().getKey());
            //assertEquals(BUG_TYPE_ID, actual.getIssueType().getId().longValue());
            //assertEquals(SUMMARY, actual.getSummary());
            //System.out.println(result.toString());
            User asignee = actual.getAssignee();
            System.out.println("Zgłoszenie: "+actual.getKey());
            //window.textField.setText("Zgłoszenie: "+actual.getKey());
            //SwingUtilities.updateComponentTreeUI(window);
            System.out.println(actual.getSummary());
            //window.textField_1.setText(actual.getSummary());
            System.out.println("Opis: "+actual.getDescription());
            System.out.println("Przydzielony: "+asignee.getDisplayName());
            //window.textField_2.setText("Przydzielony: "+asignee.getDisplayName());
            System.out.println("Osoba Kontaktowa: "+ actual.getFieldByName("Osoba kontaktowa").getValue());
            System.out.println("Telefon osoby kontaktowej: "+actual.getField("customfield_10602").getValue());
            System.out.println("E-mail osoby kontaktowej: "+actual.getField("customfield_10600").getValue());
            //System.out.println("Nr te1lefonu +" actual.getField("customfield_10000"));
            System.out.println("**********************************************************************************************");
        }
        System.out.println("Found: "+totalResults);
	}
}
