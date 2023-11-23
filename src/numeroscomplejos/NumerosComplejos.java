package numeroscomplejos;

public class NumerosComplejos {

    public static void main(String[] args) {
        NumeroComplejo num1 = new NumeroComplejo();
        NumeroComplejo num2 = new NumeroComplejo();
        num1.cargar("7+5i");
        System.out.println("Numero complejo: " + num1.mostrar());
        num2.cargar("1+2i");
        System.out.println("Numero complejo: " + num2.mostrar());
        String resultadoSuma = num1.suma(num2);
        System.out.println("El resultado es: " + resultadoSuma);
    }
}