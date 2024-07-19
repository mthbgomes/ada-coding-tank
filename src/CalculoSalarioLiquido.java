import java.util.Scanner;

public class CalculoSalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] salarioBruto = new float[5];
        float[] salarioLiquido = new float[5];
        float[] descontoINSS = new float[5];
        float[] descontoIR = new float[5];
        for (int i = 0; i < salarioBruto.length; i++) {
            System.out.printf("Digite o valor do salário bruto número %d:%n", i + 1);
            salarioBruto[i] = sc.nextFloat();
            descontoINSS[i] = CalcularDescontoINSS.calcularDesconto(salarioBruto[i]);
            descontoIR[i] = CalcularDescontoIR.calcularDesconto(salarioBruto[i]);
            salarioLiquido[i] = salarioBruto[i] - descontoINSS[i] - descontoIR[i];
        }
        sc.close();
        for (int i = 0; i < salarioBruto.length; i++) {
            System.out.printf("| Salário bruto %d: R$ %.2f%n", i + 1, salarioBruto[i]);
            System.out.printf("| Desconto INSS %d: R$ %.2f%n", i + 1, descontoINSS[i]);
            System.out.printf("| Desconto IR %d: R$ %.2f%n", i + 1, descontoIR[i]);
            System.out.printf("| Salário líquido %d: R$ %.2f%n", i + 1, salarioLiquido[i]);
            System.out.println("-------------------------------");
        }
    }
}
