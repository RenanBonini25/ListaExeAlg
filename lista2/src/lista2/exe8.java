
package lista2;

import java.util.Scanner;

public class exe8 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        String mes;
        int multa = 100;
        double formula = multa + (multa*0.05) + (multa +(multa*0.05))*0.05 + ((multa + (multa*0.05) + (multa +(multa*0.05))*0.05)*0.05);
        double formula2 = formula + (formula*0.05) + (formula + formula*0.05)*0.05 + (formula + (formula*0.05) + (formula + formula*0.05)*0.05)*0.05;
        double formula3 = formula2 + (formula2*0.05) + (formula2 + (formula2*0.05))*0.05 + (formula2 + (formula2*0.05) + (formula2 + (formula2*0.05))*0.05)*0.05;
                
        
        System.out.println("=== CÁLCULO DE MULTA! ===");
        System.out.println("");
        
        System.out.println("Digite o mês em que a multa será paga: ");
        mes = read.next();
        
        switch (mes){
            case "janeiro":
                System.out.println("O valor da multa será: R$ " + multa);
                break;
            case "fevereiro":
                double multa2 = multa + (multa*0.05);
                System.out.println("O valor da multa será: R$ " + multa2);
                break;
            case "marco":
                double multa3 = multa + (multa*0.05) + (multa +(multa*0.05))*0.05;
                System.out.println("O valor da multa será: R$ " + multa3);
                break;
            case "abril":
                double multa4 = multa + (multa*0.05) + (multa +(multa*0.05))*0.05 + ((multa + (multa*0.05) + (multa +(multa*0.05))*0.05)*0.05);
                System.out.println("O valor da multa será: R$ " + multa4);
                break;
            case "maio":
                double multa5 = formula + (formula*0.05);
                System.out.println("O valor da multa será: R$ " + multa5);
                break;
            case "junho":
                double multa6 = formula + (formula*0.05) + (formula + formula*0.05)*0.05;
                System.out.println("O valor da multa será: R$ " + multa6);
                break;
            case "julho":
                double multa7 = formula + (formula*0.05) + (formula + formula*0.05)*0.05 + (formula + (formula*0.05) + (formula + formula*0.05)*0.05)*0.05;
                System.out.println("O valor da multa será: R$ " + multa7);
                break;
            case "agosto":
                double multa8 = formula2 + (formula2*0.05);
                System.out.println("O valor da multa será: R$ " + multa8);
                break;
            case "setembro":
                double multa9 = formula2 + (formula2*0.05) + (formula2 + (formula2*0.05))*0.05;
                System.out.println("O valor da multa será: R$ " + multa9);
                break;
            case "outubro":
                double multa10 = formula2 + (formula2*0.05) + (formula2 + (formula2*0.05))*0.05 + (formula2 + (formula2*0.05) + (formula2 + (formula2*0.05))*0.05)*0.05;
                System.out.println("O valor da multa será: R$ " + multa10);
                break;
            case "novembro":
                double multa11 = formula3 + (formula3*0.05);
                System.out.println("O valor da multa será: R$ " + multa11);
                break;
            case "dezembro":
                double multa12 = formula3 + (formula3*0.05) + (formula3 + (formula3*0.05))*0.05;
                System.out.println("O valor da multa será: R$ " + multa12);
                break;
        }
    }
    
}
