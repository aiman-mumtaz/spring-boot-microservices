package com.aiman.spring.springboot_revisit.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("SuperContraGame Jump");
    }
    public void down() {
        System.out.println("SuperContraGame Go into a hole");
    }
    public void left() {
        System.out.println("SuperContraGame Go back");
    }
    public void right() {
        System.out.println("SuperContraGame Accelerate");
    }
}
