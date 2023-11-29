package elodiedaumaljava.learnspringframework02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("StreetFighterQualifier")
public class StreetFighter implements GamingConsole {

 public void up() {
  System.out.println("Move up");
 }

 public void down() {
  System.out.println("Move down");
 }

 public void left() {
  System.out.println("Shoot");
 }

 public void right() {
  System.out.println("Kick");
 }
}
