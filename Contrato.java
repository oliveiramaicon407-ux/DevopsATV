public class Contrato {
    String dataInicio;
    String status;
    Cliente cliente;
    Servico servico;

    public Contrato(String dataInicio, String status, Cliente cliente, Servico servico) {
        this.dataInicio = dataInicio;
        this.status = status;
        this.cliente = cliente;
        this.servico = servico;
    }

    public void exibirInformacoes() {
        System.out.println("--- Contrato ---");
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Status: " + status);
        if (cliente != null) System.out.println("Cliente Código: " + cliente.codigo);
        if (servico != null) System.out.println("Serviço Contratado: " + servico.nome);
    }
}