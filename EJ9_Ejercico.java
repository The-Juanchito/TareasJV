import java.util.Scanner;

public class EJ9_Ejercico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();

        if(numero > 0) {
            System.out.println("El numero es positivo.");
        }else  if (numero <0) {
            System.out.println("El numero es negativo.");
        }else {
            System.out.println("El numero es cero.");
        }

        if(numero % 2 == 0) {
            System.out.println("El numero ingresado es par.");
        }  else {
                System.out.println("El numero ingresado es impar.");
            }
            sc.close();
        }
    }