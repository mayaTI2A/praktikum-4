public class AkunBankTest {
    public static void main(String[] args) {
        
        AkunBank akun1 = new AkunBank(0);
        AkunBank akun2 = new AkunBank(0);
        AkunBank akun3 = new AkunBank(0);

        akun1.setSaldo(20);
        System.out.println("Saldo akun1 : " + akun1.getSaldo());
        akun2.setSaldo(30);
        System.out.println("Saldo akun2 : " + akun2.getSaldo());
        akun3.setSaldo(0);
        System.out.println("Saldo akun3 : " + akun3.getSaldo());
    }
}