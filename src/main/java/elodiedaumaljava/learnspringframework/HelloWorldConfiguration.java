package elodiedaumaljava.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Adress(String street, int number, int postcode, String city) {
}

@Configuration
public class HelloWorldConfiguration {

 @Bean
 public String name() {
  return "Elodie";
 }

 @Bean
 public int age() {
  return 35;
 }

 @Bean
 public Person person() {
  var person = new Person("Elisa", 37);
  return person;
 }

 @Bean
 public Adress adress() {

  return new Adress("Calle Gardenias", 19, 29013, "Malaga");
 }

}
