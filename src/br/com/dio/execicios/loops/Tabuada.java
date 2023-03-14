package br.com.dio.execicios.loops;

import java.util.Scanner;

import javax.print.event.PrintEvent;

/**
 * <h1>Exercício 5</h1>
 * Esse programa mostrara a tabuada do 1 ao 10 usando o numero que
 * o usuário inserir.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 14/03/23
  */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
