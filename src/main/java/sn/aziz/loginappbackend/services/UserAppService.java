package sn.aziz.loginappbackend.services;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserAppService {
    UserDetailsService userDetailsService();
}
