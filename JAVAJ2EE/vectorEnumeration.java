package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class vectorEnumeration {

	public static void main(String[] args) {

        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        Enumeration<String> enm = vct.elements();
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }

	}

}
