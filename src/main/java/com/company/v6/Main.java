package com.company.v6;

import com.company.v6.input.CMDLineInputs;
import com.company.v6.input.Inputs;
import com.company.v6.operation.*;
import com.company.v6.output.ConsoleOutput;
import com.company.v6.output.Outputs;
import com.company.v6.repository.FIleNumberRepository;
import com.company.v6.repository.NumberRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        NumberRepository numberRepository = new FIleNumberRepository();
        CalculatorApp calculatorApp =  new CalculatorApp(numberRepository, args);
        calculatorApp.run();

    }

}
