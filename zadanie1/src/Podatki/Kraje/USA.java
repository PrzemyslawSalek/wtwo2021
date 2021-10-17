package Podatki.Kraje;
import Podatki.Podatek;

public class USA implements Kraj {
    String waluta = "dolar";

    @Override
    public String getWaluta() {
        return waluta;
    }

    @Override
    public Podatek PodatekLiniowy() {
        return new PodatekLiniowyUSA();
    }

    @Override
    public Podatek PodatekProgresywny() {
        return new PodatekProgresywnyUSA();
    }
}

class PodatekLiniowyUSA implements Podatek {

    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        return (wartoscMagazynu / 100) * 10; 
    }
}

class PodatekProgresywnyUSA implements Podatek {

    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        return (wartoscMagazynu / 100) * 10;
    }
}
