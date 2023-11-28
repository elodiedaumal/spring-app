package elodiedaumaljava.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
 public static void main(String[] args) {

  var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

  System.out.println("My name is " + context.getBean("name"));
  System.out.println("I am " + context.getBean("age"));
  System.out.println(context.getBean("person"));
  System.out.println(context.getBean("person2"));
  System.out.println(context.getBean("person3"));
  System.out.println(context.getBean("adress2"));
  System.out.println(context.getBean(Adress.class));
 }
}
