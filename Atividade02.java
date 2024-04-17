import java.util.Scanner;
import java.util.ArrayList;

public class Atividade02 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> MSG = new ArrayList<String>();

        int comfirmacao = 0;
        String SouN;

        MSG.add("Telefonou para a vítima?");
        MSG.add("Esteve no local do crime?");
        MSG.add("Mora perto da vítima?");
        MSG.add("Devia para a vítima?");
        MSG.add("Já trabalhou com a vítima?");

        System.out.println("Digite sim ou nao para as perguntas: ");

        for(int i = 0; i < 5; i++){
            System.out.println(MSG.get(i));
            SouN = input.nextLine();
            if(SouN.equals("sim")){
                comfirmacao++;
            }
        }

        if(comfirmacao < 2){
            System.out.println("Inocente");
        } else if (comfirmacao == 2) {
            System.out.println("Suspeito");
        } else if (comfirmacao == 3 || comfirmacao == 4) {
            System.out.println("Cúmplice");
        }else{
            System.out.println("Assassino");
        }

        input.close();
   } 
}