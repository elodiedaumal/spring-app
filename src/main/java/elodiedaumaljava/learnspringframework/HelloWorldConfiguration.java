package elodiedaumaljava.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Adress adress) {
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
 public String name2() {
  return "Luffy";
 }

 @Bean
 public int age2() {
  return 20;
 }

 @Bean
 public Person person() {
  var person = new Person("Elisa", 37, new Adress("street", 007, 29000, "the best"));
  return person;
 }

 @Bean
 public Person person2() {
  var person = new Person(name(), age(), adress());
  return person;
 }

 @Bean
 public Person person3(String name, int age, Adress adress2) {
  var person = new Person(name, age, adress2);
  return person;
 }

 @Bean(name = "adress2")
 public Adress adress() {

  return new Adress("Calle Gardenias", 19, 29013, "Malaga");
 }

}
