/*package com.example.servicemetier;

import com.example.dto.AuthenticationRequest;
import com.example.dto.AuthenticationResponse;
import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.security.JwtService;
import com.example.poc.security.SecurityConfig;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final JwtService jwtService;

    public AuthenticationService(
        AuthenticationManager authenticationManager,
        UserRepository userRepository,
        JwtService jwtService
    ) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.jwtService = jwtService;
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        // Authentifier l'utilisateur
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.getUsername(),
                request.getPassword()
            )
        );

        // Récupérer l'utilisateur depuis la BDD
        User user = userRepository.findByUsername(request.getUsername())
                                  .orElseThrow(() -> new RuntimeException("User not found"));

        // Générer le token JWT
        String jwtToken = jwtService.generateToken(user);

        // Retourner la réponse (avec username et rôle)
        return new AuthenticationResponse(jwtToken, user.getUsername(), user.getRole().name());
    }
}
*/