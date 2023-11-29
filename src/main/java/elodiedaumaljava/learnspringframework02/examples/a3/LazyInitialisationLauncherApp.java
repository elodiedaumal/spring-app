package elodiedaumaljava.learnspringframework02.examples.a3;

import java.util.Arrays;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {

 private ClassA classA;

 public ClassB(ClassA classA) {
  System.out.println("Some Initialization logic");
  this.classA = classA;
 }

 public void doSomething() {
  System.out.println("Do something");
 }
}

@Configuration
@ComponentScan
public class LazyInitialisationLauncherApp {

 public static void main(String[] args) {

  try (var context = new AnnotationConfigApplicationContext(LazyInitialisationLauncherApp.class)) {

   System.out.println("Initialization of context is completed");
   context.getBean(ClassB.class).doSomething();
  } catch (BeansException e) {

   e.printStackTrace();
  }

  ;
 }
}
