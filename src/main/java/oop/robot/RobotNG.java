package oop.robot;

public class RobotNG extends Robot {
  public RobotNG(int x, int y, Direction direction) {
    super(x, y, direction);
  }

  void turnLeft() {
    for (int i = 0; i < 3; i++) {
      turnRight();
    }
  };

  void move(int steps) {
    for (int i = 0; i < steps; i++) {
      move();
    }
  }

  void moveBack(int steps) {
    for (int i = 0; i < 2; i++) {
      turnRight();
    }
    move(steps);
    for (int i = 0; i < 2; i++) {
      turnRight();
    }
  }

  void moveBack() {
    for (int i = 0; i < 2; i++) {
      turnRight();
    }
    move();
    for (int i = 0; i < 2; i++) {
      turnRight();
    }
  }
}
