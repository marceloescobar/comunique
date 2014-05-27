package br.gov.sp.sorocaba.comunique.util.security;

import org.springframework.security.core.context.SecurityContextHolder;

import br.gov.sp.sorocaba.comunique.dominio.Usuario;
import br.gov.sp.sorocaba.comunique.dominio.wrapper.LoggedUser;

public final class AuthenticatedUserCredentials {

	public static LoggedUser getPrincipal() {
		if (SecurityContextHolder.getContext().getAuthentication() != null) {
			Object obj = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

			if (obj instanceof LoggedUser) {
				return (LoggedUser) obj;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	public static Usuario obterUsuarioAutenticado() {
		LoggedUser loggedUser = AuthenticatedUserCredentials.getPrincipal();
		Usuario usuario = new Usuario(loggedUser.getIdentificador());

		return usuario;
	}
}
