package br.com.dio.execicios.arrays;

import java.util.Random;

/**
 * <h1>Exercício 4 - Arrays </h1>
 * Esse programa ira gerar um Array de 4x4 com valores aleatorios de
 * 0 a 9 e depois imprimi-los.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 16/03/23
  */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz 4x4: ");
        for(int[] linha : M){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
        
    }
}
