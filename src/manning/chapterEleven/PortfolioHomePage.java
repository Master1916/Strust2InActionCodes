package manning.chapterEleven;


import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import manning.utils.PortfolioServiceInterface;

/*
 * This action retrieves the data model for building the Struts 2 Portfolio HomePage.
 * This mostly consists of a list of the current user/accounts. 
 */

public class PortfolioHomePage  extends MySuperClass implements PropertiesFileInterface {
	
	public String execute(){
	//HttpSession session= ActionContext.getContext().getSession();
        HttpSession session=ServletActionContext.getRequest().getSession();
        Locale locale=(Locale)session.getAttribute("WW_TRANS_I18N_LOCALE");
	
		Collection users =  getPortfolioService().getUsers();
		setUsers( users );
		
		String selectedUsername = getPortfolioService().getDefaultUser();
		setDefaultUsername( selectedUsername );
		
		return SUCCESS;
	}
	
	/* JavaBeans Properties to Receive Request Parameters */
	
	private Collection users;
	private String defaultUsername;
	
	static public final Map locales = new HashMap();
	static {
		locales.put("en_US", "English");
		locales.put("es_SP", "Spanish");
	}
	
	public Map getLocales (){
		return locales;
	}
	
	public Collection getUsers() {
		return users;
	}

	public void setUsers(Collection users) {
		this.users = users;
	}
	
	public String getDefaultUsername() {
		return defaultUsername;
	}

	public void setDefaultUsername(String username) {
		this.defaultUsername = username;
	}
	private PortfolioServiceInterface portfolioService;
	
	public PortfolioServiceInterface getPortfolioService( ) 	{
		
		return portfolioService;
		
	}
	public void setPortfolioService( PortfolioServiceInterface portService){
		portfolioService = portService;
	}
	
	

}
