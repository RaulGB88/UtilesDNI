/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class UtilesDNI {

    //Constantes.
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int DNI_NUMERO = 29211661;
    public static final char DNI_CONTROL = 'M';

    //public static final int MAX = 99999999;
    //public static final int MIN = 00000000;
    public static void comprobarDNI() {

        //Comprueba si letra y el número de DNI se corresponden.
        boolean controlLetra = comprobarletraDNI(DNI_NUMERO, DNI_CONTROL);

        if (controlLetra) {
            //Mensaje con la letra y número de DNI, que determina si es correcto o no.
            System.out.printf("DNI....: %d-%c >>>>> SÍ es correcto.\n", DNI_NUMERO, DNI_CONTROL);
        } else {
            //Mensaje con la letra y número de DNI, que determina si es correcto o no.
            System.out.printf("DNI....: %d-%c >>>>> NO es correcto.\n", DNI_NUMERO, DNI_CONTROL);
        }
    }

    //Calculo de la letra correspondiente al numero de DNI.
    public static char calcularLetraDNI(int num) {

        //Devolver posición.
        return LETRAS.charAt(num % 23);
    }

    //Comprueba si la letra y el número de DNI se corresponden.
    public static boolean comprobarletraDNI(int num, char ctr) {

        //Variable letra.
        char letra = calcularLetraDNI(num);

        //Devolver letra si coincide.
        return letra == ctr;
    }
}
