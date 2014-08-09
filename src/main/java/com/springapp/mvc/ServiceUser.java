package com.springapp.mvc;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Beta on 8/9/14.
 */

public class ServiceUser implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        String username = "albert";
        String password = "betka";
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;//user.getStatus().equals(UserStatus.ACTIVE);
        boolean accountNonLocked = true;//user.getStatus().equals(UserStatus.ACTIVE);

        org.springframework.security.core.userdetails.User securityUser = new
                org.springframework.security.core.userdetails.User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        return securityUser;
    }
}
