package Podatki;

public class PodatekProgresywny implements Podatek {
    
    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        if(wartoscMagazynu <= 10000) {
            return (wartoscMagazynu / 100) * 18;
        } else {
            return ((wartoscMagazynu - wartoscMagazynu % 10000) / 100 * 18) + ((wartoscMagazynu % 10000) / 100 * 32);
        }
    }
}
