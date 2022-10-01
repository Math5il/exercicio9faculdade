import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        float fahrenheit = 0.0f; 
        float celsius = 0.0f;

        System.out.println("Por favor digite a temperatura em fahrenheit:");
        fahrenheit = console.nextFloat();

        celsius = 5 * ((fahrenheit - 32) /9);

        System.out.printf("A temperatura em celsius é: " + String.format("%.2f", celsius));

    }
}
