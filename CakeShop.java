package CakeProducer;

import java.util.Scanner;
public class CakeShop {
    public void CakeShop(){
        String[] viewer = new String[5];
        Double[] prices = new Double[5];
        for (int index = 0; index < viewer.length; index++) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Crea una torta: ");
            String cake = reader.nextLine();
            viewer[index] = cake;
            Scanner reader2 = new Scanner(System.in);
            System.out.print("Crea il prezzo della torta: ");
            Double price = Double.valueOf(reader2.nextLine());
            prices[index] = price;
        }
        System.out.println("La torta: " + viewer[0] + " Costa: " + prices[0] + " Euro");
        System.out.println("La torta: " + viewer[1] + " Costa: " + prices[1] + " Euro");
        System.out.println("La torta: " + viewer[2] + " Costa: " + prices[2] + " Euro");
        System.out.println("La torta: " + viewer[3] + " Costa: " + prices[3] + " Euro");
        System.out.println("La torta: " + viewer[4] + " Costa: " + prices[4] + " Euro");

        System.out.println("Desidera comprare una torta?");
        Scanner reader4 = new Scanner(System.in);
        System.out.print("Si o No: ");
        Boolean answer = Boolean.valueOf(reader4.nextLine());
        if (answer == true) {
            System.out.println("Quale torta desidera?");
            for (int index = 0; ; ){
                Scanner reader3 = new Scanner(System.in);
                System.out.print("Scelgo la torta: ");
                String choice = reader3.nextLine();
                if (viewer[0].equals(choice)){
                    System.out.println("Grazie dell'acquisto!" + "Torta esaurita: "+ viewer[0] + " Costo Euro: " + prices[0]);
                    viewer[0] = "Esaurita";
                    index++;
                } else if (viewer[1].equals(choice)){
                    System.out.println("Grazie dell'acquisto!" + "Torta esaurita: "+ viewer[1] + " Costo Euro: " + prices[1]);
                    viewer[1] = "Esaurita";
                    index++;
                } else if (viewer[2].equals(choice)){
                    System.out.println("Grazie dell'acquisto!" + "Torta esaurita: "+ viewer[2] + " Costo Euro: " + prices[2]);
                    viewer[2] = "Esaurita";
                    index++;
                }else if (viewer[3].equals(choice)){
                    System.out.println("Grazie dell'acquisto!" + "Torta esaurita: "+ viewer[3] + " Costo Euro: " + prices[3]);
                    viewer[3] = "Esaurita";
                    index++;
                }else if (viewer[4].equals(choice)){
                    System.out.println("Grazie dell'acquisto!" + "Torta esaurita: "+ viewer[4] + " Costo Euro: " + prices[4]);
                    viewer[4] = "Esaurita";
                    index++;
                } else {
                    System.out.println("La Torta non è disponibile");
                }
                if (index == 5){
                    System.out.println("Le Torte sono finite! A domani!");
                    break;
                }
            }

        }
    }
}
