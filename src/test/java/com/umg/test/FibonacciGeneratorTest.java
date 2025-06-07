/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.test;

import com.umg.fibonacci.FibonacciGenerator;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Fernando
 */
public class FibonacciGeneratorTest {

    @Test
    public void testEjemplo1() {
        int[] start = {0, 1};
        int n = 9;
        int[] esperado = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        assertArrayEquals(esperado, FibonacciGenerator.fibonacci(start, n));
    }

    @Test
    public void testEjemplo2() {
        int[] start = {2, 3};
        int n = 5;
        int[] esperado = {2, 3, 5, 8, 13};
        assertArrayEquals(esperado, FibonacciGenerator.fibonacci(start, n));
    }

    @Test
    public void testCeroElementos() {
        int[] esperado = {};
        assertArrayEquals(esperado, FibonacciGenerator.fibonacci(new int[]{1, 1}, 0));
    }

    @Test
    public void testUnSoloElemento() {
        int[] esperado = {7};
        assertArrayEquals(esperado, FibonacciGenerator.fibonacci(new int[]{7, 9}, 1));
    }

    @Test
    public void testDosElementos() {
        int[] esperado = {4, 6};
        assertArrayEquals(esperado, FibonacciGenerator.fibonacci(new int[]{4, 6}, 2));
    }
}
