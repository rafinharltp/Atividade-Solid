public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoCartao();
        pagamento.pagar();

        pagamento = new PagamentoBoleto();
        pagamento.pagar();
    }
}
