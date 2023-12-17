import java.util.ArrayList;

public class Statistics {

  private ArrayList<Integer> arrayList = new ArrayList<>();

  public Statistics() {
  }

  public void addNumber(int number) {
    arrayList.add(number);
  }

  public int getCount() {
    return arrayList.size();
  }

  public int sum() {
    int sum = 0;
    if (arrayList.size() == 0) {
      return 0;
    }
    for (int element : arrayList) {
      sum += element;
    }
    return sum;
  }

  public double average() {
    if (arrayList.size() == 0) {
      return 0;
    }
    double doubSum = (double) this.sum();
    return doubSum / arrayList.size();
  }

}
