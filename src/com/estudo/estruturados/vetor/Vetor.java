package com.estudo.estruturados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor (int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

  /*  public void adiciona(String elemento){

        for(int i = 0; i < this.elementos.length; i++){
            if( elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    }  */

 /*   public void adiciona(String elemento) throws Exception{
        if(this.tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho++;
        }else{
            throw new Exception("Vetor cheio, não é permitido adicionar mais elementos");
        }
    }
  */


    public boolean adiciona(String elemento) {
        if(this.tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
            return false;
    }

    public int tamanho(){
        return tamanho;
    }

    @Override
    public String toString() {
        String s = "[ ";

        for(int i = 0; i<this.tamanho-1; i++){
            s = s + this.elementos[i];
            s = s + ", ";
        }

        if(this.tamanho>0){
           s = s + this.elementos[tamanho-1];
        }
        s = s + " ]";

        return s;
    }



}
