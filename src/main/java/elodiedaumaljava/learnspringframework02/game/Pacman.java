package elodiedaumaljava.learnspringframework02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Pacman implements GamingConsole {

 public void up() {
  System.out.println("Move up");
 }

 public void down() {
  System.out.println("Move down");
 }

 public void left() {
  System.out.println("Move left");
 }

 public void right() {
  System.out.println("Move right");
 }
}
