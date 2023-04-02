package Singleton.Singleton2;

import java.util.Arrays;

public class Firma {
    private static Firma instance = null;

    private int Nrid = 20;
    private boolean obtinereID[] = new boolean[Nrid];

    private Firma() throws Exception {
        if (instance != null)
            throw new Exception("Obiect deja creat");
    }

    public static Firma getInstance() throws Exception {
        if (instance == null){
            instance = new Firma();
        }
        return instance;
    }

    public void setObtinereID(int i) {
        if (i > 0 && i < Nrid && obtinereID[i] == false) {
            obtinereID[i] = true;
        }
    }
    @Override
    public String toString() {
        return "Firma{" +
                "id=" + Nrid +
                ", obtinereID=" + Arrays.toString(obtinereID) +
                '}';
    }
}
