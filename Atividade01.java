import java.util.Scanner;
import java.util.ArrayList;

public class Atividade01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> mesMsg = new ArrayList<String>();
        ArrayList<Double> temperaturaMedia = new ArrayList<Double>();
        

        double mediaMes, mediaAnual = 0, somaAnual = 0;

        mesMsg.add("1 - Janeiro");
        mesMsg.add("2 - Fevereiro");
        mesMsg.add("3 - Março");
        mesMsg.add("4 - Abril");
        mesMsg.add("5 - Maio");
        mesMsg.add("6 - Junho");
        mesMsg.add("7 - Julho");
        mesMsg.add("8 - Agosto");
        mesMsg.add("9 - Setembro");
        mesMsg.add("10 - Outubro");
        mesMsg.add("11 - Novembro");
        mesMsg.add("12 - Dezembro");

        for(int i = 0; i < 12; i++){
            System.out.print(mesMsg.get(i) + ": ");
            mediaMes = input.nextDouble();
            temperaturaMedia.add(mediaMes);
            somaAnual += mediaMes;
        }

        mediaAnual = somaAnual / 12;

        System.out.println("Média anual das temperaturas: " + mediaAnual);
        System.out.println("Meses com temperatura acima da média anual:");

        for(int i = 0; i < 12; i++){
            if (temperaturaMedia.get(i) > mediaAnual) {
                System.out.println(mesMsg.get(i) + ": " + temperaturaMedia.get(i));
            }
        }

        input.close();
    }
}