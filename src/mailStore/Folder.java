package mailStore;

import java.util.ArrayList;
import java.util.List;

import javax.mail.Flags;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Store;

/**
 * Class to house multiple email messages
 * @author indivisible
 *
 */
public class Folder extends javax.mail.Folder{

	// vars
	String title;
	List<Email> emails;
	boolean collect;
	
	// constructors
	public Folder(Store store){
		super(store);
		this.title = "No title";
		this.emails = new ArrayList<Email>();
		this.collect = false; 
	}
	public Folder(Store store, String title){
		super(store);
		this.title = title;
		this.emails = new ArrayList<Email>();
		this.collect = false;
	}
	public Folder(Store store, String title, List<Email> emails, boolean collect){
		super(store);
		this.title = title;
		this.emails = emails;
		this.collect = collect;
	}
	
	// getters & setters
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public List<Email> getEmails(){
		return this.emails;
	}
	public void setEmails(List<Email> emails){
		this.emails = emails;
	}
	public boolean isCollect(){
		return this.collect;
	}
	public void setCollect(boolean collect){
		this.collect = collect;
	}
	
	// functional methods
	public void addEmail(Email email){
		this.emails.add(email);
	}
	public void removeEmail(int index){
		this.emails.remove(index);
	}
	public void removeEmail(Email email){
		this.emails.remove(email);
	}
	
	
	@Override
	public void appendMessages(Message[] arg0) throws MessagingException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close(boolean arg0) throws MessagingException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean create(int arg0) throws MessagingException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(boolean arg0) throws MessagingException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean exists() throws MessagingException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Message[] expunge() throws MessagingException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public javax.mail.Folder getFolder(String arg0) throws MessagingException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Message getMessage(int arg0) throws MessagingException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getMessageCount() throws MessagingException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public javax.mail.Folder getParent() throws MessagingException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Flags getPermanentFlags() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public char getSeparator() throws MessagingException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getType() throws MessagingException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean hasNewMessages() throws MessagingException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public javax.mail.Folder[] list(String arg0) throws MessagingException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void open(int arg0) throws MessagingException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean renameTo(javax.mail.Folder arg0) throws MessagingException {
		// TODO Auto-generated method stub
		return false;
	}
}
