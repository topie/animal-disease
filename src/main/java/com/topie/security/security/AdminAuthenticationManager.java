package com.topie.security.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenguojun on 2017/5/17.
 */
public class AdminAuthenticationManager implements AuthenticationManager {

    static final List<GrantedAuthority> AUTHORITIES = new ArrayList<GrantedAuthority>();

    static {

        AUTHORITIES.add(new SimpleGrantedAuthority("1"));

    }

    @Override
    public Authentication authenticate(Authentication auth)

            throws AuthenticationException {

        return new UsernamePasswordAuthenticationToken(auth.getName(),

                auth.getCredentials(), AUTHORITIES);

    }

    public Authentication authenticate(String adminName) {
        return new UsernamePasswordAuthenticationToken(adminName,

                "", AUTHORITIES);
    }

}
