
public class Etat {

    //Attributs
    private int idEtat;
    private String libelle;

    //Constructeurs
    public Etat() {

    }

    public Etat(int unIdEtat, String unLibelle) {
        this.idEtat = unIdEtat;
        this.libelle = unLibelle;
    }

    //Getters et Setters
    public int getIdEtat(){
        return idEtat;
    }
    public void setIdEtat(int unIdEtat){
        this.idEtat = unIdEtat;
    }

    public String getLibelle(){
        return libelle;
    }
    public void setLibelle(String unLibelle){
        this.libelle = unLibelle;
    }

}
