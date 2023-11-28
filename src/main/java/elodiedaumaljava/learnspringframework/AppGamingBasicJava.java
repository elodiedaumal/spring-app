package elodiedaumaljava.learnspringframework;

import elodiedaumaljava.learnspringframework.game.GameRunner;
import elodiedaumaljava.learnspringframework.game.MarioGame;
import elodiedaumaljava.learnspringframework.game.Pacman;

public class AppGamingBasicJava {
 public static void main(String[] args) {
  // var marioGame = new MarioGame();
  var pacman = new Pacman();
  var gameRunner = new GameRunner(pacman);
  gameRunner.run();
 }
}
