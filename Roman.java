
public class Roman extends Livre{
	public int prixLitt;
	public Roman(int numeroEnreg, String titre, String auteur, int nbrPages, int prixLitt) {
		super(numeroEnreg, titre, auteur, nbrPages);
		this.prixLitt = prixLitt;
	}
	public int prix() {
		return prixLitt;
	}
	public String toString() {
		return super.toString() +"prix : "+prixLitt;
	}
}
