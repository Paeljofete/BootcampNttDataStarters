package com.nttdata.nttdatacenters_saludo_config_psp;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("saludo.mensaje")
public class SaludoProperties {
	
	private String idioma = "Castellano";

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
}
