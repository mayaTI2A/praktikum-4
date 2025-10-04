package inheritance.single;

// class parent
class Ayah {
    void sifatAyah() {
        System.out.println("Ayah disiplin dan bertanggung jawab.");
    }
}

// class child
class Anak extends Ayah {
    void sifatAnak() {
        System.out.println("Anak rajin dan mengikuti sifat ayah.");
    }
}

// class main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Anak anak1 = new Anak();
        anak1.sifatAyah();
        anak1.sifatAnak();
    }
}
