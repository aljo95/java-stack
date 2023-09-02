
package com.mycompany.hp35dynamic;

/**
 * @author Alexander Johansson
 */
public class Main {

    public static void main(String[] args) {
        
        Item[] expr = {
            Item.Value(10),
            Item.Value(2),
            Item.Value(5),
            Item.Mul(),
            Item.Add()
        };
        
        Calculator calc = new Calculator(expr);
        int res = calc.run();
        System.out.println(" Calculator: res = " + res);
    }
}
