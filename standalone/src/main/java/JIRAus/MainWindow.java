package JIRAus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;

import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClientFactory;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;
			JButton butCancel;
			JButton butLogin;
	 public JPasswordField passwordField;
	 		JTextField textFieldLogin;
	 		JTextField textFieldServer;
	 static	JiraRestClient client;

	public MainWindow() {
		setTitle("JIRAus - Logowanie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(86, 11, 305, 22);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		textFieldServer = new JTextField();
		textFieldServer.setBounds(86, 77, 305, 22);
		contentPane.add(textFieldServer);
		textFieldServer.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(86, 46, 305, 20);
		contentPane.add(passwordField);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogin.setBounds(10, 14, 66, 16);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Hasło:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(10, 47, 66, 16);
		contentPane.add(lblPassword);
		
		JLabel lblServer = new JLabel("Serwer:");
		lblServer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblServer.setBounds(30, 81, 46, 14);
		contentPane.add(lblServer);
		
		butLogin = new JButton("Zaloguj");
		butLogin.addActionListener(new ActionListener() {
			@Autowired
			public void actionPerformed(ActionEvent arg0) {
		
				
				String password = passwordField.getText();
				try {
					client = Login.login(textFieldLogin.getText(), password, textFieldServer.getText());
					SearchIssue si = new SearchIssue();
					si.SearchIssue(client, "Reset");
				} catch (URISyntaxException e) {
					JOptionPane.showMessageDialog(null, "Błędne dane logowania!");
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						
			}
		});
		butLogin.setBounds(86, 110, 143, 25);
		contentPane.add(butLogin);
		
		butCancel = new JButton("Anuluj");
		butCancel.setBounds(248, 110, 143, 25);
		contentPane.add(butCancel);
	}
}
