package com.google.www.certificacion.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.www.certificacion.pages.GoogleSearch_WebDriverConf;

public class GoogleSearch1 {

	String url = "http://www.google.com"; //Especifico URL
	String word = "Busqueda 1 con Suso"; // Palabra a buscar
	String name="q"; // name de la caja de texto
	
	GoogleSearch_WebDriverConf ins= new GoogleSearch_WebDriverConf(); // Instancio clase con métodos
	
	@Before
	public void setUp() throws Exception {
		ins.openURL(url); // Abro URL
	}

	@After
	public void tearDown() throws Exception {
		//GoogleSearch_WebDriverConf.closeAllBrowsers();
	}

	@Test
	public void test() {
		ins.searchWord(name,word); // Busco palabra
	}

}
