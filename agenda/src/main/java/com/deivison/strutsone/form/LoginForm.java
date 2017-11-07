package com.deivison.strutsone.form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {

	private String nome;
	private String email;
	private String senha;
	private String status = "Usuário não logado";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus() {
		return status;
	}
	
	

}
