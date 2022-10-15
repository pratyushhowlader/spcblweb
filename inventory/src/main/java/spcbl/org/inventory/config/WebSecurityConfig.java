package spcbl.org.inventory.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import spcbl.org.inventory.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());

        return authProvider;
    }



    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .authenticationProvider(authenticationProvider()).authorizeRequests()
               /* .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()*/
                .antMatchers("/resources/**","/resources/","/fonts/**").permitAll()
                .antMatchers("/").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("txtUserName")
                .passwordParameter("txtPassword")
                .defaultSuccessUrl("/")
                .permitAll()
                .and()
                .logout().permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/403")
        ;
        return http.build();
    }

  /*  protected void configure(WebSecurity webSecurity) throws Exception{
        webSecurity.ignoring().antMatchers("/resources/**");

    }*/
 /* @Bean
  public WebSecurityCustomizer ignoringCustomizer() {
      return (web) -> web.ignoring().antMatchers("/resources/**");
  }*/
}
