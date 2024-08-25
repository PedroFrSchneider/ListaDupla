public class Main {
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<>();

        lista.adicionarNoInicio("Item 1");
        lista.adicionarNoFim("Item 2");
        lista.adicionarNoFim("Item 3");

        lista.exibir();

        lista.removerDoInicio();

        lista.exibir();
    }
}