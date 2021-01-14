package io.chaosiy.mqas.api.sample.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HomeController {
	
	@Value("${some.custom.props.to.check:piyaz}")
	private String porpTest;

	@GetMapping("/search/{term}")
	public String getResponse(@PathVariable String term) {
		return "Search for: " + term;
	}

	@GetMapping("/echo")
	public String echoecho() {
		return "echo echo: " + porpTest;
	}

}
