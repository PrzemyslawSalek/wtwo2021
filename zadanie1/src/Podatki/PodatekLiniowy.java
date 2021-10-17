package Podatki;

public class PodatekLiniowy implements Podatek {

    @Override
    public float obliczPodatek(float wartoscMagazynu) {
        return (wartoscMagazynu / 100) * 19; 
    }
    
}
