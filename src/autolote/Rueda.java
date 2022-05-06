package autolote;

public class Rueda {
    
    private String marca;
    private int numero;
    private String tipo;

    public Rueda() {
    }

    public Rueda(String marca) {
        this.marca = marca;
    }

    public Rueda(String marca, int numero) {
        this.marca = marca;
        this.numero = numero;
    }

    public Rueda(String marca, int numero, String tipo) {
        this.marca = marca;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n - Marca: " + marca
                + "\n - Número: " + numero
                + "\n - Tipo: " + tipo
                + "\n --- ";
    }
    
    
}
