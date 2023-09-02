
package com.mycompany.hp35dynamic;

import com.mycompany.hp35dynamic.Item.ItemType;

public class Stack {
    
    int[] stackArray;
    int size;
    int pointer = -1;
    int[] tempArr;
    
    public Stack(Item[] expr) {
        
        size = 4;
        
        stackArray = new int[size]; // starting size 4
        
        for (int i=0; i<expr.length; i++) {
            if (expr[i].type == ItemType.VALUE) {
                push(expr[i].value);
            }
        }
    }
    
    public void push(int x) {
        
        if (pointer+1 == stackArray.length) {
            
            tempArr = new int[size];
            
            for (int i=0; i<stackArray.length; i++) {
                tempArr[i] = stackArray[i];
            }
            
            size = size*2;
            stackArray = new int[size];
            
            for (int i=0; i<tempArr.length; i++) {
                stackArray[i] = tempArr[i];
            }
            
            pointer++;
            stackArray[pointer] = x;
        } else {
            pointer++;
            stackArray[pointer] = x;
        }
    }
    
    public int pop() {
        
        if (pointer == -1) {
            System.out.println("Empty stack, nothing to pop!");
        }
        
        if (pointer < size / 4) {
            tempArr = new int[size];  
            
            for (int i=0; i<tempArr.length; i++) {
                tempArr[i] = stackArray[i];
            }
            
            size = size / 2;
            stackArray = new int[size];
            
            for (int i=0; i<stackArray.length; i++) {
                stackArray[i] = tempArr[i];
            }
            
            pointer--;
            return stackArray[pointer+1];
        } else {
            pointer--;
            return stackArray[pointer+1];
        }
    }
}
