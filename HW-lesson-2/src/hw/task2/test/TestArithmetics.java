package hw.task2.test;

import org.junit.Assert;
import org.junit.Test;

import hw.task2.calculation.Arithmetics;

public class TestArithmetics {
    @Test
    public void testAdd(){
        Arithmetics arithmetics = new Arithmetics();
        double res = arithmetics.add(5, 6);
        if (res != 11) Assert.fail();
    }
    
    @Test
    public void testSub(){
        Arithmetics arithmetics = new Arithmetics();
        double res = arithmetics.sub(12, 9);
        if (res != 3) Assert.fail();
    }
    
    @Test
    public void testMult(){
        Arithmetics arithmetics = new Arithmetics();
        double res = arithmetics.mult(5, 6);
        if (res != 30) Assert.fail();
    }
    

    @Test
    public void testDiv(){
        Arithmetics arithmetics = new Arithmetics();
        double res = arithmetics.div(12, 6);
        if (res != 2) Assert.fail();
    }
}
