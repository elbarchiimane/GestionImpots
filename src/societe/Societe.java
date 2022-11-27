package societe;

import java.util.ArrayList;
import java.util.List;

public class Societe {
	
	private long id;
	private String raison_social;
	private List<Impots> listeImpots= new ArrayList<>();
	
	public Societe(long id, String raison_social) {
		this.id = id;
		this.raison_social = raison_social;
	}
	
	public Impots getImpots(int annee) {
		Impots resultat=null;
		
		for(Impots imp: listeImpots ) 
			if(imp.getAnnee()==annee) {
				resultat=imp;
			}			
		return resultat;
	}
	
	
	
	
	public void add(Impots imp) {
	
		listeImpots.add(imp);
	}

	public String toString() {
		return "Societe:"+id+" - "+raison_social;
	}
	
	
}
