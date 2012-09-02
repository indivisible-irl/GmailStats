package mailStore;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;


public class Main {
	
	public static void main(String[] args) {

		Folder folder;
		System.out.println("! BEGIN");
		String host = "pop.gmail.com";
		String user = "mbspare@gmail.com";
		String pass = "1531asdd1531";
		Properties props = new Properties();
		//Authenticator auth = new MyAuthenticator();
		Session session = Session.getDefaultInstance(props, null);;
		//MimeMessage msg;
		System.out.println("! End var stage");
		
		try {
			Store store = session.getStore("pop3");
			System.out.println("! Apres Store");
			store.connect(host, user, pass);
			System.out.println("! Apres connect");
			folder = new Folder(store);
			
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
