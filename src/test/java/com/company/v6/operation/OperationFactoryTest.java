package com.company.v6.operation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Matchers.isNull;

public class OperationFactoryTest {
    @Test
    public void  shouldReturnAddoperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("add",inputNumbers);
        assertThat(operation,instanceOf(AddOperation.class));
    }
    @Test
    public void  shouldReturnSuboperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("sub",inputNumbers);
        assertThat(operation,instanceOf(SubOperation.class));
    }
    @Test
    public void  shouldReturnMuloperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("mul",inputNumbers);
        assertThat(operation,instanceOf(MulOperation.class));
    }
    @Test
    public void  shouldReturnDivoperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("div",inputNumbers);
        assertThat(operation,instanceOf(DivOperation.class));
    }

    @Test
    public void  shouldReturnNull(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("mod",inputNumbers);
        assertThat(operation, is(isNull()));
    }
}