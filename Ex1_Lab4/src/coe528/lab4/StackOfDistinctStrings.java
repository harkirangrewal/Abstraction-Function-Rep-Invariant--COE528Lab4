/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab4;
import java.util.ArrayList;

/**
 *
 * @author h36grewa
 */  

public class StackOfDistinctStrings {

    // Overview: StacksOfDistinctStrings are mutable, bounded    
    // collection of distinct strings that operate in 
    // LIFO (Last-In-First-Out) order. 
    //
    // The abstraction function is:
    // a) Write the abstraction function here
    // Af(c) = location in stack for n amounts reps
    // reps = length of stack
    //c.top = c(n) --n is 1,2,3..n
    // c.bottom = c(1) -- 1 represents the beginning of the stack
    //
    // The rep invariant is: c.items
    // b) Write the rep invariant here
    // c.items
    // 

    //the rep
    private ArrayList<String> items;

    // constructor
    public StackOfDistinctStrings() {
        // EFFECTS: Creates a new StackOfDistinctStrings object
        items = new ArrayList<String>();
    }

    public void push(String element) throws Exception {
        // MODIFIES: this
        // EFFECTS: Appends the element at the top of the stack 
        //          if the element is not in the stack, otherwise
        //          does nothing.
        if(element == null) throw new Exception();
        if(false == items.contains(element)) 
            items.add(element);
    }

    public String pop() throws Exception {
        // MODIFIES: this
        // EFFECTS: Removes an element from the top of the stack 
        if (items.size() == 0) throw new Exception();
        return items.remove(items.size()-1);
    }
    
    public boolean repOK() {
        // EFFECTS: Returns true if the rep invariant holds for this   
        //          object; otherwise returns false   
        // c) Write the code for the repOK() here
        
        if(items==null) return false;
        for(int i=0; i<items.size(); i++)
        {
            Object x = items.get(i);
            if(!(x instanceof String))
                return false;
        for (int j=i; j<items.size();j++)
        {
            if(x.equals(items.get(j)))
                return false;
        }
        }
        
        return true;
   }
    
    public String toString() {
        // EFFECTS: Returns a string that contains the strings in the 
        //          stack and the top element. Implements the 
        //          abstraction function.  
        // d) Write the code for the toString() here

        if(items.size()==0){
            return "Stack: {, Top Element:";
        }
              
        else
        {
            String c = "Stack: {";
            
            for(int i =0; i<items.size(); i++)
            {
                c = c+ " " +items.get(i);
            }
            c = c+ "} Top Element: " +items.get(items.size() -1);
            
            return c;
            }
        }      
    }




  
    
