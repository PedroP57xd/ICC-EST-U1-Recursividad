public class App {
    public static void main(String[] args) throws Exception {
        EjerciciosRecursivos fimo = new EjerciciosRecursivos();
        fimo.fibonacci(5);
        fimo.sumaConsecutivos(5);

        // int n = 5;
        // int resultadoFinal = factorial(n);
        // System.out.println("resultado: " + resultadoFinal);
    }

    // public static int factorial(int n) {
    //     if (n == 0) {
    //         System.out.println("Alcance el caso base");
    //         return 1;
    //     }
    //     int resultado = n * factorial(n - 1);
    //     System.out.println("Calculando factorial de " + n + " * factorias(" + (n - 1) + ")");
    //     return resultado;
    // }

}
