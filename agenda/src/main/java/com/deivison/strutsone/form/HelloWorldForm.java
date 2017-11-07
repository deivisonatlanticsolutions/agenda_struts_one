package com.deivison.strutsone.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5283930512918914049L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
