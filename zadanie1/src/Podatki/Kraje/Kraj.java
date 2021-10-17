package Podatki.Kraje;
import Podatki.Podatek;

public interface Kraj {

    String getWaluta();
    Podatek PodatekLiniowy();
    Podatek PodatekProgresywny();
}

