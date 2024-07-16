package com.m2ibank.config.jwt;

import com.m2ibank.model.User;
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

    @Value("${jwt.secret}")
    private String secret;

    private SecretKey getSigninKey(){
        byte[] keybytes = Base64.getDecoder().decode(secret);
        return Keys.hmacShaKeyFor(keybytes);
    }

    //TODO ajouter id pour pouvoir le récupérer
    public String generateToken(Authentication authentication){
        String username = authentication.getName();
        Date currentDate = new Date();
        Date expireDate = new Date(currentDate.getTime()+86400000);
        String roles = authentication.getAuthorities().stream().map(grantedAuthority -> grantedAuthority.getAuthority()).collect(Collectors.joining(","));
        User user = (User) authentication.getPrincipal();
        String id = user.getId().toString();

        String token = Jwts.builder()
                .setSubject(username)
                .claim("roles", roles)
                .claim("user_id", id)
                .setIssuedAt(new Date())
                .setExpiration(expireDate)
                .signWith(getSigninKey(), SignatureAlgorithm.HS512)
                .compact();

//        Long id = Long.valueOf(getIdFromToken(token));
        return token;
    }

    public boolean validateToken(String token){
        try {
            Jwts.parserBuilder()
                    .setSigningKey(getSigninKey())
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e){
            throw new AuthenticationCredentialsNotFoundException("JWT is expired or incorrect");
        }
    }

/*    public String getIdFromToken(String token){
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(getSigninKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }*/

    public String getUsernameFromToken(String token){
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(getSigninKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }
}