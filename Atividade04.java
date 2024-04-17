import java.util.Scanner;
import java.util.ArrayList;

public class Atividade04{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> salario = new ArrayList<Double>();
        int[] contadores = new int[9];
        
        Double inserir, comissao;
        int quantidade = 0;

        do{
            System.out.print("Insire as Vendas a seguir em $ (Insira -1 para encerrar): ");
            inserir = input.nextDouble();

            if (inserir != -1) {
                comissao = (inserir * 0.09) + 200;
                salario.add(comissao);
                quantidade++;
            }
        }while(inserir != -1);

        for(int i = 0; i < quantidade; i++){
            if (salario.get(i) >= 200 && salario.get(i) < 300) {
                contadores[0]++;
            } else if (salario.get(i) >= 300 && salario.get(i) < 400) {
                contadores[1]++;
            } else if (salario.get(i) >= 400 && salario.get(i) < 500) {
                contadores[2]++;
            } else if (salario.get(i) >= 500 && salario.get(i) < 600) {
                contadores[3]++;
            } else if (salario.get(i) >= 600 && salario.get(i) < 700) {
                contadores[4]++;
            } else if (salario.get(i) >= 700 && salario.get(i) < 800) {
                contadores[5]++;
            } else if (salario.get(i) >= 800 && salario.get(i) < 900) {
                contadores[6]++;
            } else if (salario.get(i) >= 900 && salario.get(i) < 1000) {
                contadores[7]++;
            } else {
                contadores[8]++;
            }
        }
        System.out.println("Números de vendedores em cada intervalo de salarios: ");
        for(int i = 0; i < contadores.length - 1; i++){
            System.out.println("$" + (200 + (i * 100)) + " - $" + (299 + (i * 100)) + ": " + contadores[i]);
        }
        System.out.println("$1000 em diante: " + contadores[8]);

        input.close();
    }
}