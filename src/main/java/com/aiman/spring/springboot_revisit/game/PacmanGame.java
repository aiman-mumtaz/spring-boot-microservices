package com.aiman.spring.springboot_revisit.game;

public class PacmanGame implements GamingConsole{
    public void up() {
        System.out.println("PacmanGame Jump");
    }
    public void down() {
        System.out.println("PacmanGame Go into a hole");
    }
    public void left() {
        System.out.println("PacmanGame Go back");
    }
    public void right() {
        System.out.println("PacmanGame Accelerate");
    }
}
