public abstract class Secretaire extends Utilisateur {

    //Attributs
    private Vente uneVente;

    //Constructeurs
    public Secretaire() {

    }

    public Secretaire(int unIdUser, String unLogin, String unMdp, String unNom, String unPrenom, String unMail, String unRole) {
        super(unIdUser, unLogin, unMdp, unNom, unPrenom, unMail, unRole);
    }

    //Getters et Setters
    public Vente getUneVente() {
        return uneVente;
    }

    public void setUneVente(Vente uneVente) {
        this.uneVente = uneVente;
    }

    //Méthodes
   


}
