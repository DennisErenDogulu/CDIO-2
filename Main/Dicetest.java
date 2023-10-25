package Main;

public class Dicetest {
    public static void main(String[] args) {
        int[] sumCount = new int[11]; // Count how many times each outcome occurs

        final int numberOfThrows = 1000; // Times the dice are thrown

        for (int i = 0; i < numberOfThrows; i++) {
            Dicevalues roll = new Dicevalues();
            int rollSum = roll.rollDice();

            // Check if the sum is within the range (2 to 12)
            if (rollSum >= 2 && rollSum <= 12) {
                sumCount[rollSum - 2]++;
            }
        }

        // Print the results with a space between lines
        for (int i = 2; i <= 12; i++) {
            double theoreticalProbability = getTheoreticalProbability(i);
            double experimentalProbability = (double) sumCount[i - 2] / numberOfThrows;
            int count = sumCount[i - 2]; // Get the count for this sum
            System.out.println("Sum " + i + ": Theoretical Probability = " + String.format("%.3f", theoreticalProbability)
                    + ", Experimental Probability = " + experimentalProbability
                    + ", Occourence of this sum = " + count);
            System.out.println(""); // Print a blank line for spacing
        }
    }

    // Calculate the theoretical probability
    public static double getTheoreticalProbability(int sum) {
        if (sum < 2 || sum > 12) {
            return 0.0; // Invalid sum
        }

        int favorableOutcomes = 0;
        int totalOutcomes = 36;

        // Count the number of favorable outcomes for the given sum
        for (int die1 = 1; die1 <= 6; die1++) {
            for (int die2 = 1; die2 <= 6; die2++) {
                if (die1 + die2 == sum) {
                    favorableOutcomes++;
                }
            }
        }

        return (double) favorableOutcomes / totalOutcomes;
    }
}
