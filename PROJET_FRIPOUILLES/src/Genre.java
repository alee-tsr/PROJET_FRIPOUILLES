
public class Genre {

    //Attributs
    private int idGenre;
    private String libelle;

    //Constructeurs
    public Genre() {

    }

    public Genre(int unIdGenre, String unLibelle) {
        this.idGenre = unIdGenre;
        this.libelle = unLibelle;
    }

    //Getters et Setters
    public int getIdGenre(){
        return idGenre;
    }
    public void setIdGenre(int unIdGenre){
        this.idGenre = unIdGenre;
    }

    public String getLibelle(){
        return libelle;
    }
    public void setLibelle(String unLibelle){
        this.libelle = unLibelle;
    }

}
