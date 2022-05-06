package autolote;

import java.util.ArrayList;

public class Carro {
    
    private String marca;
    private String modelo;
    private Motor motor;
    private ArrayList<Rueda> Ruedas = new ArrayList<>();

    public Carro() {
    }

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public ArrayList<Rueda> getRuedas() {
        return Ruedas;
    }

    public void setRuedas(ArrayList<Rueda> Ruedas) {
        this.Ruedas = Ruedas;
    }

    @Override
    public String toString() {
        return "Carro"
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nMotor: " + motor
                + "\nRuedas: " + Ruedas
                + "\n";
    }
}
