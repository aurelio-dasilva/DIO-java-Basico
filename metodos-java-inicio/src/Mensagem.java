import java.util.Scanner;

public class Mensagem {

    public static void obterMensagem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma hora: ");
        int hora = scan.nextInt();
        switch(hora){
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Bom dia!");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Bom tarde!");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
                System.out.println("Bom noite!");
                break;
            default:
                System.out.println("Hora invalida");
                break;    
        }
                    
        }

    }
    

