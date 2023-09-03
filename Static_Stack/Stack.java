
package com.mycompany.hp35stack;

import com.mycompany.hp35stack.Item.ItemType;

public class Stack {
    
    int[] stackArray;
    int size = 0;
    int pointer = -1;
    
    public Stack(Item[] expr) {
        
        //size = 32;
        size = 1024;
        
        stackArray = new int[size]; 
        
        for (int i=0; i<expr.length; i++) {
            if (expr[i].type == ItemType.VALUE) {
                stackArray[i] = expr[i].value;
                pointer++;
            }
        }
    }

    public void push(int x) {
        
        if (pointer >= stackArray.length) {
            System.out.println("overflow");
        } else {
            pointer++;
            stackArray[pointer] = x;
        }
    }

    public int pop() { 
        
        if (pointer <= -1) {
            System.out.println("underflow, nothing to pop!");
        } else {
            pointer--;
            return stackArray[pointer+1];
        }
        return 0;
    }
}
