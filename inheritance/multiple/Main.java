package inheritance.multiple;

// Java tidak mendukung multiple inheritance langsung (pakai interface)
interface SifatIbu {
    void sifatIbu();
}

interface SifatAyah {
    void sifatAyah();
}

class Anak implements SifatIbu, SifatAyah {
    public void sifatIbu() {
        System.out.println("Anak mewarisi sifat ibu yang penyayang.");
    }

    public void sifatAyah() {
        System.out.println("Anak mewarisi sifat ayah yang disiplin.");
    }
}

public class Main {
    public static void main(String[] args) {
        Anak anak1 = new Anak();
        anak1.sifatIbu();
        anak1.sifatAyah();
    }
}
