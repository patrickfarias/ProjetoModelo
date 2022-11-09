package br.com.eugenesistemas.projetomodelo.projetomodelo.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VeiculoTest {

    //@Test
    public void testeConstrutor() {

        String modelo = "Challenger";
        String marca = "Dodge";
        int capacidadePortaMalas = 459;

        Veiculo challenger = new Veiculo(modelo, marca, capacidadePortaMalas);

        assertTrue(challenger.getMarca().equals(marca));
        assertTrue(challenger.getModelo().equals(modelo));
        assertEquals(challenger.getCapacidadeTotalPortaMalas(), capacidadePortaMalas);
        assertEquals(challenger.getQuantidadeUtilizadaPortaMalas(), 0);
        assertEquals(challenger.getCapacidadeDisponivelPortaMalas(), capacidadePortaMalas);

    }

   // @Test
    public void testeCapacidade() throws Exception {

        String modelo = "Jimmy";
        String marca = "Suzuki";
        int capacidadePortaMalas = 113;

        Veiculo jimmy = new Veiculo(modelo, marca, capacidadePortaMalas);

        jimmy.adicionarCargaPortaMalas(13);

    }

  //  @Test
    public void testeValidacaoCapacidade() {

        String modelo = "Caravan";
        String marca = "Chevrolet";
        int capacidadePortaMalas = 774;

        Veiculo caravan = new Veiculo(modelo, marca, capacidadePortaMalas);

        try {
            caravan.adicionarCargaPortaMalas(800);
        }
        catch (Exception e) {
            assertTrue(e.getMessage()
                    .equals("Erro: Excesso de carga. Espaço disponível: "
                            + caravan.getCapacidadeDisponivelPortaMalas()));
        }

    }
}