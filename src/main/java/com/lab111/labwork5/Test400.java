package com.lab111.labwork5;

/**
 * Class for testing labwork5.
 *
 * @author Roma Bondarenko
 */
public class Test400 {
    public static void main(String[] args) {
        Mediator gameSpace = new GameSpace();
        gameSpace.registerComponent(new GameCell(100));
        gameSpace.registerComponent(new GameCell(50));
        gameSpace.registerComponent(new GameCell(110));
        gameSpace.registerComponent(new GameCell(40));
        gameSpace.registerComponent(new GameCell(60));

        System.out.println(gameSpace.getArea());

        gameSpace.resize(100);

        System.out.println(gameSpace.getArea());
    }
}
