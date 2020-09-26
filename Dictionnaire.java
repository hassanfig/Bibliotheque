
public class Dictionnaire extends Document {

	public String langue;
	
	public Dictionnaire(int numeroEnreg, String titre,String langue) {
		super(numeroEnreg, titre);
		this.langue = langue;
	}
	
	public String langues() {
		return langue;
	}

	public String toString() {
		return super.toString() +" "+ langues(); 
	}
}
