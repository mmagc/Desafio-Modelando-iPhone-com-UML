package Music;

import java.util.Scanner;

public class MusicApp implements Music {

    private final static Scanner scanner = new Scanner(System.in);

    public void startMusic(){
        int option;
        do {
            System.out.println("Escolha a ação desejada ");
            System.out.println("1 - Tocar Musica");
            System.out.println("2 - Pausar Musica");
            System.out.println("3 - Selecionar Musica");
            System.out.println("4 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> play();
                case 2 -> pause();
                case 3 -> selectMusic();
                case 4 -> System.exit(0);
                default -> System.out.println("Opção invalida!");
            }

        } while (option != 0);
    };

    @Override
    public void play() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pause() {
        System.out.println("Pausando Musica");
        System.out.println("Musica Pausada");
    }

    @Override
    public void selectMusic() {
        System.out.println("Escolha a nova musica: ");
        String newMusic = scanner.nextLine();
        System.out.println("Agora Tocando: " + newMusic);
    }
}
