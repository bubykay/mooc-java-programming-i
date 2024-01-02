import java.util.ArrayList;

public class Package {
  private ArrayList<Gift> giftsList;

  public Package() {
    this.giftsList = new ArrayList<>();
  }

  public void addGift(Gift gift) {
    giftsList.add(gift);
  }

  public int totalWeight() {
    int total = 0;
    for (Gift gift : giftsList) {
      total += gift.getWeight();
    }
    return total;
  }
}
