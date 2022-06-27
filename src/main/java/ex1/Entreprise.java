package ex1;

import java.util.Date;


/**
 * Classe de creation de profil entreprise
 * @author Fork
 *
 */
public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;
	
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * permet d'afficher le statut du compte
	 */
	public void afficherStatut() {
		System.out.println("statut du compte");
	}
	
}
