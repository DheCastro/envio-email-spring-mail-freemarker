package br.com.dhecastro.model;

import lombok.Data;

@Data
public class MailRequest {
	
	private String nome;
	private String para;
	private String de;
	private String assunto;

}
