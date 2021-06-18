/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta1;

import knu.fit.ist.ta1.exam.Calculate;
import knu.fit.ist.ta1.exam.Result;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Владимир
 */
@SpringBootTest
public class ExamTest {

    @Test
    void testFormula() {
        assertEquals(0.2222222222222222, Calculate.Calculate(2));
    }

    @Test
    void testFormulaWithManyArgs() {
        Result fr = new Result();
        double[] args = new double[]{12d, 7d, 3d};
        fr.SetArgs(args);
        assertEquals("[0.02531645569620253, 0.045454545454545456, 0.125]", fr.Calculate());
    }
}
