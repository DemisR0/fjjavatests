package com.fc.chap1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<String> items = List.of("1", "a", "2", "a", "4", "a");
	    items.forEach(item -> {
	        if (item.equals("a")) {
	            System.out.println("A");
            } else {
	            System.out.println("not A");
            }
        });
    }
}
