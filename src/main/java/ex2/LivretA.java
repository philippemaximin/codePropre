package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	
	/**
	 * Constructeur
	 * @param solde
	 * @param decouvert
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, decouvert);
		setTauxRemuneration(tauxRemuneration);
	}
	
	
	public void appliquerRemuAnnuelle(){
		setSolde( getSolde()+(getSolde()*tauxRemuneration/100) );
	}
	
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (getSolde() - montant > 0) {
			setSolde( getSolde() - montant);
		}	
	}
	
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
