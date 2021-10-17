import Podatki.Podatek;

public class MagazynAdapter extends Magazyn {
    public float pobierzWatoscPoOpodatkowaniuEuro(Podatek podatek, String waluta) {
        switch(waluta) {
            case "zloty":
                return super.pobierzWatoscPoOpodatkowaniu(podatek) / (float) 4.2;
            case "dolar":
                return (super.pobierzWatoscPoOpodatkowaniu(podatek) / (float) 3.8) * (float) 3;
            default:
                return super.pobierzWatoscPoOpodatkowaniu(podatek);
        }
    }
}
