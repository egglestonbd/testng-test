package org.eggleston.bd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestB {


  @BeforeClass(alwaysRun = true)
  public void setup() {
    System.out.println("TestB Setup");
  }

  @Test(groups = {"acceptance"})
  public void shouldB1() throws InterruptedException {
    Thread.sleep(500);
    System.out.println("B1");
  }

  @Test(groups = {"acceptance"}, dependsOnMethods = "shouldB1")
  public void shouldB2() {
    System.out.println("B2");
  }


  @Test(groups = {"acceptance"}, dependsOnMethods = "shouldB2")
  public void shouldB3() throws InterruptedException {
    Thread.sleep(500);
    System.out.println("B3");
  }

  @Test(groups = {"acceptance"}, dependsOnMethods = "shouldB3")
  public void shouldB4() {
    System.out.println("B4");
  }

  @Test(groups = {"acceptance"}, dependsOnMethods = "shouldB4")
  public void shouldB5() throws InterruptedException {
    Thread.sleep(500);
    System.out.println("B5");
  }

}
