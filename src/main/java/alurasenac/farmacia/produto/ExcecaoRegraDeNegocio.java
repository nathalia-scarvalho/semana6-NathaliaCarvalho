package alurasenac.farmacia.produto;

public class RegraNegocioExcecao extends RuntimeException {

    public RegraNegocioExcecao(String mensagem) {
        super(mensagem);
    }
}