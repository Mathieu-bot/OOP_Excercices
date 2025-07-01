package oop.robot;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Robot {
  protected int x = 0;
  protected int y = 0;
  protected Direction direction = Direction.NORTH;

  public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST
  }
  void move() {
    switch (this.direction) {
      case  EAST -> this.x++;
      case  SOUTH -> this.y--;
      case  WEST -> this.x--;
      default -> this.y++;
    }
  }

  void turnRight() {
    switch (this.direction) {
      case EAST -> this.direction = Direction.SOUTH;
      case WEST -> this.direction = Direction.NORTH;
      case SOUTH -> this.direction = Direction.WEST;
      default -> this.direction = Direction.EAST;
    }
  }
}
