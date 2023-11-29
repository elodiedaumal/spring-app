package elodiedaumaljava.learnspringframework02.examples.a1;

import java.util.Arrays;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBuisnessClass {

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApp {

 public static void main(String[] args) {

  try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApp.class)) {
   Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

  } catch (BeansException e) {

   e.printStackTrace();
  }

  ;
 }
}
