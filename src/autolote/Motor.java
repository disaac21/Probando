package autolote;

public class Motor {

    private String serie;
    private int potencia;
    private int cilindros;
    private int temperatura;

    public Motor() {
    }

    public Motor(String serie, int potencia, int cilindros, int temperatura) {
        this.serie = serie;
        this.potencia = potencia;
        this.setCilindros(cilindros);
        this.temperatura = temperatura;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        if (cilindros <= 8) {
            this.cilindros = cilindros;
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "\n - Serie: " + serie
                + "\n - Potencia: " + potencia
                + "\n - Cilindros: " + cilindros
                + "\n - Temperatura: " + temperatura;
    }

}
