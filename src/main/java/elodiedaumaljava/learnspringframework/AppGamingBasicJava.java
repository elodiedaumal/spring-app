package elodiedaumaljava.learnspringframework;

import elodiedaumaljava.learnspringframework.game.GameRunner;
import elodiedaumaljava.learnspringframework.game.MarioGame;
import elodiedaumaljava.learnspringframework.game.Pacman;
import elodiedaumaljava.learnspringframework.game.StreetFighter;

public class AppGamingBasicJava {
 public static void main(String[] args) {

  var game = new StreetFighter();
  // var game = new Pacman();
  // var game = new MarioGame();
  var gameRunner = new GameRunner(game);
  gameRunner.run();
 }
}
