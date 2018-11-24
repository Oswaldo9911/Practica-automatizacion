package com.google.www.certificacion.tests;

//runner es el encargado de lanzar las pruebas
import org.junit.runner.RunWith;
import org.junit.runners.Suite; //importo la suite
import org.junit.runners.Suite.SuiteClasses; // Sin esta libreria no funciona la sentencia 9 de las clases

@RunWith(Suite.class) // Con la etiqueta ejecuta el .class. El .class meramente declara un objeto de la clase Suite.
@SuiteClasses({ GoogleSearch1.class, GoogleSearch2.class }) //Test cases
public class DoubleGoogleSearch {

}
