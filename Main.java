import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, addition, subtraction, multiplication, division;
        String continueCalc = "sim";
        String operation;
        String resultLine;

        while (continueCalc.equalsIgnoreCase("sim")) {

            System.out.print("Digite o primeiro número: ");
            try {
                number1 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.next();
                continue;
            }
            System.out.print("Digite o segundo número: ");
            try {
                number2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.next();
                continue;
            }

            System.out.println("Qual a operação desejada? (+) (-) (*) (/)");
            operation = scanner.next();
            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Entrada inválida! Digite um símbolo");
                continue;
            }

            resultLine = null;

            if (operation.equals("+")) {
                addition = number1 + number2;
                System.out.println("Resultado = " + addition);
                resultLine = number1 + " + " + number2 + " = " + addition;
            }

            else if (operation.equals("-")) {
                subtraction = number1 - number2;
                System.out.println("Resultado = " + subtraction);
                resultLine = number1 + " - " + number2 + " = " + subtraction;
            }

            else if (operation.equals("*")) {
                multiplication = number1 * number2;
                System.out.println("Resultado = " + multiplication);
                resultLine = number1 + " * " + number2 + " = " + multiplication;
            }

            else if (operation.equals("/")) {
                division = number1 / number2;
                if (number2 == 0) {
                    System.out.println("Impossível dividir por 0");
                } else {
                    System.out.println("Resultado = " + division);
                    resultLine = number1 + " / " + number2 + " = " + division;
                }
            }

            if (resultLine != null) {
                try {
                    FileWriter writer = new FileWriter("historico.txt", true);
                    writer.write(resultLine + "\n");
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Não foi possível salvar no histórico.");
                }
            }

            System.out.print("Deseja calcular novamente? (sim/não): ");
            continueCalc = scanner.next();
        }
        scanner.close();
    }
}
