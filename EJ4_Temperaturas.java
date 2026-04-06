import java.util.Scanner;
public class EJ4_Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese temperatura en Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

        System.out.print("Ingrese temperatura en Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5/9;
        System.out.println(f + " °F = " + c + " °C");

        sc.close();
    }
}
