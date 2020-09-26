
public class Revue extends Document {
	
	public int mois; 
	public int annee;
	
	public Revue(int numeroEnreg, String titre, int mois, int annee) {
		super(numeroEnreg, titre);
		this.annee = annee;
		this.mois = mois;
	}
	
	public int mois() {
		return mois;
	}
	
	public int annee() {
		return annee;
	}
	
	public String toString() {
		return super.toString() + "mois : "+ mois +"/"+annee;
	}

}
