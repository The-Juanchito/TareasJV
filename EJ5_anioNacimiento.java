public class EJ5_anioNacimiento {
public class Persona { 
    int edad; 
    int anioActual; 
    void calcularYMostrarAnioNacimiento() { 
        int AnioNacimiento = anioActual - edad; 
        System.out.println("Anio de Nacimiento"); 
        System.out.println("Edad : " + edad); 
        System.out.println("Anio actual  : " + anioActual); 
        System.out.println("Anio de nacimiento : " + AnioNacimiento); 
    } 
} 
    
    public static void main(String[] args) {
        int anioActual = 2025;
        int edad = 18; 
        int anioNacimiento = anioActual - edad;

        System.out.println("Si tienes " + edad + " años, naciste en el año: " + anioNacimiento);                                                                                                                
    }
}
