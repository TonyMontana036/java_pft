package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

@Test
  public void testPoints(){
    Point p = new Point(3, 2);
    //assert p.length() >= 0 ;
  Assert.assertEquals(p.length(), 1);
  }
}
