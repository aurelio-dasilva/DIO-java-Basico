import java.util.Scanner;


public class Calculadora {
    
    public static void soma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primero numero: ");
        Double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        Double numero2 = scan.nextDouble();
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1  + " mais " + numero2 + " é: " + resultado);
    }

    public static void subtracao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = scan.nextDouble();
        double resultado = numero1 - numero2;
        System.out.println("A subtraçao de " + numero1  + " menos " + numero2 + " é: " + resultado);
    }

    public static void multiplicacao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        Double numero2 = scan.nextDouble();
        double resultado = numero1 * numero2;
        System.out.println("A multiplicaçao de " + numero1  + " vezes " + numero2 + " é: " + resultado);
    }

    public static void divicao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        Double numero2 = scan.nextDouble();
        double resultado = numero1 / numero2;
        System.out.println("A divisao de " + numero1  + " dividido " + numero2 + " é: " + resultado);
    }
}
