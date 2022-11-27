package societe;

public abstract  class Dossier {
	
	private long id;
	protected double montant;
	public Dossier(long id) {
		this.id = id;
	}
	
	protected abstract void calculerMontant();
	

}
