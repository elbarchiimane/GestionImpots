package societe;

public class DossierVehicule extends Dossier{
	private int nb_chevaux;
	private char categorie;

	public DossierVehicule(long id,int nbc,char cat) {
		super(id);
		this.nb_chevaux=nbc;
		this.categorie=cat;
		
	}

	@Override
	protected void calculerMontant() {
		if(nb_chevaux <8 && categorie=='E')     montant=350;
		else if(nb_chevaux<8 && categorie=='G') montant=700;
		else if(8 <= nb_chevaux  && nb_chevaux < 10 && categorie=='E') montant=650;
		else if( 8 <= nb_chevaux  && nb_chevaux < 10 && categorie=='G') montant=1500;
		else if(11 <= nb_chevaux  && nb_chevaux < 14 && categorie=='E') montant=3000;
		else if(11 <= nb_chevaux  && nb_chevaux < 14 && categorie=='G') montant=6000;
		else if(15<= nb_chevaux   && categorie=='E') montant=8000;
		else if(15 <= nb_chevaux   && categorie=='G') montant=20000;
	}

	@Override
	public String toString() {
		calculerMontant();
		return "Vehicule " + this.categorie + " " + this.nb_chevaux + " CH, montant : "+ montant;
	}
	
	

}
