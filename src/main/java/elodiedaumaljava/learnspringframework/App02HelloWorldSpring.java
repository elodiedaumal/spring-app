package elodiedaumaljava.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
 public static void main(String[] args) {

  var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

  System.out.println("My name is " + context.getBean("name"));
  System.out.println("I am " + context.getBean("age"));
  System.out.println("person 1 " + context.getBean("person"));
  System.out.println("person 2 " + context.getBean("person2"));
  System.out.println("person 3 " + context.getBean("person3"));
  System.out.println("address " + context.getBean("adress2"));
  System.out.println("address primary " + context.getBean(Adress.class));
  System.out.println("address qualifier " + context.getBean("adress3"));
  // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println)

  ;
 }
}
