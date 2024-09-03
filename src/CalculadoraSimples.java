import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        System.out.println(" A Soma é: ");
        System.out.println(soma);
        int subtracao = num1 - num2;
        System.out.println(" O resultado da  subtracao é: ");
        System.out.println(subtracao);
        int multiplicacao = num1 * num2;
        System.out.println(" O resultado da multiplicacao é :");
        System.out.println(multiplicacao);

        if (num2 != 0) {
            int divisao = num1 / num2;
            System.out.print("A divisão desses dois números é igual a: ");
            System.out.print(divisao);
        } else {
            System.out.println("Ops o denominador não pode ser zero !");
        }

    }

}
