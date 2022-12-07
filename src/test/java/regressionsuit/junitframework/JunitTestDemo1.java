package regressionsuit.junitframework;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class JunitTestDemo1 {

    @BeforeAll
    public static void setUp(){
        System.out.println("Before all runs before all test");
    }
    @AfterAll
    public static void tearDown(){
        System.out.println("After all runs after all passes");
    }

    @Test
    public void squareRoots(){
        System.out.println("The first Test");
        Assert.assertTrue(Math.sqrt(9)==3);
    }
    @Test
    public void compareTwoString(){
        String s1="Test1";
        String s2="Test1";
        Assert.assertEquals(s1,s2);

    }
}
