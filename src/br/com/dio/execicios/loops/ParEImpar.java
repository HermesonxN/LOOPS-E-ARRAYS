package br.com.dio.execicios.loops;

import java.util.Scanner;

/**
 * <h1>Exercício 4</h1>
 * Nesse programa o usuário determinara uma quantidade de números que serão inseridos
 * e depois vai ser retornado quantos números pares e impares tinham nos que foram
 * listados por ele.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 14/03/23
  */
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quant, numero, quantPares = 0, quantImpares = 0, contador = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        quant = scan.nextInt();

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero%2==0)
                quantPares++;
            else
                quantImpares++;

            contador++;
        }while(contador < quant);

        System.out.println("Quantidade de numeros pares: " + quantPares);
        System.out.println("Quantidade de numeros impares: " + quantImpares);
    }
}
