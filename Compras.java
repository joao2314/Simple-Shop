
import java.util.Scanner;
import java.util.Locale;

public class Compras {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String produtos = "Iphone14 Playstation5 GrandTheftAuroVI";
        String[] vector =  produtos.split(" ");
        String carrinho;
        int divida = 0;
        

        System.out.print("\nEscolha oque voce quer comprar: \n\n1 - Iphone 14: R$1250\n2 - Playstation 5: R$2760\n3 - Grand Theft Auro VI: R$600\n");
        int shop = scan.nextInt();
    
        System.out.println("\nVoce escolheu: " + vector[shop-1]);
        carrinho =  vector[shop-1];

        switch (shop) {
            case 1:
                divida += 1250;
                break;
            case 2:
                divida += 2760;
                break;
            case 3:
                divida += 600;
            default:
               System.err.println("Erro no programa");
                break;
        }


        System.out.println("Deseja comprar mais algum produto? (s/n)");
        char alternate = scan.next().charAt(0);
        if(alternate == 'n') {
            System.out.println("\nSua compra foi finalizada com sucesso!");
            System.out.println("\nVoce pagara: R$" + divida);
            System.out.println("Ira receber: " + carrinho + "\n");
        }

        while(alternate == 's') {
           System.out.print("\nEscolha oque voce quer comprar: \n\n1 - Iphone 14: R$1250\n2 - Playstation 5: R$2760\n3 - Grand Theft Auro VI: R$600\n");
           System.out.println("\nCarrinho: " + carrinho);
           System.out.println("A pagar: R$" + divida);
            switch (shop) {
            case 1:
                divida += 1250;
                break;
            case 2:
                divida += 2760;
                break;
            case 3:
                divida += 600;
            default:
               System.err.println("Erro no programa");
                break;
        }
           int line1 = scan.nextInt()-1;

           carrinho += ", " + vector[line1];
           System.out.println("Voce escolheu: " + vector[line1]);
              System.out.println("Deseja comprar mais algum produto? (s/n)");
           char alternate2 = scan.next().charAt(0);
          if(alternate2 == 'n') {
            alternate = 'n';
            System.out.println("\nSua compra foi finalizada com sucesso!");
            System.out.println("\nVoce pagara: R$" + divida);
            System.out.println("Ira receber: " + carrinho + "\n");
          }
        }
      }
    }
