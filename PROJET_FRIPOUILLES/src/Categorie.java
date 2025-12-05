
public class Categorie {

    //Attributs
    private int idCategorie;
    private String libelle;

    //Constructeurs
    public Categorie() {

    }

    public Categorie(int unIdCategorie, String unLibelle) {
        this.idCategorie = unIdCategorie;
        this.libelle = unLibelle;
    }

    //Getters et Setters
    public int getIdCategorie(){
        return idCategorie;
    }
    public void setIdCategorie(int unIdCategorie){
        this.idCategorie = unIdCategorie;
    }

    public String getLibelle(){
        return libelle;
    }
    public void setLibelle(String unLibelle){
        this.libelle = unLibelle;
    }

}
