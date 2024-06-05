package sn.aziz.loginappbackend.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sn.aziz.loginappbackend.repositories.UserAppRepository;
import sn.aziz.loginappbackend.services.UserAppService;

@Service
@RequiredArgsConstructor
public class UserAppServiceImpl implements UserAppService {

    private final UserAppRepository userAppRepository;

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) {
                return userAppRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            }
        };
    }

}
