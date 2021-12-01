public class Fechado implements Estado {
    private Carrinho carrinho;

    public Fechado(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void addProduto(Produto produto) {

    }

    @Override
    public void cancelarCarrinho() {

    }

    @Override
    public void proximoEstado() {

    }

    @Override
    public void voltaEstado() {

    }
}
