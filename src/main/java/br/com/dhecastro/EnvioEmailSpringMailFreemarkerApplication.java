package br.com.dhecastro;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.dhecastro.model.MailRequest;
import br.com.dhecastro.model.MailResponse;
import br.com.dhecastro.service.EmailService;

@RestController
@SpringBootApplication
public class EnvioEmailSpringMailFreemarkerApplication {

	@Autowired
	private EmailService service;

	@PostMapping("/enviandoEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Nome", request.getNome());
		model.put("Local", "Fortaleza-CE, Brasil");
		return service.sendEmail(request, model);

	}
	
	public static void main(String[] args) {
		SpringApplication.run(EnvioEmailSpringMailFreemarkerApplication.class, args);
	}

}
