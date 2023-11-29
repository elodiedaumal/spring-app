package elodiedaumaljava.learnspringframework02.examples.a0;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("elodiedaumaljava.learnspringframework02.examples.a1")
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
