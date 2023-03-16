package br.com.dio.execicios.arrays;

import java.util.Random;

/**
 * <h1>Exercício 3 - Arrays </h1>
 * Esse programa ira ler 20 numeros aleatorios (entre 0 e 100), armazena-los
 * em um vetor e no final mostrar seus sucessores.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 15/03/23
  */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatorios: ");
        for(int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores: ");
        for(int numero : numerosAleatorios){
            System.out.print(numero+1 + " ");
        }
    }
}
