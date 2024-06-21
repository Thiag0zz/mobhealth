import java.util.Scanner;

class Hotel {
    private String nome;
    private int quartosDisponiveis;
    private double precoDiaria;

    public Hotel(String nome, int quartosDisponiveis, double precoDiaria) {
        this.nome = nome;
        this.quartosDisponiveis = quartosDisponiveis;
        this.precoDiaria = precoDiaria;
    }

    public String getNome() {
        return nome;
    }

    public int getQuartosDisponiveis() {
        return quartosDisponiveis;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void reservarQuarto() {
        if (quartosDisponiveis > 0) {
            quartosDisponiveis--;
            System.out.println("Quarto reservado com sucesso!");
        } else {
            System.out.println("Desculpe, não há quartos disponíveis.");
        }
    }
}

public class SistemaReservasHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Java", 10, 100.0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao " + hotel.getNome());

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Verificar disponibilidade de quartos");
            System.out.println("2. Reservar quarto");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quartos disponíveis: " + hotel.getQuartosDisponiveis());
                    break;
                case 2:
                    hotel.reservarQuarto();
                    break;
                case 3:
                    System.out.println("Obrigado por usar nosso sistema de reservas. Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}
