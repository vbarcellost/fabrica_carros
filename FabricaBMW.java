package com.fabrica.factory;

import com.fabrica.model.Carro;

public class FabricaBMW implements FabricaCarro {

    @Override
    public Carro criarCarroEconomico() {
        return new Carro.Builder()
                .marca("BMW").modelo("Serie 1 118i")
                .motor("1.5 Turbo 3 cilindros 140cv")
                .transmissao("Automático Steptronic 7 velocidades")
                .chassi("Chassi UKL2 Compacto")
                .interior("Tecido Anthrazit Sport")
                .cor("Cinza Mineral Metálico").build();
    }

    @Override
    public Carro criarCarroEsportivo() {
        return new Carro.Builder()
                .marca("BMW").modelo("M4 Competition")
                .motor("3.0 Bi-Turbo S58 510cv")
                .transmissao("M Drivelogic 8 velocidades")
                .chassi("Chassi M Carbono CFRP")
                .interior("Full Merino couro Isle of Man Green")
                .cor("São Paulo Amarelo M").build();
    }

    @Override
    public Carro criarCarroLuxo() {
        return new Carro.Builder()
                .marca("BMW").modelo("Serie 7 760i xDrive")
                .motor("4.4 V8 TwinPower Turbo 544cv")
                .transmissao("Automático ZF 8 velocidades")
                .chassi("Chassi CLAR com alma em carbono")
                .interior("Merino Nappa Bicolor com cristal Swarovski")
                .cor("Frozen Cashmere Silver Individual").build();
    }
}
