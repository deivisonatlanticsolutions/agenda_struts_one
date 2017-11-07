package com.deivison.strutsone.utils;

import com.deivison.strutsone.model.Usuario;

public class UsuarioValidate {

	public static boolean validaUsuario(Object obj){
		if(obj != null && obj instanceof Usuario)
			return true;
		else
			return false;
	}
}
