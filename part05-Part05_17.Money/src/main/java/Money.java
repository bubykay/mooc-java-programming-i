
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money money) {
        Money money2 = new Money(euros + money.euros, cents + money.cents);
        return money2;
    }

    public boolean lessThan(Money money) {
        if (this.euros < money.euros) {
            return true;
        }
        if (this.euros == money.euros && this.cents < money.cents) {
            return true;
        }
        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
