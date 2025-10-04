package inheritance.multilevel;

class Kakek {
    void sifatKakek() {
        System.out.println("Kakek bijaksana dan penyayang.");
    }
}

class Ayah extends Kakek {
    void sifatAyah() {
        System.out.println("Ayah pekerja keras dan disiplin.");
    }
}

class Anak extends Ayah {
    void sifatAnak() {
        System.out.println("Anak rajin belajar dan mengikuti sifat ayah.");
    }
}

public class Main {
    public static void main(String[] args) {
        Anak anak1 = new Anak();
        anak1.sifatKakek();
        anak1.sifatAyah();
        anak1.sifatAnak();
    }
}
