package elements.fruit;

import game.Position;

public class Kiwi extends Fruit {
    public Kiwi(Position position) {
        super(position);
        setSymbol("k");
        setColor("#00ff00");
        setVelocity(2);
        setSize(-5);
    }
}