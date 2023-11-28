package elodiedaumaljava.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
 public Person person3(String name2, int age2, @Qualifier("adress3") Adress adress3) {
  var person = new Person(name2, age2, adress3);
  return person;
 }

 @Bean(name = "adress2")
 @Primary
 public Adress adress() {

  return new Adress("Calle Gardenias", 19, 29013, "Malaga");
 }

 @Bean(name = "adress3")
 @Qualifier("adress3")
 public Adress adress3() {

  return new Adress("street name", 01, 29013, "Montcul");
 }

}
