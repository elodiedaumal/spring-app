package elodiedaumaljava.learnspringframework02.examples.a4;

import java.util.Arrays;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApp {

 public static void main(String[] args) {

  try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApp.class)) {

   System.out.println(context.getBean(NormalClass.class));
   System.out.println(context.getBean(NormalClass.class));

   System.out.println(context.getBean(PrototypeClass.class));
   System.out.println(context.getBean(PrototypeClass.class));
   System.out.println(context.getBean(PrototypeClass.class));

  } catch (BeansException e) {

   e.printStackTrace();
  }

  ;
 }
}
