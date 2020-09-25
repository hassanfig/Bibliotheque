public class Document {
	public int numeroEnreg;
	public String titre;
	
	public Document(int numeroEnreg, String titre) {
		this.numeroEnreg =numeroEnreg;
		this.titre = titre;
	}
	public int numeroEnreg() {
		return numeroEnreg;
	}
	public String titre() {
		 return titre;
	}
	public String toString() {
		return "[ titre :"+titre +"numero d' enregistrement :" + numeroEnreg +" ]" ;
	}
	public boolean equals (Object obj) {
		return ((Document) obj).numeroEnreg == numeroEnreg;
	}
}
