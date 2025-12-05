
public class Taille {

	// Attributs
	private int idTaille;
	private String libelle;

	// Constructeurs
	public Taille() {

	}

	public Taille(int unIdTaille, String unLibelle) {
		this.idTaille = unIdTaille;
		this.libelle = unLibelle;
	}

	// Getters et Setters
	public int getIdTaille() {
		return idTaille;
	}
	public void setIdTaille(int unIdTaille) {
		this.idTaille = unIdTaille;
	}

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String unLibelle) {
		this.libelle = unLibelle;
	}

}
