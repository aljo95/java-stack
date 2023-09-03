
package com.mycompany.hp35stack;

public class Item {

    ItemType type;
    int value = 0;

    ItemType type() {
        return this.type;
    }
    
    public enum ItemType {
        ADD,
        SUB,
        MUL,
        DIV,
        VALUE
    }
    
    static Item Value(int i) {
        Item tempItem = new Item();
        tempItem.type = ItemType.VALUE;
        tempItem.value = i;
        return tempItem;
    }
    
    static Item Add() {
        Item tempItem = new Item();
        tempItem.type = ItemType.ADD;
        tempItem.value = 0;
        return tempItem;
    }
    
    static Item Mul() {
        Item tempItem = new Item();
        tempItem.type = ItemType.MUL;
        tempItem.value = 0;
        return tempItem;
    }
    
     static Item Sub() {
        Item tempItem = new Item();
        tempItem.type = ItemType.SUB;
        tempItem.value = 0;
        return tempItem;
    }
        
    static Item Div() {
        Item tempItem = new Item();
        tempItem.type = ItemType.DIV;
        tempItem.value = 0;
        return tempItem;
    }
}
