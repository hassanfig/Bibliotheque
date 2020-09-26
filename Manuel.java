
public class Manuel extends Livre {
	int niveau;
	public Manuel(int numeroEnreg, String titre, String auteur, int nbrPages, int niveau) {
		super(numeroEnreg, titre, auteur, nbrPages);
		this.niveau = niveau;
	}
	public int niveau() {
		return niveau;
	}
	
	public String toString() {
		return super.toString() + "- niveau : "+niveau+"°";
	}

}
