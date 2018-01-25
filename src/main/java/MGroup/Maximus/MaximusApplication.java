package MGroup.Maximus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import th.co.maximus.config.ConfigApp;

@SpringBootApplication
@Import(ConfigApp.class)
public class MaximusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaximusApplication.class, args);
	}
	
//	@Bean
//    public ViewResolver getViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/pages/");
//        resolver.setSuffix(".jsp");
//        resolver.setViewClass(JstlView.class);
//        return resolver;
//    }
}