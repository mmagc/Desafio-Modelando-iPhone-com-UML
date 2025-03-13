package Safari;

import java.util.Scanner;

public class SafariApp implements Safari {

    private final static Scanner scanner = new Scanner(System.in);

    public void startSafari() {
        int option;
        do {
            System.out.println("Escolha a ação desejada ");
            System.out.println("1 - Exibir Pagina");
            System.out.println("2 - Criar Pagina");
            System.out.println("3 - Atualizar Pagina");
            System.out.println("4 - Sair");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> showPage();
                case 2 -> newPage();
                case 3 -> updatePage();
                case 4 -> System.exit(0);
                default -> System.out.println("Opção invalida!");
            }

        } while (option != 0);
    };

    @Override
    public void showPage() {
        System.out.println("Exibindo Pagina Atual");
    }

    @Override
    public void newPage() {
        System.out.println("Criando nova Pagina");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando Pagina");
    }
}
