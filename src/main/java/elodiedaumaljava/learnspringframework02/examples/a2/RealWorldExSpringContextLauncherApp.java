package elodiedaumaljava.learnspringframework02.examples.a2;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("elodiedaumaljava.learnspringframework02.examples.a2")
public class RealWorldExSpringContextLauncherApp {

 public static void main(String[] args) {

  try (var context = new AnnotationConfigApplicationContext(RealWorldExSpringContextLauncherApp.class)) {
   Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

   System.out.println(context.getBean(BusinessCalculationService.class).findMax());

  } catch (BeansException e) {

   e.printStackTrace();
  }

  ;
 }
}
