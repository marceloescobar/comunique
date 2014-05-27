package br.gov.sp.sorocaba.comunique.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.gov.sp.sorocaba.comunique.dominio.Perfil;
import br.gov.sp.sorocaba.comunique.dominio.Usuario;
import br.gov.sp.sorocaba.comunique.dominio.wrapper.LoggedUser;
import br.gov.sp.sorocaba.comunique.repository.UsuarioRepository;

@Service
public class SecurityBO implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		Usuario user = usuarioRepository.findByUsuario(username);

		if (user == null)
			throw new UsernameNotFoundException("Usuario nao encontrado");

		LoggedUser loggedUser = new LoggedUser(user.getId(), user.getUsuario(),
				user.getSenha(), this.getAuthorities(user));

		return loggedUser;
	}
	
	private List<GrantedAuthority> getAuthorities(Usuario user) {
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
		

		for (Perfil p : user.getPerfis()) {
			list.add(new SimpleGrantedAuthority(p.getNome()));
		}
		
		return list;
	}

}
