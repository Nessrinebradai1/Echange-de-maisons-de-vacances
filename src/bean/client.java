package bean;
//import validators.ConfirmationMotDePasseValidator;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

//import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;



//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.validator.Email;
import org.hibernate.validator.NotNull;

//import util.HibernateUtils;
//import metier.clientdao;
//@ViewScoped tant ke une meme vue utilisee par meme utilisateur
@ManagedBean
@RequestScoped
@Entity( name = "client" )
public class client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column( name = "ID", unique = true, nullable = false )
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer           idcl;

    // @NotNull
    // @NotEmpty ibernate
    // @NotNull( message = "Veuillez saisir une adresse email" )
    // non nul
    // @Pattern( regexp = "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)", message =
    // "Veuillez saisir une adresse email" )
    public String login;
    @NotNull(message = "Veuillez saisir votre nom" )
    public String nom;
    public String prenom;
    public String sexe;
    public  String datenaissance;
    public String pays;
    public  String region;
    public   Long tel;
    //private String message;
    private String text ;
    //@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
    //message = "Email non valide")
    @Column( name = "email" )
    @NotNull( message = "Veuillez saisir une adresse email" )
    @Pattern( regexp = "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)", message = "Merci de saisir une adresse mail valide" )

    public String email;
    //@NotNull(message = "Mot de passe requis")
    //@Size(min = 4, max = 25, message = "Mot de passe doit étre en 4 et 25 caractéres")
    @NotNull( message = "Veuillez saisir un mot de passe" )
    @Pattern(regexp = ".*(?=.{8,})(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*", message = "Le mot de passe saisi n'est pas assez sécurisé")

    public  String motpasse;
  // public    Timestamp dateInscription;
    private int connect;
   public  client(){}
    
    
   public client(Integer idcl, String nom,  String login, String prenom, String sexe,
			String datenaissance, String pays, String region, Long tel,
			String email, String motpasse,Set<offreBean> offres ) {
		super();
		this.idcl = idcl;
		this.nom = nom;
		this.login = login;
		this.prenom = prenom;
		this.sexe = sexe;
		this.datenaissance = datenaissance;
		this.pays = pays;
		this.region = region;
		this.tel = tel;
		this.email = email;
		this.motpasse = motpasse;
		//this.dateInscription = dateInscription;
		//this.offres=offres;
	}

	public String getWelcomeMessage() {
        return "Hello " + nom;                                    
    }

	
    public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getNom() {
        return nom;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }
    public int getConnect() {
		return connect;
	}


	public void setConnect(int connect) {
		this.connect = connect;
	}
      
	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public String getDatenaissance() {
		return datenaissance;
	}


	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}



	public Long getTel() {
		return tel;
	}


	public void setTel(Long tel) {
		this.tel = tel;
	}

	 @Email(message = "must be a valid email")
	 public String getText() {
	        return text;
	    }
	    public void setText(String text) {
	        this.text = text;
	    }
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMotpasse() {
		return motpasse;
	}


	public void setMotpasse(String motpasse) {
		this.motpasse = motpasse;
	}


	/*public Timestamp getDateInscription() {
		return dateInscription;
	}


	public void setDateInscription(Timestamp dateInscription) {
		this.dateInscription = dateInscription;
	}*/


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;}
	
	

	}
/*public Set<offreBean> getOffres() {
return offres;
}


public void setOffres(Set<offreBean> offres) {
this.offres = offres;
}*/
	


	/*public void add()
    {
        Session session = HibernateUtils.getSession();

        //client p = new client();
        //p.setNom( this.nom );
        //p.setPrenom(this.prenom);
       /* p.setSexe(sexe);
        p.setDatenaissance(datenaissance);
        p.setPays(pays);
        p.setRegion(region);
        p.setTel(tel);
        p.setEmail(email);
        p.setMotpasse(motpasse);
        p.setDateInscription(dateInscription);
        Transaction tx = session.beginTransaction();
        session.save( this );
        tx.commit();
        session.close();
        
    } */

    /*public bonjour TrouverBonjour( String ch )
    {
        bonjour e;
        Session s = HibernateUtils.getSession();
        Query q = s.createQuery( "from Event where nom= :myTitle" );
        q.setString( "myTitle", ch );
        e = (bonjour) q.uniqueResult();

        // Enregistrement de la suppression
        Transaction tx = s.beginTransaction();

        tx.commit();
        s.close();

        return e;

    }

    @Override
    public String toString() {

        StringBuffer strBuff = new StringBuffer();

        strBuff.append( "id : " ).append( getId() );

        strBuff.append( ", name : " ).append( getNom() );

        return strBuff.toString();

    }

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

}
/* http://tahe.developpez.com/java/primefaces/?page=page_6# */
