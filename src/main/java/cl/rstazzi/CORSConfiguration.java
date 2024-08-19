package cl.rstazzi;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CORSConfiguration {
	
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")// Para todos los métodos
                        .allowedMethods("*")// Para cualquier TIPO de método
                        .allowedOrigins("*"); // todos los orígenes permitidos
            }
        };
    }

}
