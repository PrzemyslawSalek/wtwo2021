package Budowniczy;

import Formaty.Format;

public abstract class BudowniczyFormatu {
    public Format format;

    public abstract void budujNaglowek();
    public abstract void budujTagi();
    public abstract void budujBody(int[] liczby);

    public Format getFormat() {
        return format;
    }
}
