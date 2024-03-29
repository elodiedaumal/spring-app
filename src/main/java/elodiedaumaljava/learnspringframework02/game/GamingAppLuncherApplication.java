package elodiedaumaljava.learnspringframework02.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("elodiedaumaljava.learnspringframework02.game")
public class GamingAppLuncherApplication {

 public static void main(String[] args) {

  try (var context = new AnnotationConfigApplicationContext(GamingAppLuncherApplication.class)) {
   context.getBean(GamingConsole.class).up();
   context.getBean(GameRunner.class).run();

  } catch (BeansException e) {

   e.printStackTrace();
  }

  ;
 }
}
