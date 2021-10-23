package Formaty;

public abstract class Format {
    private String naglowek;
    private String tagi;
    private String body;

    public String getNaglowek() {
        return naglowek;
    }
    public void setNaglowek(String naglowek) {
        this.naglowek = naglowek;
    }
    public String getTagi() {
        return tagi;
    }
    public void setTagi(String tagi) {
        this.tagi = tagi;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public void opis() {
        System.out.println("Nagłówek: " + naglowek);
        System.out.println("Tagi: " + tagi);
        System.out.println("Body: " + body);
    }

    public abstract void przedstawSie();
}
