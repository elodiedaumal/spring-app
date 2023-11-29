package elodiedaumaljava.learnspringframework02.examples.a5;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
 private SomeDependency someDependency;

 public SomeClass(SomeDependency someDependency) {
  super();
  this.someDependency = someDependency;
  System.out.println("All dependencies are Ready!!!!!");

 }

 @PostConstruct
 public void initialization() {
  someDependency.getReady();
 }

 @PreDestroy
 public void cleanup() {
  System.out.println("Cleanup all");
 }
}

@Component
class SomeDependency {

 public void getReady() {
  System.out.println("Some logic using Some Dependency");
 }

}

@Configuration
@ComponentScan
public class PrePostAnnotationscontextLauncherApp {

 public static void main(String[] args) {

  try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationscontextLauncherApp.class)) {
   Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

  } catch (BeansException e) {

   e.printStackTrace();
  }

  ;
 }
}
