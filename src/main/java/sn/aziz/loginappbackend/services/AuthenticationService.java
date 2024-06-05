package sn.aziz.loginappbackend.services;

import sn.aziz.loginappbackend.dao.request.SignUpRequest;
import sn.aziz.loginappbackend.dao.request.SigninRequest;
import sn.aziz.loginappbackend.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);

}
