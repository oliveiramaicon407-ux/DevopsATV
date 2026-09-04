public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 5);
        Produto p2 = new Produto("Mouse", 150.00, 20);
        Produto p3 = new Produto("Teclado", 250.00, 12);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();
    }
}