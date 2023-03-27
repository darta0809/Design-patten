package com.example.abstractfactorypattern;

import static com.example.abstractfactorypattern.BuildingBlockEnum.COLOR;
import static com.example.abstractfactorypattern.BuildingBlockEnum.SHAPE;
import static com.example.abstractfactorypattern.ColorEnum.RED;
import static com.example.abstractfactorypattern.ColorEnum.WHITE;
import static com.example.abstractfactorypattern.ShapeEnum.CIRCLE;
import static com.example.abstractfactorypattern.ShapeEnum.SQUARE;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryPatternApplication {

  public static void main(String[] args) {
//    SpringApplication.run(AbstractFactoryPatternApplication.class, args);

    BuildingBlock shapeFactory = FactoryProducer.getFactory(SHAPE);
    Shape circle = shapeFactory.getShape(CIRCLE);
    circle.draw();

    Shape square = shapeFactory.getShape(SQUARE);
    square.draw();

    BuildingBlock colorFactory = FactoryProducer.getFactory(COLOR);
    Color red = colorFactory.getColor(RED);
    red.fill();

    Color white = colorFactory.getColor(WHITE);
    white.fill();
  }

}
