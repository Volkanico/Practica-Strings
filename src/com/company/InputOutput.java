package com.company;

import java.util.Scanner;

public class InputOutput {
    Scanner sc = new Scanner(System.in);
    Metodes metodes = new Metodes();

    public void menu(){

        System.out.println("Elegeix una de les opcions següents: " +
                "\n 1. Introduir text nou: " +
                "\n 2. Veure el text actual:" +
                "\n 3. Contar quantes lletres te aquest text: " +
                "\n 4. Contar quantes paraules te aquest text: " +
                "\n 5. Numero d'aparicions de cada caracter: " +
                "\n 6. El caracter mes repetit i el seu numero d'aparicions: " +
                "\n 7. La paraula mes repetit i el seu numero d'aparicions:" +
                "\n 8. Introduir un caracter y veure quantes vegades es repteix: " +
                "\n 9. Introduir una paraula y veure cuantas vegades es repteix: " +
                "\n 10. Per sortir: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                ex1();menu();break;
            case 2:
                ex2();menu();break;
            case 3:
                ex3();menu();break;
            case 4:
                ex4();menu();break;
            case 5:
                ex5();menu();break;
            case 6:
                ex6();menu();break;
            case 7:
                ex7();menu();break;
            case 8:
                ex8();menu();break;
            case 9:
                ex9();menu();break;
            case 10:
                break;
        }
    }
        public void ex1 (){
            System.out.println("Introdueix el text:");
            metodes.introduirFrase();
        }
        public void ex2 () {
            metodes.llegirFrase();
        }
        public void ex3 () {
            metodes.contarCaracters();
        }
        public void ex4 () {
            metodes.contarParaules();
        }
        public void ex5 () {
            metodes.ContarCadaCaracter();
        }
        public void ex6 () {
            metodes.caracterMesRepetitINumeroAparicions();
        }
        public void ex7 () {
            metodes.paraulaMesRepetidaINumeroAparicions();
        }
        public void ex8 () {
            metodes.cercaLletraINumeroAparicions();
        }
        public void ex9 () {
            metodes.cercaParaulaINumeroAparicions();
        }




}
