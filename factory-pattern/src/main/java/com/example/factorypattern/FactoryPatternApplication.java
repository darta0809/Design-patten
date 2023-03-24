package com.example.factorypattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternApplication {

  public static void main(String[] args) {
//    SpringApplication.run(FactoryPatternApplication.class, args);

    // normal
    Shape shape1 = ShapeFactory.getShape(ShapeType.CIRCLE);
    shape1.draw();

    Shape shape2 = ShapeFactory.getShape(ShapeType.RECTANGLE);
    shape2.draw();

    Shape shape3 = ShapeFactory.getShape(ShapeType.SQUARE);
    shape3.draw();

    // enum
    ShapeType.CIRCLE.getShape().draw();
    ShapeType.RECTANGLE.getShape().draw();
    ShapeType.SQUARE.getShape().draw();
  }

}
