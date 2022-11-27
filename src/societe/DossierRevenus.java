package societe;


public class DossierRevenus extends Dossier{
	private double ca;
	

	public DossierRevenus(long id,double ca) {
		super(id);
		this.ca=ca;
		
	}

	@Override
	protected void calculerMontant() {
		montant=ca*15/100;
		
		
	}

	@Override
	public String toString() {
		calculerMontant();
		return "15 % de revenus "+this.ca+ ", Montant :  "+ montant;
	}
	
}
