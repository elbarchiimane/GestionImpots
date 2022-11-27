package societe;

import java.util.ArrayList;
import java.util.List;

public class Impots {
	private int annee;
	private double totalImpot;
	private List<Dossier> listeDossier=new ArrayList<>();
	public Impots(int annee) {
		this.annee = annee;
	}
	
	public void add(Dossier d) {
		listeDossier.add(d);
	}

	public int getAnnee() {
		return this.annee;
	}

	@Override
	public String toString() {
		String detail="Liste des Impots "+this.annee+"\n";
		for(Dossier d: listeDossier) {
			
			 detail+=d+" \n";
			 totalImpot+=d.montant;
		}
			
		
		return detail +"\n Total :"+totalImpot;
	}
	

	
	
	

}
