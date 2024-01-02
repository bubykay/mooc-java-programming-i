
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        // System.out.println("first");
        if (this.month == 12 && this.day == 30) {
            // System.out.println("we got here");
            this.year = this.year + 1;
            this.month = 1;
            this.day = 1;
        } else if (this.day == 30) {
            this.month = this.month + 1;
            this.day = 1;
        } else {
            this.day += 1;
        }
    }

    public void advance(int howManydays) {
        int count = 0;
        while (count < howManydays) {
            advance();
            count++;
        }

    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate simpleDate = new SimpleDate(this.day, this.month, this.year);
        simpleDate.advance(days);
        return simpleDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
