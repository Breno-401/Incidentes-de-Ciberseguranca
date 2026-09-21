public class Ransomware extends IncidenteSeguranca{

    private double dadosCriptografadosGB;
    private double valorResgate;

    public Ransomware(String titulo, String sistemaAfetado, int nivelSeveridade, double prejuizoEstimado, double dadosCriptografadosGB, double valorResgate) {

        super(titulo, sistemaAfetado, nivelSeveridade, prejuizoEstimado);

        this.dadosCriptografadosGB = dadosCriptografadosGB;
        this.valorResgate = valorResgate;
    }

    public double getDadosCriptografadosGB() {
        return dadosCriptografadosGB;
    }

    public void setDadosCriptografadosGB(double dadosCriptografadosGB) {
        this.dadosCriptografadosGB = dadosCriptografadosGB;
    }

    public double getValorResgate() {
        return valorResgate;
    }

    public void setValorResgate(double valorResgate) {
        this.valorResgate = valorResgate;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Dados criptografados: " + dadosCriptografadosGB + " GB");
        System.out.println("Valor do resgate: R$ " + valorResgate);
    }
}
