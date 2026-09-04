public class Cliente {
    String codigo;
    String segmento;
    String nivelAtendimento;
    Consultor consultor;

    public Cliente(String codigo, String segmento, String nivelAtendimento, Consultor consultor) {
        this.codigo = codigo;
        this.segmento = segmento;
        this.nivelAtendimento = nivelAtendimento;
        this.consultor = consultor;
    }

    public void exibirInformacoes() {
        System.out.println("--- Cliente ---");
        System.out.println("Código: " + codigo);
        System.out.println("Segmento: " + segmento);
        System.out.println("Nível de Atendimento: " + nivelAtendimento);
        if (consultor != null) {
            System.out.println("Consultor Responsável: " + consultor.nome);
        }
    }
}