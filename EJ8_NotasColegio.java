public class EJ8_NotasColegio {
    public class Estudiante {
        double nota1;
        double nota2;
        double nota3;

        public double calcularPromedio() {
            return (nota1 + nota2 + nota3) / 3;
        }
    }

    public static void main(String[] args) {
        EJ8_NotasColegio obj = new EJ8_NotasColegio();
        Estudiante est = obj.new Estudiante();
        est.nota1 = 3.5;
        est.nota2 = 4.0;
        est.nota3 = 2.5;

        double promedio = est.calcularPromedio();
        System.out.println("Promedio: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("El estudiante aprobó.");
        } else {
            System.out.println("El estudiante reprobó.");
        }
    }
}
