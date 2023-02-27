

public class suma {
    public static int suma(int num1, int num2, int num3) {
        int resultado = num1 + num2 + num3;
        return resultado;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 10;
        int resultado = suma(a, b, c);
        System.out.println("La suma de " + a + ", " + b + " y " + c + " es: " + resultado);
    }
}