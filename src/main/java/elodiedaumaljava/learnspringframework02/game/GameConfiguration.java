package elodiedaumaljava.learnspringframework02.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import elodiedaumaljava.learnspringframework.game.GamingConsole;
import elodiedaumaljava.learnspringframework.game.MarioGame;

@Configuration
public class GameConfiguration {

 @Bean
 @Primary
 public GamingConsole game() {
  var game = new MarioGame();
  return game;
 }

 @Bean
 public GameRunner gameRunner(GamingConsole game) {
  var gameRunner = new GameRunner(game);

  return gameRunner;
 }

 @Bean
 public GamingConsole game2() {
  var game = new Pacman();
  return game;
 }

 @Bean
 public GamingConsole game3() {
  var game = new StreetFighter();
  return game;
 }

}
