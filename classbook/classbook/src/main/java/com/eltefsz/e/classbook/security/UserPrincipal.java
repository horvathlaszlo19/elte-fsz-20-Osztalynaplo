package com.eltefsz.e.classbook.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.eltefsz.e.classbook.domain.Person;
import com.eltefsz.e.classbook.domain.UserType;

public class UserPrincipal implements UserDetails{
	
	final private Person person;

	public UserPrincipal(Person person) {
		this.person = person;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
        GrantedAuthority auth = person.getUserType() == UserType.TEACHER ? Role.ROLE_TEACHER : Role.ROLE_STUDENT;
        list.add(auth);
        return list;
	}

	@Override
	public String getPassword() {
		return person.getPassword();
	}

	@Override
	public String getUsername() {
		return person.getUsername();
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
		return true;
	}

	


}
