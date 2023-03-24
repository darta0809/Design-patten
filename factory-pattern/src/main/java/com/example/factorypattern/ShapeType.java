package com.example.factorypattern;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ShapeType {
  CIRCLE(new Circle()), RECTANGLE(new Rectangle()), SQUARE(new Square());

  private final Shape shape;

}
