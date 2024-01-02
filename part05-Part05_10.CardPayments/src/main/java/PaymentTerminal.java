
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment < 2.50) {
            return payment;
        }
        this.money += 2.5;
        affordableMeals += 1;
        return payment - 2.5;
    }

    public double eatHeartily(double payment) {
        if (payment < 4.30) {
            return payment;
        }
        this.money += 4.3;
        heartyMeals += 1;
        return payment - 4.3;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < 2.5) {
            return false;
        }
        card.takeMoney(2.5);
        this.affordableMeals += 1;
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < 4.3) {
            return false;
        }
        card.takeMoney(4.3);
        this.heartyMeals += 1;
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
