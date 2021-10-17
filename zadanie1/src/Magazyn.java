import java.util.ArrayList;
import java.util.List;

import Przedmioty.Przedmiot;
import Podatki.Podatek;

public class Magazyn {
    List<Przedmiot> przedmioty = new ArrayList<Przedmiot>();
    
    public void dodajDoSpisu(Przedmiot przedmiot) {
        przedmioty.add(przedmiot);
    }

    public float pobierzWatoscPoOpodatkowaniu(Podatek podatek) {
        float wartoscMagazynu = 0;
        for(Przedmiot przedmiot : przedmioty) {
            wartoscMagazynu += przedmiot.okreslWartosc();
        }

        if(podatek != null) {
            return wartoscMagazynu - podatek.obliczPodatek(wartoscMagazynu);
        } else {
            return wartoscMagazynu;
        }
    }

}
