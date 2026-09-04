public class Main {
    public static void main(String[] args) {
        Consultor consultor = new Consultor("Ana Silva", "MAT-1029");
        Cliente cliente = new Cliente("CLI-001", "Tecnologia", "Gold", consultor);
        Servico servico = new Servico("Monitoramento Cloud", "Infraestrutura");
        Contrato contrato = new Contrato("10/01/2026", "Ativo", cliente, servico);
        Telemetria telemetria = new Telemetria("CPU Utilization High", "Alerta", "2026-06-07 14:30:00", servico);
        Insights insight = new Insights("Performance", "Recomendado aumento de recursos na AWS", "2026-06-07 15:00:00", contrato);

        consultor.exibirInformacoes();
        System.out.println();
        cliente.exibirInformacoes();
        System.out.println();
        servico.exibirInformacoes();
        System.out.println();
        contrato.exibirInformacoes();
        System.out.println();
        telemetria.exibirInformacoes();
        System.out.println();
        insight.exibirInformacoes();
    }
}