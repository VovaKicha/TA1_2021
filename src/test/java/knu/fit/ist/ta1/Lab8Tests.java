/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta1;
import knu.fit.ist.ta1.lab8.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 *
 * @author Владимир
 */
public class Lab8Tests {

    @Test
    void productExceptSelf_Test() {
        Solution sol = new Solution();

        int[]a ={1,2,3,4};
        int[]b ={24,12,8,6};
        assertArrayEquals(sol.productExceptSelf1(a, 4),b );
        assertArrayEquals(sol.productExceptSelf2(a, 4),b );
        assertArrayEquals(sol.productExceptSelf3(a, 4),b );


        int[]a1 ={3,5,-5,4,6,7};
        int[]b1 ={-4200,-2520,2520,-3150,-2100,-1800};
        assertArrayEquals(sol.productExceptSelf1(a1, 6),b1 );
        assertArrayEquals(sol.productExceptSelf2(a1, 6),b1 );
        assertArrayEquals(sol.productExceptSelf3(a1, 6),b1 );


        int[]a2 ={3,6,-5,0};
        int[]b2 ={0,0,0,-90};
        assertArrayEquals(sol.productExceptSelf1(a2, 4),b2 );
        assertArrayEquals(sol.productExceptSelf2(a2, 4),b2 );
        assertArrayEquals(sol.productExceptSelf3(a2, 4),b2 );

    }


}