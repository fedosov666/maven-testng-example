package com.mycompany.app;

import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Second tests")
public class Test2 {

  @Test
  public void test2(){
    System.out.println("Running test 2");
  }

  @Test
  public void test1(){
    System.out.println("Running test 1");
  }

  @Test
  public void test3(){
    System.out.println("Running test 3");
  }

  @Test
  public void test4(){
    System.out.println("Running test 4");
  }


}
