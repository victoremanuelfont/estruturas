package com.estudo.estruturados.teste;

import com.estudo.estruturados.vetor.Vetor;

public class aula05 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento01");
        vetor.adiciona("Elemento02");
        vetor.adiciona("Elemento03");

        System.out.println(vetor.busca(15));



    }
}
