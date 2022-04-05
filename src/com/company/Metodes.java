package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Metodes {

    Text text;
    private Scanner sc = new Scanner(System.in);

    int countersDeCaracters[] = new int[35];

    public void introduirFrase () {
        text = new Text(sc.nextLine());
    }
    public void llegirFrase () {
        System.out.println(text.getFrase());
    }

    public void contarCaracters() {
        int counter = 0;

        for (int i = 0; i < text.getFrase().length(); i++) {
            if (text.getFrase().charAt(i) != ' ' && text.getFrase().charAt(i) != '.' && text.getFrase().charAt(i) != ',' &&
                    text.getFrase().charAt(i) != '?' && text.getFrase().charAt(i) != '!' && text.getFrase().charAt(i) != ':') {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public void contarParaules(){
        int counter = 1;
        for (int i = 0; i < text.getFrase().length(); i++){
            if (text.getFrase().charAt(i) != ' '|| text.getFrase().charAt(i) != '.'|| text.getFrase().charAt(i) != ','||
                    text.getFrase().charAt(i) != '?'|| text.getFrase().charAt(i) != '!'||  text.getFrase().charAt(i) != ':') {
                if (i + 1 < text.getFrase().length()) {
                    if (text.getFrase().charAt(i + 1) == ' '|| text.getFrase().charAt(i + 1) == '.'||
                            text.getFrase().charAt(i + 1) == ','|| text.getFrase().charAt(i + 1) == '?'||
                            text.getFrase().charAt(i + 1) == '!'|| text.getFrase().charAt(i + 1) == ':') {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }


    public void ContarCadaCaracter() {

        for (int i1 = 0; i1 < text.getFrase().length(); i1++) {
            if (text.getFrase().charAt(i1) == 'a') {countersDeCaracters[0]++;}
            if (text.getFrase().charAt(i1) == 'b') {countersDeCaracters[1]++;}
            if (text.getFrase().charAt(i1) == 'c') {countersDeCaracters[2]++;}
            if (text.getFrase().charAt(i1) == 'd') {countersDeCaracters[3]++;}
            if (text.getFrase().charAt(i1) == 'e') {countersDeCaracters[4]++;}
            if (text.getFrase().charAt(i1) == 'f') {countersDeCaracters[5]++;}
            if (text.getFrase().charAt(i1) == 'g') {countersDeCaracters[6]++;}
            if (text.getFrase().charAt(i1) == 'h') {countersDeCaracters[7]++;}
            if (text.getFrase().charAt(i1) == 'i') {countersDeCaracters[8]++;}
            if (text.getFrase().charAt(i1) == 'j') {countersDeCaracters[9]++;}
            if (text.getFrase().charAt(i1) == 'k') {countersDeCaracters[10]++;}
            if (text.getFrase().charAt(i1) == 'l') {countersDeCaracters[11]++;}
            if (text.getFrase().charAt(i1) == 'm') {countersDeCaracters[12]++;}
            if (text.getFrase().charAt(i1) == 'n') {countersDeCaracters[13]++;}
            if (text.getFrase().charAt(i1) == 'o') {countersDeCaracters[14]++;}
            if (text.getFrase().charAt(i1) == 'p') {countersDeCaracters[15]++;}
            if (text.getFrase().charAt(i1) == 'q') {countersDeCaracters[16]++;}
            if (text.getFrase().charAt(i1) == 'r') {countersDeCaracters[17]++;}
            if (text.getFrase().charAt(i1) == 's') {countersDeCaracters[18]++;}
            if (text.getFrase().charAt(i1) == 't') {countersDeCaracters[19]++;}
            if (text.getFrase().charAt(i1) == 'u') {countersDeCaracters[20]++;}
            if (text.getFrase().charAt(i1) == 'v') {countersDeCaracters[21]++;}
            if (text.getFrase().charAt(i1) == 'w') {countersDeCaracters[22]++;}
            if (text.getFrase().charAt(i1) == 'x') {countersDeCaracters[23]++;}
            if (text.getFrase().charAt(i1) == 'y') {countersDeCaracters[24]++;}
            if (text.getFrase().charAt(i1) == 'z') {countersDeCaracters[25]++;}
            if (text.getFrase().charAt(i1) == ':') {countersDeCaracters[26]++;}
            if (text.getFrase().charAt(i1) == '.') {countersDeCaracters[27]++;}
            if (text.getFrase().charAt(i1) == ',') {countersDeCaracters[28]++;}
            if (text.getFrase().charAt(i1) == '?') {countersDeCaracters[29]++;}
            if (text.getFrase().charAt(i1) == '!') {countersDeCaracters[30]++;}
        }
        String abecedari = "abcdefghijklmnopqrstuvwxyz:.,?!";
        for (int x = 0; x < abecedari.length(); x++) {
            if (countersDeCaracters[x] != 0) {
                System.out.println("La lletra " + abecedari.charAt(x) + " ha aparegut " + countersDeCaracters[x] + " vegades");
            }
        }
    }

    public void caracterMesRepetitINumeroAparicions() {
        char ActualCharacter = ' ';
        char MostRepeat = ' ';
        int counter = 0;
        int maxCounter = 0;
        for(int i = 0; i < text.getFrase().length(); i++) {
            if(text.getFrase().charAt(i) != ' ') {
                ActualCharacter = text.getFrase().charAt(i);
                for(int j = 0; j < text.getFrase().length(); j++) {
                    if(text.getFrase().charAt(j) == ActualCharacter) {
                        counter++;
                    }
                }
                if(counter > maxCounter) {
                    maxCounter = counter;
                    MostRepeat = ActualCharacter;
                }
                counter = 0;
            }
        }
        System.out.println("El caracter " + MostRepeat + " apareix " + maxCounter + " pics");
    }


    public void paraulaMesRepetidaINumeroAparicions(){

        String[] splited  = text.getFrase().split(" ");
        Arrays.sort(splited);
        System.out.println(Arrays.toString(splited));
        int maxCounter = 0;
        int counter = 1;
        String word = splited[0];
        String curr = splited[0];

        for (int i = 1; i < splited.length; i++) {
            if (splited[i].equals(curr)){
                counter++;
            }
            else {
                counter = 1;
                curr = splited[i];
            }
            if (maxCounter<counter){
                maxCounter = counter;
                word = splited[i];
            }
        }
        System.out.println("La paraula mes repetida es "+ word + " y se repite " + maxCounter + " veces.");
    }

    public void cercaLletraINumeroAparicions (){
        int counter = 0;
        System.out.print("Escriu la lletra que vols cercar: ");
        char character = sc.next().charAt(0);

        for (int i = 0; i < text.getFrase().length(); i++){

            if (text.getFrase().charAt(i) == character) {
                counter++;
            }
        }
        System.out.println("Es repeteix " + counter +  " pics.");
    }
    
    public void cercaParaulaINumeroAparicions() {
        int counter = 0;
        System.out.print("Escriu la paraula que vols cercar: ");
        String Word = sc.nextLine();

        String paraulaActual = "";

        for (int i = 0; i < text.getFrase().length(); i++) {
            if (text.getFrase().charAt(i) != ' ') {
                paraulaActual += text.getFrase().charAt(i); }
            if (paraulaActual.equals(Word)) {
                counter++;
            }
        }
        System.out.println("Es repeteix " + counter + " pics.");
    }


}
