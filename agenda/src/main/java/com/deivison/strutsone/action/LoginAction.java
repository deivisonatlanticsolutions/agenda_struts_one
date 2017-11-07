package com.deivison.strutsone.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.deivison.strutsone.form.LoginForm;
import com.deivison.strutsone.model.Usuario;

public class LoginAction extends Action{
	private Usuario usuario;
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		LoginForm loginForm = (LoginForm) form;
		usuario = new Usuario(loginForm.getNome(), loginForm.getEmail(), loginForm.getSenha());
		
		if(usuario != null && !usuario.getNome().isEmpty() && !usuario.getEmail().isEmpty() && usuario.getSenha().equalsIgnoreCase("0i02I990#")){
			request.getSession().setAttribute("usuario", usuario);
			return mapping.findForward("success");
		}
		else
			return mapping.findForward("error");
		
	}
}
