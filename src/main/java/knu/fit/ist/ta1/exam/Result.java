/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta1.exam;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Владимир
 */
public class Result {

    public List<Double> args;
    public static List<Double> Result;

    public Result() {
        args = new LinkedList<>();
        Result = new LinkedList<>();
    }

    public Result(int length) {
        args = new LinkedList<>();
        Result = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            args.add((double) random.nextInt(100));
        }
    }

    public void SetArgs(double[] args) {
        this.args.clear();
        for (int i = 0; i < args.length; i++) {
            this.args.add(args[i]);
        }
    }

    public String Calculate() {
        Result.clear();
        int length = args.size();

        for (int i = 0; i < length; i++) {
            Result.add(Calculate.Calculate(args.get(i)));
        }

        return Result.toString();
    }

    public String GetArgs() {
        return args.toString();
    }
}
