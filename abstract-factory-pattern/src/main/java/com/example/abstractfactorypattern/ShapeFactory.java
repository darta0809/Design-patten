package com.example.abstractfactorypattern;

public class ShapeFactory implements BuildingBlock {

  @Override
  public Color getColor(ColorEnum color) {
    return null;
  }

  @Override
  public Shape getShape(ShapeEnum shapeType) {
    switch (shapeType) {
      case CIRCLE -> {
        return new Circle();
      }
      case SQUARE -> {
        return new Square();
      }
      default -> {
        return null;
      }
    }
  }
}
