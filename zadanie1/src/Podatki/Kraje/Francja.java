package Podatki.Kraje;
import Podatki.Podatek;

public class Francja implements Kraj {
    String waluta = "euro";

    @Override
    public String getWaluta() {
        return waluta;
    }

    @Override
    public Podatek PodatekLiniowy() {
        return new PodatekLiniowyFrancja();
    }

    @Override
    public Podatek PodatekProgresywny() {
        return new PodatekProgresywnyFrancja();
    }
}

class PodatekLiniowyFrancja implements Podatek {

    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        return (wartoscMagazynu / 100) * 30; 
    }
}

class PodatekProgresywnyFrancja implements Podatek {

    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        if(wartoscMagazynu <= 40000) {
            return (wartoscMagazynu / 100) * 30;
        } else {
            return ((wartoscMagazynu - wartoscMagazynu % 40000) / 100 * 30) + ((wartoscMagazynu % 40000) / 100 * 50);

        }
    }
}
