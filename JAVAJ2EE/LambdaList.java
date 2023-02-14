package com.series;

import java.util.ArrayList;
import java.util.List;

public class LambdaList {

	public static void main(String[] args) {
		List<Integer> Lst = new ArrayList<Integer>();

		Lst.add(71);
		Lst.add(73);
		Lst.add(75);
		Lst.add(79);
		Lst.add(76);
		Lst.forEach(
				(n)->System.out.println(n)
);

	}

}
