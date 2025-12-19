package org.example;

import java.util.Arrays;

public class siglo {

    static java.util.Scanner in;

    public static void casoDePrueba() {

        int vec[] = new int[4];
        int rest[] = new int[3];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] > 0){
                switch (i){
                    case 0:
                        for (int j = 0; j < vec[0]; j++) {
                            rest[1] +=  1;
                        }

                        break;
                    case 1:
                        //Este
                        for (int j = 0; j < vec[1]; j++) {
                            rest[2] += 9;
                        }
                        break;
                    case 2:
                        for (int j = 0; j < vec[2]; j++) {
                            rest[1] += 1;
                            rest[2] += 6;
                        }

                        break;
                    case 3:
                        for (int j = 0; j < vec[3]; j++) {
                            rest[1] += 1;
                        }
                        break;
                }
            }
        }
        if (rest[2] >= 12){
            rest[1] += rest[2]/12;
            rest[2] = rest[2] % 12;
        }
       if (rest[1] >= 20){
            rest[0] += rest[1]/20;
            rest[1] = rest[1] % 20;
        }
        System.out.println(Arrays.toString(rest));



    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
