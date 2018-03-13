package util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
//import org.hibernate.criterion.Restrictions;

import bean.client;

public class util {
	
	Session s;
    public util() {
    }
    
    public client find(client us) {
	        s = HibernateUtils.getSession();
	        Transaction t = s.beginTransaction();
	       /* client u =(client) s.createCriteria(client.class)
	                .add(Restrictions.eq("email", us.getEmail()))
	                .add(Restrictions.eq("motpasse", us.getMotpasse()))
	                .setMaxResults(1)
	                .uniqueResult();
	        
	       t.commit();*/
	        
	        Query query=s.createQuery("from client where login='"+us.login+"' and motpasse='"+us.motpasse+"'");
	       
	        return (client) query.uniqueResult();
	    }
    
    
    public void creer(client cl ) {
        s = HibernateUtils.getSession();

     Transaction tx = s.beginTransaction();
        s.save( cl );
        tx.commit();
      s.close();

    }
    }
