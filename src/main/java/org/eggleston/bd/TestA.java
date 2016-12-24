package org.eggleston.bd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA {

  @BeforeClass(alwaysRun = true)
  public void setup()  {
    System.out.println("TestA Setup.");

  }

  @Test(groups = {"acceptance"})
  public void shouldA1(){
    System.out.println("A1");
  }

  @Test(groups = {"acceptance"}, dependsOnMethods = "shouldA1")
  public void shouldA2() {
    System.out.println("A2");
  }


  @Test(groups = {"acceptance"}, dependsOnMethods = "shouldA2")
  public void shouldA3() {
    System.out.println("A3");
  }

  @Test(groups = {"acceptance"}, dependsOnMethods = "shouldA3")
  public void shouldA4(){
    System.out.println("A4");
  }

  @Test(groups = {"acceptance"}, dependsOnMethods = "shouldA4")
  public void shouldA5(){
    System.out.println("A5");
  }

}
