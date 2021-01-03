package pl.javastart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.bean.NamesRepository;

import java.util.List;

@Configuration
@ComponentScan
public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDiApplication.class);
        NamesRepository namesRepository = context.getBean(NamesRepository.class);
        List<String> all = namesRepository.getAll();

        all.forEach(System.out::println);

        context.close();
    }
}
