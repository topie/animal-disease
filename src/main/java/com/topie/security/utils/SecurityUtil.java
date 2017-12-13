package com.topie.security.utils;

import com.topie.security.security.OrangeSecurityUser;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by cgj on 2015/10/26.
 */
public class SecurityUtil {

    public static String getCurrentUserName() {
        if (SecurityContextHolder.getContext() == null) return null;
        if (SecurityContextHolder.getContext().getAuthentication() == null) return null;
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null) return null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String userName = null;
        if (principal instanceof OrangeSecurityUser) userName = ((OrangeSecurityUser) principal).getUsername();
        return userName;
    }

    public static Integer getCurrentUserId() {
        if (SecurityContextHolder.getContext() == null) return null;
        if (SecurityContextHolder.getContext().getAuthentication() == null) return null;
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null) return null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer userId = null;
        if (principal instanceof OrangeSecurityUser) userId = ((OrangeSecurityUser) principal).getId();
        return userId;
    }

    public static OrangeSecurityUser getCurrentSecurityUser() {
        if (SecurityContextHolder.getContext() == null) return null;
        if (SecurityContextHolder.getContext().getAuthentication() == null) return null;
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null) return null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof OrangeSecurityUser) return (OrangeSecurityUser) principal;
        return null;
    }

    public static String encodeString(String character) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(character);
    }

    public static boolean matchString(String character, String encodedCharacter) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(character, encodedCharacter);
    }

}
