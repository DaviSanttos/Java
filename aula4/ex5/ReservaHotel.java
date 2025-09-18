import java.util.ArrayList;

public class ReservaHotel {
    // Classe interna para armazenar os dados da reserva
    static class Reserva {
        String nome;
        int noites;
        int pessoas;
        boolean cafeIncluso;

        public Reserva(String nome, int noites, int pessoas, boolean cafeIncluso) {
            this.nome = nome;
            this.noites = noites;
            this.pessoas = pessoas;
            this.cafeIncluso = cafeIncluso;
        }

        @Override
        public String toString() {
            return "Reserva de " + nome + " | Noites: " + noites + " | Pessoas: " + pessoas +
                   " | Café incluso: " + (cafeIncluso ? "Sim" : "Não");
        }
    }

    // Lista de todas as reservas feitas
    private ArrayList<Reserva> reservas = new ArrayList<>();

    // 1. reservar(String nome)
    public void reservar(String nome) {
        reservar(nome, 1, 1, false);
    }

    // 2. reservar(String nome, int noites)
    public void reservar(String nome, int noites) {
        reservar(nome, noites, 1, false);
    }

    // 3. reservar(String nome, int noites, int pessoas)
    public void reservar(String nome, int noites, int pessoas) {
        reservar(nome, noites, pessoas, false);
    }

    // 4. reservar(String nome, int noites, int pessoas, boolean cafeIncluso)
    public void reservar(String nome, int noites, int pessoas, boolean cafeIncluso) {
        Reserva novaReserva = new Reserva(nome, noites, pessoas, cafeIncluso);
        reservas.add(novaReserva);
        System.out.println("Reserva realizada: " + novaReserva);
    }

    // Mostrar todas as reservas feitas
    public void listarReservas() {
        System.out.println("\nTodas as reservas:");
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    // main para testar
    public static void main(String[] args) {
        ReservaHotel hotel = new ReservaHotel();

        hotel.reservar("Alice");
        hotel.reservar("Bob", 3);
        hotel.reservar("Carlos", 2, 2);
        hotel.reservar("Diana", 5, 4, true);

        hotel.listarReservas();  // desafio extra
    }
}
