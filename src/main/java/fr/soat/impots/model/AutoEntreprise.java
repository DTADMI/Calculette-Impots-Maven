package fr.soat.impots.model;

public class AutoEntreprise extends Entreprise {

    private static final int TAUX_IMPOSITION_AUTO = 25;

    private String siret;
    private String denomination;

    public AutoEntreprise(String siret, String denomination) {
        super();
        this.siret = siret;
        this.denomination = denomination;
    }

    @Override
    public int getTauxImposition() {
        return TAUX_IMPOSITION_AUTO;
    }

    public String getSiret() {
        return siret;
    }

    public String getDenomination() {
        return denomination;
    }
}
