class No<T> {
    T dado;
    No<T> proximo;
    No<T> anterior;

    public No(T dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}

public class ListaDupla<T> {
    private No<T> inicio;
    private No<T> fim;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarNoInicio(T dado) {
        No<T> novoNo = new No<>(dado);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void adicionarNoFim(T dado) {
        No<T> novoNo = new No<>(dado);
        if (fim == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.anterior = fim;
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public void removerDoInicio() {
        if (inicio != null) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.proximo;
                inicio.anterior = null;
            }
        }
    }

    public void removerDoFim() {
        if (fim != null) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                fim = fim.anterior;
                fim.proximo = null;
            }
        }
    }

    public void exibir() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }
}
