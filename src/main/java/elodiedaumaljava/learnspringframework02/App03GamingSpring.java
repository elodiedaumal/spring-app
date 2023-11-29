package elodiedaumaljava.learnspringframework02;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import elodiedaumaljava.learnspringframework.game.GameConfiguration;
import elodiedaumaljava.learnspringframework.game.GameRunner;
import elodiedaumaljava.learnspringframework.game.GamingConsole;

public class App03GamingSpring {
 public static void main(String[] args) {

  try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
   context.getBean(GamingConsole.class).up();
   context.getBean(GameRunner.class).run();

  } catch (BeansException e) {

   e.printStackTrace();
  }

  ;
 }
}
