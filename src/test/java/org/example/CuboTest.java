package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboTest {

    @Test
    void CUBO() {
        //TEST entrada de metodos Systm.setin(); y System.Setout(); crear variable siempre sting ,
        // En el setIn new ByteArrayInputStream(nombrevariableString.getBytes())

        // En el System setout() hay que crear una variable  tipo ByteArrayOutputStream variable = new ByteArrayOutputStream();
        //En el SystemOutput hay que poner new PrinteStream(variable)
        //Luego una variable String que sea la salida que quieres assertTrue(variable.contains(variableString))
        assertAll(
                () -> assertEquals(8,Bateria1_T4_metodos.CUBO(2)),
                () -> assertEquals(27,Bateria1_T4_metodos.CUBO(3)),
                () -> assertFalse(Bateria1_T4_metodos.par(3))
        );


    }
}