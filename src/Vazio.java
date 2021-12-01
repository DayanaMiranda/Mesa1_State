public class Vazio implements Estado {

    private Carrinho carrinho;

    @Override
    public void addProduto(Produto produto) {
        carrinho.setEstado(new Carregando(carrinho));
    }

    @Override
    public void cancelarCarrinho() {
        System.out.println("O carrinho já está vazio");
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstado(new Carregando(carrinho));
    }

    @Override
    public void voltaEstado() {
        System.out.println("O carrinho já está vazio");
    }

    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;



    }
}

//Luana, Pedro Menezes, Anderson Bueno, Luiz Henrique, Dayana
