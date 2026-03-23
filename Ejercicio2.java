public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear un objeto Alumno
        Alumno alumno = new Alumno(1043, "Danilo", "Puerta", 19);
        
        // Mostrar la presentación del alumno
        System.out.println(alumno.presentar());
    }
}

// Clase Alumno
class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    
    // Constructor
    public Alumno(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    // Método para presentación
    public String presentar() {
        return "ID: " + id + ", Nombre: " + nombre + " " + apellido + ", Edad: " + edad;
    }
}
