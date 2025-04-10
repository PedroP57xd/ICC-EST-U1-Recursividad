import java.net.Socket;

public class EjerciciosRecursivos {
    public int fibonacci(int n) {
        if (n <=1) {
            return 0;
        } 
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public int sumaConsecutivos(int n){
        if (n == 1) {
            return 1;
        }
        int resultadoParcial=sumaConsecutivos(n-1);
        int resultado= n+resultadoParcial;
        return resultado;
    }
}
