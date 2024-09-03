import java.util.Scanner;

public class IMC{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso em (kg)? ");
        double massa = scanner.nextDouble();
        System.out.println(massa);
        System.out.println("Digite a sua altura (m)? ");
        double altura = scanner.nextDouble();
        System.out.print(altura);

        double imc = massa / (altura * altura);
        System.out.println("Seu IMC é:  %.2f%n");
        System.out.print(imc);

        if (imc < 18.5) {
           System.out.println("Você está abaixo do peso. ");
        } else if (imc >= 18.5 && imc < 24.9) {
          System.out.println("O seu peso está normal. ");
        } else if (imc >= 25 && imc < 30.0) {
          System.out.println("Você está com sobrepeso. ");
        } else {
            System.out.println("Você está obeso, ñhonho(a) .");
        }
        scanner.close();
    }
}