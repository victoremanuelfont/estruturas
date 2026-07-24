package com.estudo.estruturados.teste;

import com.estudo.estruturados.vetor.Vetor;

public class Aula07 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);
        System.out.println(vetor.tamanho());

        vetor.adicionar(0,"A");
        System.out.println(vetor);
        System.out.println(vetor.tamanho());

    }
}
