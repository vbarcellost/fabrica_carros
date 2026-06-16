package com.fabrica.factory;

import com.fabrica.model.Carro;

public class FabricaFord implements FabricaCarro {

    @Override
    public Carro criarCarroEconomico() {
        return new Carro.Builder()
                .marca("Ford").modelo("Ka Econômico")
                .motor("1.0 Flex EcoBoost 85cv")
                .transmissao("Manual 5 marchas")
                .chassi("Chassi Compacto B-Segment")
                .interior("Tecido xadrez azul e cinza")
                .cor("Prata Lunar").build();
    }

    @Override
    public Carro criarCarroEsportivo() {
        return new Carro.Builder()
                .marca("Ford").modelo("Mustang GT500")
                .motor("5.2 Supercharged V8 760cv")
                .transmissao("Manual Tremec 7 velocidades")
                .chassi("Chassi Shelby GT500 Reforçado")
                .interior("Couro preto com detalhes laranja")
                .cor("Azul Twister Metalizado").build();
    }

    @Override
    public Carro criarCarroLuxo() {
        return new Carro.Builder()
                .marca("Ford").modelo("Lincoln Continental Executive")
                .motor("3.0 Bi-Turbo V6 400cv")
                .transmissao("Automático SelectShift 10 velocidades")
                .chassi("Chassi Exclusivo Plataforma CD6")
                .interior("Couro Venetian com painel madeira ébano")
                .cor("Branco Platina Perolado").build();
    }
}
