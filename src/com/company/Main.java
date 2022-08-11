package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] listaNotas = new double[10];
        //[4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.0]

        listaNotas[0] = 4.1;
        listaNotas[1] = 4.8;
        listaNotas[2] = 1.5;
        listaNotas[3] = 2.3;
        listaNotas[4] = 0.1;
        listaNotas[5] = 0.9;
        listaNotas[6] = 1.4;
        listaNotas[7] = 1.8;
        listaNotas[8] = 1.5;
        listaNotas[9] = 3.0;
        double prom;
        double nota=0;
        double [] reporte = new double[3];

        for(int i=0; i<listaNotas.length; i++){
            System.out.print(listaNotas[i]+" ");
            nota=nota+listaNotas[i];
            System.out.println(nota);
        }

        prom= nota/listaNotas.length;
        reporte[0]=prom;
        reporte[1]=0;
        reporte[2]=0;

        // return reporte;

        //para imprimir la Suma del Arreglo
        System.out.println(prom);
    }
}
