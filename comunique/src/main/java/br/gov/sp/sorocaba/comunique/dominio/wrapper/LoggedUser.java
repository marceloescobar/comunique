package br.gov.sp.sorocaba.comunique.dominio.wrapper;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class LoggedUser implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer identificador;
	
	private String usuario;

	private String senha;


	private boolean ativo = Boolean.TRUE;
	
	private List<GrantedAuthority> authorities;
	
	
	public LoggedUser(Integer identificador, String usuario, String senha, List<GrantedAuthority> authorities) {
		this.identificador = identificador;
		this.usuario = usuario;
		this.senha = senha;
		//this.ativo = ativo;
		//this.email = email;
		//this.tentativasLogin = tentativasLogin;
		this.authorities = authorities;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return usuario;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return ativo;
	}


	public Integer getIdentificador() {
		return identificador;
	}

	
}
