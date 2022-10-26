package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.nttdatacenters_starters_psp.Saludo;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class Controller {

	@Autowired
	private Saludo saludo;

	@GetMapping(path = "/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}
	
	private Counter counter;

	public void PruebaController(MeterRegistry registry) {
	        this.counter = Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);
	    }

	@GetMapping(path="/helloWorld")
	    public String helloWorld() {
	        counter.increment();
	        return "hello World";
	    }

}
