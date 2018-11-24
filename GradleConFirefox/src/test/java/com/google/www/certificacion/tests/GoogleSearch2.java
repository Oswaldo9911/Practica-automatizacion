package com.google.www.certificacion.tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.www.certificacion.pages.GoogleSearch_WebDriverConf;

public class GoogleSearch2 {

	String url = "http://www.google.com"; //Especifico URL
	String word = "Busqueda 2 con Lokillo"; // Palabra a buscar
	String id="q"; // id de la caja de texto donde enviaré dato
	
	// No puedo instanciar porque entonces abriría otro navegador
	// El constructor me abre el Browser
	
	@Before
	public void setUp() throws Exception {
		GoogleSearch_WebDriverConf.openTab();
		GoogleSearch_WebDriverConf.openStaticURL(url); // Abro URL
		
	}

	@After
	public void tearDown() throws Exception {

		//GoogleSearch_WebDriverConf.closeAllBrowsers();
	}

	@Test
	public void test() {
		GoogleSearch_WebDriverConf.searchStaticWord(id,word); // Busco palabra
		assert word!=null:String.format("Word es null");
	}
	
	 

}
