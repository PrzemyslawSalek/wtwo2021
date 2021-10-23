package Budowniczy;

import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.zip.Deflater;

import Formaty.Mp3;

public class BudowniczyMp3 extends BudowniczyFormatu {
    public BudowniczyMp3() {
        format = new Mp3();
    }

    @Override
    public void budujNaglowek() {
        format.setNaglowek("Mp3Header");
    }

    @Override
    public void budujTagi() {
        format.setTagi("Mp3Tags");
    }

    @Override
    public void budujBody(int[] liczby) {
        try {
            byte[] bytes = new byte[liczby.length];
            for (int i = 0; i < liczby.length; i++) {
                bytes[i] = (byte)liczby[i];
            }

            ByteArrayOutputStream baos = null;
            Deflater dfl = new Deflater();
            dfl.setLevel(Deflater.BEST_COMPRESSION);
            dfl.setInput(bytes);
            dfl.finish();
            baos = new ByteArrayOutputStream();
            byte[] tmp = new byte[4*1024];
            try{
                while(!dfl.finished()){
                    int size = dfl.deflate(tmp);
                    baos.write(tmp, 0, size);
                }
            } catch (Exception ex){
                 
            } finally {
                try{
                    if(baos != null) baos.close();
                } catch(Exception ex){}
            }
             
            byte[] zipped = baos.toByteArray();

            format.setBody(Base64.getEncoder().encodeToString(zipped));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
