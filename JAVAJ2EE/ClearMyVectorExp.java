package com.vector;

import java.util.Vector;

public class ClearMyVectorExp {

	public static void main(String[] args) {

        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        vct.clear();
        System.out.println("After clear vector:"+vct);
    }
}

	
