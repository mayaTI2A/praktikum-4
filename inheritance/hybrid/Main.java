package inheritance.hybrid;

class Kakek {
    void sifatKakek() {
        System.out.println("Kakek bijaksana.");
    }
}

class Ayah extends Kakek {
    void sifatAyah() {
        System.out.println("Ayah pekerja keras.");
    }
}

interface Ibu {
    void sifatIbu();
}

class AnakLaki extends Ayah implements Ibu {
    public void sifatIbu() {
        System.out.println("Anak juga penyayang seperti Ibu.");
    }

    void sifatAnak() {
        System.out.println("Anak rajin dan berprestasi.");
    }
}

public class Main {
    public static void main(String[] args) {
        AnakLaki anak = new AnakLaki();
        anak.sifatKakek();
        anak.sifatAyah();
        anak.sifatIbu();
        anak.sifatAnak();
    }
}
