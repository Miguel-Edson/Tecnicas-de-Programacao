package Negócio;


import java.util.ArrayList;

public class CartasSelecionadas {
    private static ArrayList<Carta> cartasSelecionadas = new ArrayList<>();

    public static void adicionarCartaSelecionada(Carta carta) {
        cartasSelecionadas.add(carta);
    }

    public static ArrayList<Carta> getCartasSelecionadas() {
        return cartasSelecionadas;
    }
}

