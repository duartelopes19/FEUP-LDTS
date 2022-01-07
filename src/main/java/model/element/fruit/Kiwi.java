package model.element.fruit;

import model.Position;

public class Kiwi extends Fruit {
    public Kiwi(Position position) {
        super(position);
        setSymbol("k");
        setColor("green");
        setVelocity(1);
        setSize(4);
    }
}