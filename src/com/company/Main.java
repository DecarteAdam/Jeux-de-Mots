package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ArrayList<String> maCollectionDesChaines = new ArrayList<>();

        Scanner clavierUtil = new Scanner(System.in);

        String characteres = "voiture"; //mot à trouver
        System.out.println("Devinez le mot: " + characteres);

        System.out.println("Mot melange = " + characteres);
        characteres = melanger(characteres);




        String resultScan = clavierUtil.nextLine();
        boolean finCompteur = false;

        if (resultScan.equals(characteres)){
            System.out.println("Felecitations!!! Vous-avez gagne!");
        }else{
            System.out.println("Vous-avez perdue! Limite compteur");
        }
    }


    public static String melanger(String text) {
        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = (int)(Math.random() * characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }




       /*String charAll = ""; //characteres


        //int length = 7;

        Random rand = new Random();
         int length = rand.nextInt(7);

        char[] text = new char[length];

        for (int i = 0; i<length; i++){
            text[i] = characteres.charAt(rand.nextInt(characteres.length()));

        }

        for (int i=0; i<text.length; i++){
            charAll += text[i];

        }
        System.out.println(charAll);
        String resultScan = clavierUtil.nextLine();





        boolean finCompteur = false;

        if (resultScan.equals(characteres)){
            System.out.println("Felecitations!!! Vous-avez gagne!");
        }else{
            System.out.println("Vous-avez perdue! Limite compteur");
        }

       /*while (!resultScan.equals(characteres)){
           if (compteur<limiteCompteurDifficile){
               System.out.println("Entrez un mot:");
               deviner = clavierUtil.nextLine();
               compteur++;
           }else{
               finCompteur = true;
           }
       }
        if (finCompteur){
            System.out.println("Vous-avez perdue! Limite compteur");
        }else{
            System.out.println("Felecitations!!! Vous-avez gagne!");
        }*/




    }
