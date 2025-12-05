
public class Couleur {

    //Attributs
    private int idCouleur;
    private String libelle;

    //Constructeurs
    public Couleur() {

    }

    public Couleur(int unIdCouleur, String unLibelle) {
        this.idCouleur = unIdCouleur;
        this.libelle = unLibelle;
    }

    //Getters et Setters
    public int getIdCouleur(){
        return idCouleur;
    }
    public void setIdCouleur(int unIdCouleur){
        this.idCouleur = unIdCouleur;
    }

    public String getLibelle(){
        return libelle;
    }
    public void setLibelle(String unLibelle){
        this.libelle = unLibelle;
    }

}
