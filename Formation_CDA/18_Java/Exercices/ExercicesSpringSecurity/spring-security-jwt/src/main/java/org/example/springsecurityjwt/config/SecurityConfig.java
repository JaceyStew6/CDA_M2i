package org.example.springsecurityjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean //On l'annote puisqu'on va en avoir besoin à différents endroits
    public PasswordEncoder passwordEncoder(){ //Cette méthode retourne une interface
        return new BCryptPasswordEncoder();
    }

    //Gère pour nous les AuthenticationProviders
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(Customizer.withDefaults())
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/api/products/").permitAll() //requestMatcher est polyvalent // Ici on autorise l'accès à la route /api/products/ à tout le monde
                        .requestMatchers("api/products/add").hasRole("ADMIN") //Ici on autorise l'accès à la route api/products/add pour un utilisateur ayant le rôle ADMIN
                )
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    //Ce service sera utilisé pour apporter de l'authentification
/*    @Bean
    public UserDetailsService inMemoryUserDetailsService(){
        UserDetails user = User.withUsername("user") //UserDetails permet de récupérer des informations d'authentification. On récupère toujours un UserDetails //Récupérer User dans security.core.UserDetails
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .build();

        UserDetails user1 = User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, user1); //Ici on a l'implémentation de l'interface UserDetails
    }*/

}