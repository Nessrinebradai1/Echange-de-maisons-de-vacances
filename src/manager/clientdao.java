package manager;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.persistence.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import bean.*;
import util.HibernateUtils;
import util.util;
@ManagedBean
@SessionScoped

public class clientdao  implements Serializable {

	    private static final long serialVersionUID = 1L;
	    HttpServletRequest request = (HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest();
		HttpSession httpsession = request.getSession();
		
		 Session  session;
	    public Session getSession() {
	        return session;
	    }

	    public void setSession( Session session ) {
	        this.session = session;
	    }

	    private Object  cl= httpsession.getAttribute("client");
	    //private client cl;
	    public clientdao(){
	    	//cl=new client();
	    }
	    private Map<String, String> erreurs = new HashMap<String, String>();
	   

	    public Map<String, String> getErreurs() {
	        return erreurs;
	    }

	    public void setErreurs( Map<String, String> erreurs ) {
	        this.erreurs = erreurs;
	    }

	    public Object getclient() {
	        return cl;
	    }

	    public void setclient( Object cl ) {
	        this.cl = cl;
	    }

	    @SuppressWarnings( "unchecked" )
	    public static ArrayList<client> getlistconnectes() {
	        Session session = HibernateUtils.getSession();
	        Query q = session.createQuery( "from client where connect = :l " );

	        q.setInteger( "l", 1 );

	        ArrayList<client> list = (ArrayList<client>) q.list();

	        session.close();
	        return list;
	    }
	     
	    public void add(client cl) {
	        
	        new util().creer(cl);
	    }
	    
	    
	    public String Connexion(client cl) {
	        cl = new util().find(cl);
	        httpsession.setAttribute("client", cl);
	        if (cl != null) {
	            return "/depot.xhtml";
	        }
	       
	        return "/inscription.xhtml";
	    }
	    
	    /*public client Connecter(client cl)
	    {
	    	Connexion(cl);
	    	return cl;
	    }*/
	    
	    public String logout()
		{
		           FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		        return "login.xhtml";
		}
	    
	}
