package org.eggleston.bd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Factory;

public class AcceptanceFactory {

  @BeforeSuite(alwaysRun = true)
  public void init() throws InterruptedException {
    System.out.println("Facory Init.");
  }

  /**
   * Call Each Individual Test
   *
   * @return results from the test.
   */
  @Factory
  public Object[] create() throws IOException {
    List<Object> vResult = new ArrayList<>();

    System.out.println("Creating Suite");
    vResult.add(new TestA());
    vResult.add(new TestB());

    return vResult.toArray(new Object[vResult.size()]);
  }

}
