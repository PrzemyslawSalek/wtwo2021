package Podatki.Kraje;
import Podatki.Podatek;

public class Polska implements Kraj {

    @Override
    public Podatek PodatekLiniowy() {
        return new PodatekLiniowyPolska();
    }

    @Override
    public Podatek PodatekProgresywny() {
        return new PodatekProgresywnyPolska();
    }
}

class PodatekLiniowyPolska implements Podatek {

    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        return (wartoscMagazynu / 100) * 19; 
    }
}

class PodatekProgresywnyPolska implements Podatek {

    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        if(wartoscMagazynu <= 10000) {
            return (wartoscMagazynu / 100) * 18;
        } else {
            return ((wartoscMagazynu - wartoscMagazynu % 10000) / 100 * 18) + ((wartoscMagazynu % 10000) / 100 * 32);
        }
    }
}
