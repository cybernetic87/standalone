package JIRAus;

import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;


public class IssueInputBuilderExt extends IssueInputBuilder {

	String phoneNum = null;
	String dysponent = null;
	String jednostka = null;

	public IssueInputBuilderExt(String projectKey, Long issueTypeId,
			String summary) {
		super(projectKey, issueTypeId, summary);
		// TODO Auto-generated constructor stub
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public IssueInputBuilderExt setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
		return this;
	}

	public String getDysponent() {
		return dysponent;
	}

	public void setDysponent(String dysponent) {
		this.dysponent = dysponent;
	}

	public String getJednostka() {
		return jednostka;
	}

	public void setJednostka(String jednostka) {
		this.jednostka = jednostka;
	}

}
