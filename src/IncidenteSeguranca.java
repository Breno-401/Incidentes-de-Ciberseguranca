public class IncidenteSeguranca {

    private String titulo;
    private String sistemaAfetado;
    private int nivelSeveridade;
    private double prejuizoEstimado;

    public IncidenteSeguranca() {
    }

    public IncidenteSeguranca(String titulo, String sistemaAfetado, int nivelSeveridade, double prejuizoEstimado) {
        this.titulo = titulo;
        this.sistemaAfetado = sistemaAfetado;
        this.nivelSeveridade = nivelSeveridade;
        this.prejuizoEstimado = prejuizoEstimado;
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
        this.nivelSeveridade = nivelSeveridade;
    }

    public double getPrejuizoEstimado() {
        return prejuizoEstimado;
    }

    public void setPrejuizoEstimado(double prejuizoEstimado) {
        this.prejuizoEstimado = prejuizoEstimado;
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
