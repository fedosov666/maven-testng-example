package com.mycompany.app;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Issue;

public class Test1 {

  @Test
  public void test1(){
    System.out.println("Running test 1");
    Assert.assertTrue(true);
  }

  @Test
  public void test2(){
    System.out.println("Running test 2");
  }

  @Test
  @Issue("bug")
  public void test3(){
    System.out.println("Running test 3");
    Assert.assertTrue(false);
  }

  @Test
  public void test4(){
    System.out.println("Running test 4");
  }

  @Test
  public void test5(){
    System.out.println("Running test 5");
    Assert.assertTrue(false);
  }

  @Test
  public void test6(){
    System.out.println("Running test 6");
  }

}
