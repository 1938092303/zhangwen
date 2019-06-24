package com.suneee.start;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
       // http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
        http.csrf().disable();
        super.configure(http);
        //注意：为了可以使用 http://${user}:${password}@${host}:${port}/eureka/ 这种方式登录,所以必须是httpBasic,如果是form方式,不能使用url格式登录
       // http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }

    /*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
       auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).
        withUser("zhangwen").password("523313").roles("user");
    }*/

}
