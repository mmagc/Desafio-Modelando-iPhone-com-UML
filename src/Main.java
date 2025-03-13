import Music.MusicApp;
import Phone.PhoneApp;
import Safari.SafariApp;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int option = -1;
        MusicApp musicApp = new MusicApp();
        PhoneApp phoneApp = new PhoneApp();
        SafariApp safariApp = new SafariApp();
        while (true) {
            System.out.println("Escolha a forma geometrica para o calculo da area ");
            System.out.println("1 - Music");
            System.out.println("2 - Phone");
            System.out.println("3 - Safari");
            System.out.println("4 - Sair");
            option = scanner.nextInt();
            if (option == 1) {
                musicApp.startMusic();
            }
            else if (option == 2) {
                phoneApp.startPhone();
            }
            else if (option == 3) {
                safariApp.startSafari();
            }
            else if (option == 4) {
                break;
            } else {
                System.out.println("Opção invalida!");
                continue;
            }

        }

    }


}