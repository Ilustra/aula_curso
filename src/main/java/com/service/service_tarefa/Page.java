package com.service.service_tarefa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Page {
	@GetMapping
	public String HellowWOrd() {
		return "olá, seja-bemvindo";
	}

}
