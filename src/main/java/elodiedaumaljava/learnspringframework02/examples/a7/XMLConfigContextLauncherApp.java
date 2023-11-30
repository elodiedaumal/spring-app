package elodiedaumaljava.learnspringframework02.examples.a7;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import elodiedaumaljava.learnspringframework02.game.GameRunner;

public class XMLConfigContextLauncherApp {

 public static void main(String[] args) {

  try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
   Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

   System.out.println(context.getBean("name"));
   System.out.println(context.getBean("age"));

   context.getBean(GameRunner.class).run();

  } catch (BeansException e) {

   e.printStackTrace();
  }

  ;
 }
}
