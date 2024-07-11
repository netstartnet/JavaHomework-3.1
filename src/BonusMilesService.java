public class BonusMilesService {
    public int calculate(int price) {
        int bonusMiles = 20;
        int amoutMiles = price / bonusMiles;
        return amoutMiles;
    }
}