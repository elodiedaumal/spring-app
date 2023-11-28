package elodiedaumaljava.learnspringframework;

import elodiedaumaljava.learnspringframework.game.GameRunner;
import elodiedaumaljava.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {
 public static void main(String[] args) {
  var marioGame = new MarioGame();
  var gameRunner = new GameRunner(marioGame);
  gameRunner.run();
 }
}
