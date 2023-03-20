//O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei. Sistemul trebuie sa asigure adaugarea si
//modificarea datelor despre masinile fabricate la nivelul sediului central, intr-un mediu securizat
//(Sistemul va exista sub forma unui server dispus in datacenter-ul din HQ). Programatorii trebuie sa se asigure ca sistemul va putea fi replicat
//si ca toate datele vor putea fi manageriate prin intermediul singurului server mentionat anterior

public class FabricaMasini {

    private static FabricaMasini instance = null;

    private FabricaMasini(){}

    public static FabricaMasini getInstance(){
        if(instance == null){
            instance = new FabricaMasini();
        }
        return instance;
    }
}

