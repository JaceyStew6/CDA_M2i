package com.example.springsecurityjwt.config.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;
import java.util.stream.Collectors;

@Component
public class JwtTokenProvider {

    //On récupère le token qui se trouve dans application.properties
    @Value("${jwt.secret}")
    private String secret;

    //On convertit la chaine de caractère en SecretKey
    private SecretKey getSigninKey(){
        byte[] keybytes = Base64.getDecoder().decode(secret);
        return Keys.hmacShaKeyFor(keybytes);
    }

    //Attention de bien prendre l'interface Authentication dont la source est org.springframework.security.core.Authentication
    public String generateToken(Authentication authentication){
        String username = authentication.getName();
        Date currentDate = new Date();
        Date expireDate = new Date(currentDate.getTime()+86400000); //Définit une validité de 24h, exprimé en milLisecondes
        String roles = authentication.getAuthorities().stream().map(grantedAuthority -> grantedAuthority.getAuthority()).collect(Collectors.joining(",")); //map effectue une action sur chaque élément et va modifier. Quand on va modifier, on va à la fin récupérer le résultat de la modification

        String token = Jwts.builder()
                .setSubject(username)
                .claim("roles", roles)
                .setIssuedAt(new Date())
                .setExpiration(expireDate)
                .signWith(getSigninKey(), SignatureAlgorithm.HS512)
                .compact();
        return token;
    }

    public boolean validateToken(String token){
        try {
            Jwts.parserBuilder()
                    .setSigningKey(getSigninKey())
                    .build()
                    .parseClaimsJws(token);
            return true;
        }catch (Exception e){
            throw new AuthenticationCredentialsNotFoundException("JWT was expired or incorrect");
        }
    }

    public String getUsernameFromToken(String token){
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(getSigninKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

}
