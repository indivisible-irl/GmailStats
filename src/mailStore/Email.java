package mailStore;

import java.util.ArrayList;
import java.util.List;

import javax.mail.Folder;
import javax.mail.internet.MimeMessage;

/**
 * Class to hold individual message details
 * @author indivisible
 *
 */
public class Email extends MimeMessage{

	protected Email(Folder folder, int msgnum) {
		super(folder, msgnum);
		// TODO Auto-generated constructor stub
	}
	List<String> to;
	List<String> from;
	List<String> cc;
	String header;
	String body;
	String subject;
	boolean fav;
	
//	public Email(){
//		super();
//		to = new ArrayList<String>();
//		from = new ArrayList<String>();
//		cc = new ArrayList<String>();
//		header = "No header";
//		body = "No body";
//		subject = "No subject";
//		fav = false;
//	}
}
