package section2_syntax.part2_operators;

public class WeightUnitsSolver {

    /**
     * Returns the number of Pounds, Ounces, and Grams represented by this quantity of grams,
     * encapsulated in a BritishWeightUnits object.
     * @param grams the grams quantity
     * @return a BritishWeightUnits instance
     * @throws IllegalArgumentException when the Grams quantity is less than 0
     */
    public BritishWeightUnits convertFromGrams(int grams) {

        if (grams < 0) {
            throw new IllegalArgumentException("Error: grams should be above 0. Given: grams=" + grams);
        }


        int pounds = grams / 454;
        int remainingGramsAfterPounds = grams % 454;

        int ounces = (int) (remainingGramsAfterPounds / 28);
        int remainingGramsAfterOunces = (int) (remainingGramsAfterPounds % 28);


        return new BritishWeightUnits(pounds, ounces, remainingGramsAfterOunces);
    }
}
