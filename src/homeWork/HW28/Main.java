package homeWork.HW28;


public class Main {

    /*
    С использованием агрегации (HAS-A relationship) создать классы Кошелек ( Wallet )
     и Деньги ( Money).
     Вывести на печать несколько обьектов класса Wallet
     */

    public static void main(String[] args) {

        Wallet wallet = new Wallet(1,10,100);
        Money little = new Money("dollars", wallet);
        System.out.println(little);

        System.out.println();

        Wallet wallet1 = new Wallet(1000,10000,100000 );
        Money big = new Money("euro", wallet1);
        System.out.println(big);

        System.out.println();

        Wallet wallet2 = new Wallet(1000000,10000000, 100000000);
        Money plenty = new Money("pound", wallet2);
        System.out.println(plenty);

    }
}