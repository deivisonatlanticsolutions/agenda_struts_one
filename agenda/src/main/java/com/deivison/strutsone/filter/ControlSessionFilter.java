package com.deivison.strutsone.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deivison.strutsone.utils.UsuarioValidate;

@WebFilter("/*")
public class ControlSessionFilter implements Filter {

    public ControlSessionFilter() {   }

	public void destroy() {	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		String uri = req.getRequestURI();
		
		if((session != null && UsuarioValidate.validaUsuario(session.getAttribute("usuario"))) || uri.equals("/login.do") || uri.equals("/"))
			chain.doFilter(request, response);
		else{
			req.setAttribute("status", "Usuario não logado!");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException { }

}
