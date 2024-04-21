import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int count = 0;

        while (count < 10) {
            int randomNumber = rand.nextInt(100) + 1;
            System.out.println("Generated number: " + randomNumber);

            if (randomNumber < smallest) {
                smallest = randomNumber;
            }

            if (randomNumber > largest) {
                largest = randomNumber;
            }

            count++;
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}