package com.example.factorypattern;

import javax.lang.model.type.UnknownTypeException;

public class ShapeFactory {

  public static Shape getShape(ShapeType type) {

    switch (type) {
      case CIRCLE -> {
        return new Circle();
      }
      case SQUARE -> {
        return new Square();
      }
      case RECTANGLE -> {
        return new Rectangle();
      }
      default -> throw new UnknownTypeException(null, type);
    }
  }
}
