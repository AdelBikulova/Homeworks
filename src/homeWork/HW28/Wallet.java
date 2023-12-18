package homeWork.HW28;

public class Wallet {

    int dollar;
    int euro;
    int pound;

    public Wallet(int dollar, int euro, int pound) {
        this.dollar = dollar;
        this.euro = euro;
        this.pound = pound;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "dollar=" + dollar +
                ", euro=" + euro +
                ", pound=" + pound +
                '}';
    }
}





