package br.com.dio.execicios.arrays;

import java.util.Scanner;

/**
 * <h1>Exercício 2 - Arrays </h1>
 * Esse programa ira receber 6 caracteres(letras), guardar em um array e dizer
 * quantas consoantes exstem nesse array.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 15/03/23
  */
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int consoantesLidas = 0, contador = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if(!(
                letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")
                )){
                    consoantes[contador] = letra;
                    consoantesLidas++; 
                }

                contador++;

        }while(contador < consoantes.length);


        System.out.println("Quantidade de consoantes: " + consoantesLidas);
        for(String consoante : consoantes){
            if(consoante != null){
                System.out.print(consoante + " ");
            }
        }
    }
}
