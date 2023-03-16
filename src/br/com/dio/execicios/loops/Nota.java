package br.com.dio.execicios.loops;

import java.util.Scanner;

/**
 * <h1>Exercício 2 - Loops </h1>
 * Esse programa verifica a nota dada pelo usuário, se ela for maior que dez ou menor que zero,
 * seja retornado invalido e tera que digitar novamente.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 14/03/23
*/
public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota invalida! Digite um valor valido: ");
            nota = scan.nextInt();
        }
    }
}
