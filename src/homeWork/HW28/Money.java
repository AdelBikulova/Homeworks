package homeWork.HW28;


public class Money {

    String currency;

    Wallet wallet;

    public Money(String currency, Wallet wallet) {
        this.currency = currency;
        this.wallet = wallet;
    }
    public void printAddress(){
        System.out.println(wallet.dollar);
        System.out.println(wallet.euro);
        System.out.println(wallet.pound);
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}

