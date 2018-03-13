package manager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.*;


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

import util.HibernateUtils;
@ManagedBean
@SessionScoped
public class offrecontrol implements Serializable {

	    private static final long serialVersionUID = 1L;
	    /*HttpServletRequest request = (HttpServletRequest) FacesContext
	    		.getCurrentInstance().getExternalContext().getRequest();
	          HttpSession httpsession = request.getSession();
	         private Object cl=(bean.client) httpsession.getAttribute("client");*/
	          //private client cl;
	        // private int id;
	          public Session getSession() {
	        return session;
	    }

	    public void setSession( Session session ) {
	        this.session = session;
	    }

	    private offreBean off;
	  
	    private Map<String, String> erreurs = new HashMap<String, String>();
	    Session                     session;

	    public Map<String, String> getErreurs() {
	        return erreurs;
	    }

	    public void setErreurs( Map<String, String> erreurs ) {
	        this.erreurs = erreurs;
	    }
	    

	 /* public client getcl() {
			return cl;
		}

		public void setcl(client cl) {
			this.cl = cl;
		}*/

		public offreBean getOff() {
			return off;
		}

		public void setOff(offreBean off) {
			this.off = off;
		}

		

		

		public void creer(offreBean off ) {
	        Session session = HibernateUtils.getSession();

	     Transaction tx = session.beginTransaction();
	    
	        session.save(off );
	       // session.persist(off);
	        tx.commit();
	        session.close();

	    }

}

	 