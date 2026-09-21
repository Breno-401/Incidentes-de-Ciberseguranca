public class IncidenteSeguranca {

    private String titulo;
    private String sistemaAfetado;
    private int nivelSeveridade;
    double prejuizoEstimado;

    public IncidenteSeguranca() {
    }

    public IncidenteSeguranca(String titulo, String sistemaAfetado, int nivelSeveridade, double prejuizoEstimado) {
        this.titulo = titulo;
        this.sistemaAfetado = sistemaAfetado;
        setNivelSeveridade(nivelSeveridade);
        setPrejuizoEstimado(prejuizoEstimado);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSistemaAfetado() {
        return sistemaAfetado;
    }

    public void setSistemaAfetado(String sistemaAfetado) {
        this.sistemaAfetado = sistemaAfetado;
    }

    public int getNivelSeveridade() {
        return nivelSeveridade;
    }

    public void setNivelSeveridade(int nivelSeveridade) {
        if (nivelSeveridade >= 1 && nivelSeveridade <=5){
            this.nivelSeveridade = nivelSeveridade;
        } else {
            throw new IllegalArgumentException(
                    "O nivel de severidade deve estar entre 1 e 5"
            );
        }
    }

    public double getPrejuizoEstimado() {
        return prejuizoEstimado;
    }

    public void setPrejuizoEstimado(double prejuizoEstimado) {
        if (prejuizoEstimado >= 0) {
            this.prejuizoEstimado = prejuizoEstimado;
        } else {
            throw new IllegalArgumentException(
                    "O prejuizo estimado nao pode ser negativo"
            );
        }
    }

    public int calcularNivelRisco(){
        return nivelSeveridade * 10;
    }

    public double calcularNivelRisco(double fatorImpacto) {
        return calcularNivelRisco() * fatorImpacto; //sobrecarga de metodo.
    }

    public double calcularNivelRisco(double fatorImpacto, double fatorUrgencia) {
        return calcularNivelRisco(fatorImpacto) * fatorUrgencia; //reutilizando logica anterior, outra sobrecarga de metodo.
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Sistema afetado: " + sistemaAfetado);
        System.out.println("Nivel de severidade: " + nivelSeveridade);
        System.out.println("Prejuizo estimado: R$ " + prejuizoEstimado);
        System.out.println("Nivel de risco: " + calcularNivelRisco());
    }

    @Override
    public String toString() {
        return "IncidenteSeguranca{" +
                "titulo='" + titulo + '\'' +
                ", sistemaAfetado='" + sistemaAfetado + '\'' +
                ", nivelSeveridade=" + nivelSeveridade +
                ", prejuizoEstimado=" + prejuizoEstimado +
                '}';
    }
}
