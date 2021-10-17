package Podatki.Kraje;
import Podatki.Podatek;

public class Niemcy implements Kraj {
    String waluta = "euro";

    @Override
    public String getWaluta() {
        return waluta;
    }

    @Override
    public Podatek PodatekLiniowy() {
        return new PodatekLiniowyNiemcy();
    }

    @Override
    public Podatek PodatekProgresywny() {
        return new PodatekProgresywnyNiemcy();
    } 
}

class PodatekLiniowyNiemcy implements Podatek {

    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        return (wartoscMagazynu / 100) * 20; 
    }
}

class PodatekProgresywnyNiemcy implements Podatek {

    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        if(wartoscMagazynu <= 50000) {
            return (wartoscMagazynu / 100) * 20;
        } else {
            return ((wartoscMagazynu - wartoscMagazynu % 50000) / 100 * 20) + ((wartoscMagazynu % 50000) / 100 * 40);

        }
    }
}
