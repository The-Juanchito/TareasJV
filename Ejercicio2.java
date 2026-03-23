public class Ejercicio2 {
    public static void main(String[] args) {
       
        Alumno alumno = new Alumno(1043, "Danilo", "Puerta", 19);
        System.out.println(alumno.presentar());
    }
}
class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String presentar() {
        return "ID: " + id + ", Nombre: " + nombre + " " + apellido + ", Edad: " + edad;
    }
}
