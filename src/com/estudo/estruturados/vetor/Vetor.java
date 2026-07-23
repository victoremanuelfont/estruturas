package com.estudo.estruturados.vetor;

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






}
