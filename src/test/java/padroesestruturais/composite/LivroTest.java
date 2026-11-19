package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void deveRetornarSumarioLivro() {
        Parte parte1 = new Parte("Introdução");

        Parte parte2 = new Parte("Requisitos");
        Capitulo capitulo21 = new Capitulo("Levantamento de Requisitos", 20);
        parte2.addSecao(capitulo21);

        Parte parte3 = new Parte("Projeto");
        Capitulo capitulo31 = new Capitulo("Arquitetura", 30);
        Capitulo capitulo32 = new Capitulo("Padrões de Projeto", 25);
        parte3.addSecao(capitulo31);
        parte3.addSecao(capitulo32);

        Parte sumario = new Parte("Engenharia de Software");
        sumario.addSecao(parte1);
        sumario.addSecao(parte2);
        sumario.addSecao(parte3);

        Livro livro = new Livro();
        livro.setSumario(sumario);

        assertEquals("Parte: Engenharia de Software\n" +
                "Parte: Introdução\n" +
                "Parte: Requisitos\n" +
                "Capítulo: Levantamento de Requisitos - páginas: 20\n" +
                "Parte: Projeto\n" +
                "Capítulo: Arquitetura - páginas: 30\n" +
                "Capítulo: Padrões de Projeto - páginas: 25\n", livro.getSumario());
    }

    @Test
    void deveRetornarExcecaoLivroSemSumario() {
        try {
            Livro livro = new Livro();
            livro.getSumario();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Livro sem sumário", e.getMessage());
        }
    }
}