package com.example.abstractfactorypattern;

public class ColorFactory implements BuildingBlock {

  @Override
  public Color getColor(ColorEnum color) {
    switch (color) {
      case RED -> {
        return new Red();
      }
      case WHITE -> {
        return new White();
      }
      default -> {
        return null;
      }
    }
  }

  @Override
  public Shape getShape(ShapeEnum shapeType) {
    return null;
  }
}
