package com.puricellafederico.my_app_calcio.configuration;

import org.apache.velocity.Template;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Properties;

@Configuration
public class Configurations {

    @Bean
    public VelocityEngine velocityEngine() {
        Properties properties = new Properties();
        properties.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        properties.setProperty("file.resource.loader.path", "/templates");
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init(properties);
        return velocityEngine;
    }

    @Bean
    public Template teamTemplate(VelocityEngine velocityEngine) {
        return velocityEngine.getTemplate("templates/schemasDiagram.plantuml");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
