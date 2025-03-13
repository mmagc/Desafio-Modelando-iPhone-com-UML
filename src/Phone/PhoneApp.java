package Phone;

import java.util.Scanner;

public class PhoneApp implements Phone {

    private final static Scanner scanner = new Scanner(System.in);

    public void startPhone(){
        int option;
        do {
            System.out.println("Escolha a ação desejada ");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender Telefone");
            System.out.println("3 - Gravar Mensagem de Voz");
            System.out.println("4 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> call();
                case 2 -> answer();
                case 3 -> voiceMail();
                case 4 -> System.exit(0);
                default -> System.out.println("Opção invalida!");
            }

        } while (option != 0);
    };

    @Override
    public void call() {
        System.out.println("Escolha para quem ira ligar: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Ligando para: " + phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Atendendo Telefone");
    }

    @Override
    public void voiceMail() {
        System.out.println("Escolha para quem ira Gravar Mensagem de voz: ");
        String name = scanner.nextLine();
        System.out.println("Gravando Mensagem de voz para: " + name);
    }
}
