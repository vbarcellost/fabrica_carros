package com.fabrica.factory;

import com.fabrica.model.Carro;

public interface FabricaCarro {
    Carro criarCarroEconomico();
    Carro criarCarroEsportivo();
    Carro criarCarroLuxo();
}
