package com.fabrica.main;

import com.fabrica.factory.*;
import com.fabrica.model.Carro;

public class Main {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   SISTEMA DE FÁBRICA DE CARROS");
        System.out.println("   Padrões: Abstract Factory + Builder");
        System.out.println("===========================================");

        System.out.println("\n>>> Linha de Produção: TOYOTA");
        fabricarLinha(new FabricaToyota());

        System.out.println("\n>>> Linha de Produção: FORD");
        fabricarLinha(new FabricaFord());

        System.out.println("\n>>> Linha de Produção: BMW");
        fabricarLinha(new FabricaBMW());

        System.out.println("\n===========================================");
        System.out.println("   Produção encerrada com sucesso!");
        System.out.println("===========================================");
    }

    private static void fabricarLinha(FabricaCarro fabrica) {
        Carro economico = fabrica.criarCarroEconomico();
        Carro esportivo = fabrica.criarCarroEsportivo();
        Carro luxo      = fabrica.criarCarroLuxo();

        System.out.println("\n[Econômico]" + economico);
        System.out.println("\n[Esportivo]" + esportivo);
        System.out.println("\n[Luxo]"      + luxo);
    }
}
