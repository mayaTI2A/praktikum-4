package inheritance.hierarchical;

class Ayah {
    void sifatAyah() {
        System.out.println("Ayah bijaksana dan bertanggung jawab.");
    }
}

class AnakLaki extends Ayah {
    void sifatAnakLaki() {
        System.out.println("Anak laki-laki pemberani.");
    }
}

class AnakPerempuan extends Ayah {
    void sifatAnakPerempuan() {
        System.out.println("Anak perempuan penyayang.");
    }
}

public class Main {
    public static void main(String[] args) {
        AnakLaki anakL = new AnakLaki();
        AnakPerempuan anakP = new AnakPerempuan();

        anakL.sifatAyah();
        anakL.sifatAnakLaki();

        anakP.sifatAyah();
        anakP.sifatAnakPerempuan();
    }
}
