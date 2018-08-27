package fr.soat.impots;

import fr.soat.impots.model.Entreprise;

class CalculetteImpots {
    static long calculImpotEntreprise(Entreprise entreprise, long CA) {
        return CA*entreprise.getTauxImposition()/100;
    }
}
