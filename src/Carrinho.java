public class Carrinho {

    private Estado estado;
    private Produto produto;

    public Carrinho(Estado estado, Produto produto) {
        this.estado = estado;
        this.produto = produto;


    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
