package ru.stqa.pft.sandbox;

public class FullDistance {
  public static void main(String[] args) {

    Point p = new Point(3, 2);

    System.out.println(length(p));
  }
  public static double length (Point p){
    return p.x - p.y;
  }
}
