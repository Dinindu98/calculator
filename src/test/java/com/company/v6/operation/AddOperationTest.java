package com.company.v6.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AddOperationTest {
    @Test
    public void addPositiveToPositiveTest(){
        Operation operation = new AddOperation(2,3);
        double result = operation.perform();
        assertThat(result, is(5.0));
    }

    @Test
    public void addPositiveToNegativeTest(){
        Operation operation = new AddOperation(2,-3);
        double result = operation.perform();
        assertThat(result, is(-1.0));
    }

    @Test
    public void addNegativeeToNegativeTest(){
        Operation operation = new AddOperation(-2,-3);
        double result = operation.perform();
        assertThat(result, is(-5.0));
    }
}