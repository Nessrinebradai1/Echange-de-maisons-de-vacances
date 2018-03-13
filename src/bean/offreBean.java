package bean;
//import  models.Offre;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.html.HtmlPanelGrid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.client;

import util.HibernateUtils;






/*import dao.OffreDao;
import daoImpl.OffreDaoImpl;
import models.Offre;*/
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
 






import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
 

@ManagedBean
@RequestScoped
@Entity( name = "offre" )
public class offreBean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column( name = "IDoff", unique = true, nullable = false )
    @GeneratedValue( strategy = GenerationType.AUTO )
 
	private int idOfr;
    private String login;
	private String nomOfr;
	private String nomdeposeur;
	private String naturebiens;
	private String zonegeographique;
	private String datedispo1;
	private String datedispo2;
	private String conditionsechange;
	private String emaildeposeur;
	private String prenomdeposeur;
	private Long  teldeposeur;
	private String paysOfr;
	private String regionofr;
	private String piecesdispo;
	private String paysvoulu;
	private String minpiecevoulu;
	private String regionvoulu;
	private String naturebienvoulu;
	
	/*@ManyToOne(targetEntity=bean.client.class)
    @JoinColumn(name="idclient", nullable=false)
	private client client;*/
	  /* HttpServletRequest request = (HttpServletRequest) FacesContext
		.getCurrentInstance().getExternalContext().getRequest();
      HttpSession httpsession = request.getSession();
      
      @ManyToOne(targetEntity=bean.client.class) 
  //	@JoinColumn(name="idClient", nullable=false)
	private client client=(bean.client) httpsession.getAttribute("client"); 
      //client=(bean.client) httpsession.getAttribute("client");*/
	
	
	//private Offre offre;
	//private transient OffreDao daoService;
    //private transient HtmlDataTable listTable;
    //private transient HtmlPanelGrid offreGrid;
     
	//private Map<String,String> naturebien = new HashMap<String, String>();
	//private Map<String,String> minpieces = new HashMap<String, String>();
    //private List<Offre> listOffre;
 
    public offreBean() {
       /* naturebien.put("Maison", "Maison");
        naturebien.put("Studio", "Studio");
        naturebien.put("Appartement", "Appartement");
        
        /*minpieces.put("S+1+Salle de bain+cuisine", "S1");
        minpieces.put("S+2+Salle de bain+cuisine", "S2");
        minpieces.put("S+3+Salle de bain+cuisine", "S3");
        minpieces.put("S+3+Salle de bain+cuisine+", "S33");*/
        
    //public HtmlPanelGrid getOffreGrid() {
        //return offreGrid;
    }
 
    /*public void setOffreGrid(HtmlPanelGrid offreGrid) {
        this.offreGrid = offreGrid;
    }*/
    
    
    
    /*public Offre getOffre() {
        return offre;
    }
 
    public void setOffre(Offre offre) {
        this.offre = offre;
    }*/
 
    
    public String getNaturebienvoulu() {
		return naturebienvoulu;
	}

	public void setNaturebienvoulu(String nature_bien_voulu) {
		this.naturebienvoulu = nature_bien_voulu;
	}
    
    
   
    


	/*public Map<String, String> getNaturebien() {
		return naturebien;
	}

	public void setNaturebien(Map<String, String> naturebien) {
		this.naturebien = naturebien;
	}

	
	
	
	/*public Map<String, String> getMinpieces() {
		return minpieces;
	}

	public void setMinpieces(Map<String, String> minpieces) {
		this.minpieces = minpieces;
	}*/

	
	public String getNomOfr() {
		return nomOfr;
	}

	public void setNomOfr(String nom_Ofr) {
		this.nomOfr = nom_Ofr;
	}

	public String getNomdeposeur() {
		return nomdeposeur;
	}

	public void setNomdeposeur(String nom_deposeur) {
		this.nomdeposeur = nom_deposeur;
	}

	public String getNaturebiens() {
		return naturebiens;
	}

	public void setNaturebiens(String nature_bien) {
		this.naturebiens = nature_bien;
	}

	public String getZonegeographique() {
		return zonegeographique;
	}

	public void setZonegeographique(String zone_geographique) {
		this.zonegeographique = zone_geographique;
	}

	public String getDatedispo1() {
		return datedispo1;
	}

	public void setDatedispo1(String date_dispo1) {
		this.datedispo1 = date_dispo1;
	}

	public String getDatedispo2() {
		return datedispo2;
	}

	public void setDatedispo2(String date_dispo2) {
		this.datedispo2 = date_dispo2;
	}

	public String getConditionsechange() {
		return conditionsechange;
	}

	public void setConditionsechange(String conditions_echange) {
		this.conditionsechange = conditions_echange;
	}

	public String getEmaildeposeur() {
		return emaildeposeur;
	}

	public void setEmaildeposeur(String email_deposeur) {
		this.emaildeposeur = email_deposeur;
	}

	public String getPrenomdeposeur() {
		return prenomdeposeur;
	}

	public void setPrenomdeposeur(String prenom_deposeur) {
		this.prenomdeposeur = prenom_deposeur;
	}

	public Long getTeldeposeur() {
		return teldeposeur;
	}

	public void setTeldeposeur(Long tel_deposeur) {
		this.teldeposeur = tel_deposeur;
	}

	public String getPaysOfr() {
		return paysOfr;
	}

	public void setPaysOfr(String pays_Ofr) {
		this.paysOfr = pays_Ofr;
	}

	public String getRegionofr() {
		return regionofr;
	}

	public void setRegionofr(String region_ofr) {
		this.regionofr = region_ofr;
	}

	public String getPiecesdispo() {
		return piecesdispo;
	}

	public void setPiecesdispo(String pieces_dispo) {
		this.piecesdispo = pieces_dispo;
	}

	public String getPaysvoulu() {
		return paysvoulu;
	}

	public void setPaysvoulu(String pays_voulu) {
		this.paysvoulu = pays_voulu;
	}

	public String getMinpiecevoulu() {
		return minpiecevoulu;
	}

	public void setMinpiecevoulu(String min_piece_voulu) {
		this.minpiecevoulu = min_piece_voulu;
	}

	public String getRegionvoulu() {
		return regionvoulu;
	}

	public void setRegionvoulu(String region_voulu) {
		this.regionvoulu = region_voulu;
	}

	
	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public offreBean(int id_Ofr, String nom_Ofr, String nom_deposeur,
			String nature_bien, String zone_geographique, String date_dispo1,
			String date_dispo2, String conditions_echange,
			String email_deposeur, String prenom_deposeur, Long tel_deposeur,
			String pays_Ofr, String region_ofr, String pieces_dispo,
			String pays_voulu, String min_piece_voulu, String region_voulu,
			String nature_bien_voulu,String login) {
		super();
		this.idOfr = id_Ofr;
		this.nomOfr = nom_Ofr;
		this.nomdeposeur = nom_deposeur;
		this.naturebiens = nature_bien;
		this.zonegeographique = zone_geographique;
		this.datedispo1 = date_dispo1;
		this.datedispo2 = date_dispo2;
		this.conditionsechange = conditions_echange;
		this.emaildeposeur = email_deposeur;
		this.prenomdeposeur = prenom_deposeur;
		this.teldeposeur = tel_deposeur;
		this.paysOfr = pays_Ofr;
		this.regionofr = region_ofr;
		this.piecesdispo = pieces_dispo;
		this.paysvoulu = pays_voulu;
		this.minpiecevoulu = min_piece_voulu;
		this.regionvoulu = region_voulu;
		this.naturebienvoulu = nature_bien_voulu;
		this.login=login;
		//this.client = client;
		//this.naturebien = naturebien;
		//this.minpieces = minpieces;
	}
	 
	/*public client getClient() {
		return client;
	}

	public void setClient(client client) {
		this.client = client;
	}*/
}


	/*public List<Offre> getListOffre() {
		return listOffre;
	}

	public void setListOffre(List<Offre> listOffre) {
		this.listOffre = listOffre;
	}*/
	
	
	

	/*@Override
	public String toString() {
		return "OffreBean [id_Ofr=" + id_Ofr + ", nom_Ofr=" + nom_Ofr
				+ ", nom_deposeur=" + nom_deposeur + ", nature_bien="
				+ nature_bien + ", zone_geographique=" + zone_geographique
				+ ", date_dispo1=" + date_dispo1 + ", date_dispo2="
				+ date_dispo2 + ", conditions_echange=" + conditions_echange
				+ ", email_deposeur=" + email_deposeur + ", prenom_deposeur="
				+ prenom_deposeur + ", tel_deposeur=" + tel_deposeur
				+ ", pays_Ofr=" + pays_Ofr + ", region_ofr=" + region_ofr
				+ ", pieces_dispo=" + pieces_dispo + ", pays_voulu="
				+ pays_voulu + ", min_piece_voulu=" + min_piece_voulu
				+ ", region_voulu=" + region_voulu + ", offre=" + offre
				+ ", listOffre=" + listOffre + ", getOffre()=" + getOffre()
				+ ", getId_Ofr()=" + getId_Ofr() + ", getNom_Ofr()="
				+ getNom_Ofr() + ", getNom_deposeur()=" + getNom_deposeur()
				+ ", getNature_bien()=" + getNature_bien()
				+ ", getZone_geographique()=" + getZone_geographique()
				+ ", getDate_dispo1()=" + getDate_dispo1()
				+ ", getDate_dispo2()=" + getDate_dispo2()
				+ ", getConditions_echange()=" + getConditions_echange()
				+ ", getEmail_deposeur()=" + getEmail_deposeur()
				+ ", getPrenom_deposeur()=" + getPrenom_deposeur()
				+ ", getTel_deposeur()=" + getTel_deposeur()
				+ ", getPays_Ofr()=" + getPays_Ofr() + ", getRegion_ofr()="
				+ getRegion_ofr() + ", getPieces_dispo()=" + getPieces_dispo()
				+ ", getPays_voulu()=" + getPays_voulu()
				+ ", getMin_piece_voulu()=" + getMin_piece_voulu()
				+ ", getRegion_voulu()=" + getRegion_voulu()
				+ ", getListOffre()=" + getListOffre() + ", add()=" + add()
				+ ", initList()=" + initList() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	*/
	
	
/*	

	public OffreBean(int id_Ofr, String nom_Ofr, String nom_deposeur,
			String nature_bien, String zone_geographique, String date_dispo1,
			String date_dispo2, String conditions_echange,
			String email_deposeur, String prenom_deposeur, Long tel_deposeur,
			String pays_Ofr, String region_ofr, String pieces_dispo,
			String pays_voulu, String min_piece_voulu, String region_voulu,
			Offre offre, List<Offre> listOffre) {
		super();
		this.id_Ofr = id_Ofr;
		this.nom_Ofr = nom_Ofr;
		this.nom_deposeur = nom_deposeur;
		this.nature_bien = nature_bien;
		this.zone_geographique = zone_geographique;
		this.date_dispo1 = date_dispo1;
		this.date_dispo2 = date_dispo2;
		this.conditions_echange = conditions_echange;
		this.email_deposeur = email_deposeur;
		this.prenom_deposeur = prenom_deposeur;
		this.tel_deposeur = tel_deposeur;
		this.pays_Ofr = pays_Ofr;
		this.region_ofr = region_ofr;
		this.pieces_dispo = pieces_dispo;
		this.pays_voulu = pays_voulu;
		this.min_piece_voulu = min_piece_voulu;
		this.region_voulu = region_voulu;
		this.offre = offre;
		this.listOffre = listOffre;
		}*/
	/* public String add() {
	        offre = new Offre(nom_Ofr, nom_deposeur, nature_bien, zone_geographique, date_dispo1,date_dispo2, conditions_echange,email_deposeur,
	        		prenom_deposeur, tel_deposeur, pays_Ofr,region_ofr  );
	 
	 daoService = new OffreDaoImpl();
        daoService.saveOrUpdateOffre(offre);
        setMessage("Offre ajoutée !");
        return "Ajouté_ok";
    }
 
    //@PostConstruct
    public String initList() {
        daoService = new OffreDaoImpl();
        listOffre = daoService.listOffre();
        System.out.println("ffff");
        return "listeOffre";
    }
 
    public void deletOffre(int id_Ofr) {
 
        daoService = new OffreDaoImpl();
        if (id_Ofr != 0) {
 
            daoService.deleteOffre(id_Ofr);
        }
        offre = (Offre) getListTable().getRowData();
        listOffre.remove(offre);
    }
    */
	/*public void add()
    {
        SessionFactory session = HibernateUtil.getSessionFactory();
        Transaction tx = session.beginTransaction();
        session.save( this );
        tx.commit();
        session.close();
        
    }*/
	
	
	/*public String add() {
        offre = new Offre(nom_Ofr, date_dispo1);
 
        daoService = new OffreDAOImpl();
        daoService.saveOrUpdateProduit(produit);
        setMessage("Produit ajouté");
        return "Ajouté_ok";
    }

	private void setMessage(String string) {
		// TODO Auto-generated method stub
		
	}*/
	
	 
	