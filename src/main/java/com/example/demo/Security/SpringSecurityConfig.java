package com.example.demo.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;


@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
    private AccessDeniedHandler accessDeniedHandler;

	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .authorizeRequests()
	                    .antMatchers(
	                            "/vistaIndex",
	                            "/vistaLogin",
	                            "/js/**",
	                            "/css/**",
	                            "/images/**").permitAll()
	                    .antMatchers("/user/**").hasRole("USER").
	                     antMatchers("/admin/**").hasRole("ADMIN")
	                    .anyRequest().authenticated()
	                .and()
	                .formLogin()
	                    .loginPage("/vistaLogin")
	                    .permitAll()
	                .and()
	                .logout()
	                    .logoutSuccessUrl("/login?logout")
	                    .permitAll();
	                
	    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("admin").password("fer").roles("USER");
                
    }
}
