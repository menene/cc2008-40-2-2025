import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // numero aleatorio entre 0 (inclusivo) and 100 (exclusivo)
        int randomInt = random.nextInt(100);
        System.out.println(randomInt);

        // numero aleatorio entre 0.0 y 1.0
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        // booleano aleatorio
        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);
    }
}
