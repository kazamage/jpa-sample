package jp.pgw.develop.swallow.sample.rest.api.v1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@EnableWebMvc
public class RestApiV1Config extends WebMvcConfigurerAdapter {
}
