package no.securient.crm.SecurientCRMapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(customizer ->
                    customizer.requestMatchers("/h2-console/**").permitAll()
                        .anyRequest().authenticated()
                    )
                .csrf(AbstractHttpConfigurer::disable)
                .headers(customizer -> {
                    customizer.frameOptions().disable();
                });

        return http.build();
    }
}