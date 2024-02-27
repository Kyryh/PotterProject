/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import potterproject.*;

/**
 *
 * @author k.donov
 */
public class RestTest {
    public static void main(String[] args) {
        Rest rest = new Rest("test");
        InitResult init = rest.init();
        System.out.println("init result: " + init);
        
        System.out.println("look result: " + rest.look());
        System.out.println("");
        System.out.println("Testing move in all 4 directions:");
        for (int arg : new int[] {0, 2, 4, 6}) {
            try {
                MoveResult move = rest.Move(arg);
                System.out.println("move result: " + move);
            } catch (RequestException e) {
                if (e.getMessage().equals("illegal move")) {
                    System.out.println("illegal move exception, expected");
                } else {
                    throw e;
                }
            }
        }
        
        System.out.println("");
        System.out.println("Testing load and unload, should throw exceptions");
        
        try {
            LoadResult load = rest.load();
            System.out.println(load);
            throw new AssertionError("Load didn't throw an exception as expected");
        } catch (RequestException e) {
            if (e.getMessage().equals("goblet is not here")) {
                System.out.println("goblet is not here exception, expected");
            } else {
                throw e;
            }
        }
        
        try {
            UnloadResult unload = rest.unload();
            System.out.println(unload);
            throw new AssertionError("Unload didn't throw an exception as expected");
        } catch (RequestException e) {
            if (e.getMessage().equals("goblet not loaded")) {
                System.out.println("goblet not loaded exception, expected");
            } else {
                throw e;
            }
        }
    }
}
