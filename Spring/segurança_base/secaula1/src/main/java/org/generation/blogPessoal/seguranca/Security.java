package org.generation.blogPessoal.seguranca;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		
//		.antMatchers(HttpMethod.POST, "/tema").permitAll()
		.antMatchers(HttpMethod.POST, "/postagens").permitAll()
//		.antMatchers(HttpMethod.GET, "/tema").permitAll()
		.anyRequest().authenticated()
		
		//abre o caminho de entrada
//		.and().formLogin().permitAll()
		//abre o caminho para a saída do usuário
//		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

		.and().csrf().disable();
		
	}
}
