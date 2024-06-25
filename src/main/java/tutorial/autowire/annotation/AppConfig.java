package tutorial.autowire.annotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "tutorial.autowire.annotation")
public class AppConfig {
}

// it is the class use to configure the project using the annotation
// best alternate for the XML config
