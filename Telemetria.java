public class Telemetria {
    String evento;
    String status;
    String timestamp;
    Servico servico;

    public Telemetria(String evento, String status, String timestamp, Servico servico) {
        this.evento = evento;
        this.status = status;
        this.timestamp = timestamp;
        this.servico = servico;
    }

    public void exibirInformacoes() {
        System.out.println("--- Telemetria ---");
        System.out.println("Evento: " + evento);
        System.out.println("Status: " + status);
        System.out.println("Timestamp: " + timestamp);
        if (servico != null) System.out.println("Serviço Monitorado: " + servico.nome);
    }
}