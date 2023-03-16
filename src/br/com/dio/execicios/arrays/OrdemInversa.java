package br.com.dio.execicios.arrays;

/**
 * <h1>Exercício 1 - Arrays </h1>
 * Esse programa ira mostrar todos os elementos do array de forma inversa.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 14/03/23
  */
public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {-5, -6, 15, 50, 8, 4};
        int contador = 0;
        
        System.out.println("Original: ");
        while(contador < (vetor.length)){
            System.out.println(vetor[contador] + " ");
            contador++;
        }

        System.out.println("Invertido: ");
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
}
