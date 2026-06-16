package com.fabrica.factory;

import com.fabrica.model.Carro;

public class FabricaToyota implements FabricaCarro {

    @Override
    public Carro criarCarroEconomico() {
        return new Carro.Builder()
                .marca("Toyota").modelo("Corolla Econômico")
                .motor("1.0 Flex 3 cilindros 75cv")
                .transmissao("Manual 5 marchas")
                .chassi("Chassi Leve Econômico")
                .interior("Tecido simples cinza")
                .cor("Branco Polar").build();
    }

    @Override
    public Carro criarCarroEsportivo() {
        return new Carro.Builder()
                .marca("Toyota").modelo("GR Supra")
                .motor("3.0 Turbo 6 cilindros 387cv")
                .transmissao("Automático 8 velocidades")
                .chassi("Chassi Esportivo Reforçado")
                .interior("Couro e Alcântara vermelho")
                .cor("Vermelho Prominence").build();
    }

    @Override
    public Carro criarCarroLuxo() {
        return new Carro.Builder()
                .marca("Toyota").modelo("Century Royale")
                .motor("5.0 V8 Híbrido 431cv")
                .transmissao("Automático CVT de precisão")
                .chassi("Chassi Plataforma GA-L Premium")
                .interior("Couro Nappa creme com madeira nobre")
                .cor("Preto Ônix Metalizado").build();
    }
}
