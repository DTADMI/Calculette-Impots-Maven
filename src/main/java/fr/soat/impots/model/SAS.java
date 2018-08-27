package fr.soat.impots.model;

public class SAS extends Entreprise {

    private static final int TAUX_IMPOSITION_SAS = 33;
    private String siret;
    private String denomination;
    private String adresseSiegeSocial;

    public SAS(String siret, String denomination, String adresseSiegeSocial) {
        super();
        this.siret = siret;
        this.denomination = denomination;
        this.adresseSiegeSocial = adresseSiegeSocial;
    }

    @Override
    public int getTauxImposition() {
        return TAUX_IMPOSITION_SAS;
    }

    public String getSiret() {
        return siret;
    }

    public String getDenomination() {
        return denomination;
    }

    public String getAdresseSiegeSocial() {
        return adresseSiegeSocial;
    }
}
