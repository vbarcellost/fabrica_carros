package com.fabrica.model;

public class Carro {

    private String marca;
    private String modelo;
    private String motor;
    private String transmissao;
    private String chassi;
    private String interior;
    private String cor;

    private Carro() {}

    public String getMarca()        { return marca; }
    public String getModelo()       { return modelo; }
    public String getMotor()        { return motor; }
    public String getTransmissao()  { return transmissao; }
    public String getChassi()       { return chassi; }
    public String getInterior()     { return interior; }
    public String getCor()          { return cor; }

    @Override
    public String toString() {
        return "\n╔══════════════════════════════════════╗"
             + "\n║          CARRO FABRICADO             ║"
             + "\n╠══════════════════════════════════════╣"
             + "\n║  Marca       : " + marca
             + "\n║  Modelo      : " + modelo
             + "\n║  Motor       : " + motor
             + "\n║  Transmissão : " + transmissao
             + "\n║  Chassi      : " + chassi
             + "\n║  Interior    : " + interior
             + "\n║  Cor         : " + cor
             + "\n╚══════════════════════════════════════╝";
    }

    public static class Builder {

        private final Carro carro = new Carro();

        public Builder marca(String marca)             { carro.marca = marca; return this; }
        public Builder modelo(String modelo)           { carro.modelo = modelo; return this; }
        public Builder motor(String motor)             { carro.motor = motor; return this; }
        public Builder transmissao(String transmissao) { carro.transmissao = transmissao; return this; }
        public Builder chassi(String chassi)           { carro.chassi = chassi; return this; }
        public Builder interior(String interior)       { carro.interior = interior; return this; }
        public Builder cor(String cor)                 { carro.cor = cor; return this; }

        public Carro build() {
            if (carro.marca == null || carro.modelo == null)
                throw new IllegalStateException("Carro precisa ter marca e modelo definidos.");
            return carro;
        }
    }
}
