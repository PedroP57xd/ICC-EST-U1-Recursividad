public class App {
    public static void main(String[] args) throws Exception {
    
        int n=5;
        int resultadoFinal=factorial(n);
        System.out.println("resultado: " + resultadoFinal);
    }
    public int factorial(int n){
        if (n==0) {
            System.out.println("Alcance el caso base");
            return 1;
        } 
        int resultado =n*factorial(n-1);
        System.out.println("Calculando factorial de "+ n+" = factorial("+(n-1)+")");
        return resultado;
    }

}
