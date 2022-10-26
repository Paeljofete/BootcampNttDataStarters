package com.nttdata.nttdatacenters_saludo_config_psp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.nttdatacenters_starters_psp.Saludo;

@Configuration
@ConditionalOnClass(Saludo.class)
@EnableConfigurationProperties(SaludoProperties.class)
public class SaludoAutoconfigure {

	private final SaludoProperties properties;

	public SaludoAutoconfigure(SaludoProperties properties) {
		this.properties = properties;
	}

	@Bean
	public Saludo saludo() {
		return new Saludo(properties.getIdioma());
	}

}