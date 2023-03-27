package com.example.abstractfactorypattern;

public interface BuildingBlock {

  Color getColor(ColorEnum color);

  Shape getShape(ShapeEnum shape);
}
