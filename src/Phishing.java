public class Phishing extends IncidenteSeguranca {

    private int usuariosAfetados;
    private boolean credenciaisComprometidas;


    public Phishing (String titulo, String sistemaAfetado, int nivelSeveridade,
                     double prejuizoEstimado, int usuariosAfetados, boolean credenciaisComprometidas){

        super (titulo, sistemaAfetado, nivelSeveridade, prejuizoEstimado);

        this.usuariosAfetados = usuariosAfetados;
        this.credenciaisComprometidas = credenciaisComprometidas;

    }

    public int getUsuariosAfetados() {
        return usuariosAfetados;
    }

    public void setUsuariosAfetados(int usuariosAfetados) {
        this.usuariosAfetados = usuariosAfetados;
    }

    public boolean isCredenciaisComprometidas() {
        return credenciaisComprometidas;
    }

    public void setCredenciaisComprometidas(boolean credenciaisComprometidas) {
        this.credenciaisComprometidas = credenciaisComprometidas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Usuarios afetados: " + usuariosAfetados);
        System.out.println("Credenciais comprometidas: " + credenciaisComprometidas);
    }

}
