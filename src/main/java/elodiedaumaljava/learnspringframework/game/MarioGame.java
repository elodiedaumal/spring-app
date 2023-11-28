package elodiedaumaljava.learnspringframework.game;

public class MarioGame implements GamingConsole {

 public void up() {
  System.out.println("Jump");
 }

 public void down() {
  System.out.println("Get inside hole");
 }

 public void left() {
  System.out.println("Get back");
 }

 public void right() {
  System.out.println("Move Forward");
 }
}
