package com.example.abstractfactorypattern;

import static com.example.abstractfactorypattern.BuildingBlockEnum.COLOR;
import static com.example.abstractfactorypattern.BuildingBlockEnum.SHAPE;

public class FactoryProducer {

  public static BuildingBlock getFactory(BuildingBlockEnum choice) {
    if (choice == SHAPE) {
      return new ShapeFactory();
    } else if (choice == COLOR) {
      return new ColorFactory();
    }
    return null;
  }
}
