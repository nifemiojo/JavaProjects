// Copy and Reverse a LinkedList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class LinkedListReversal {

    public static void main(String[] args) {

        // Create the LinkedList objects
        List<Character> linkedList1 = new LinkedList<>();
        List<Character> linkedList2 = new LinkedList<>();

        // Create the random object
        Random random = new Random();
        // Adds 97 to get lowercase letters a-z from their integer values
        final int ASCII_SCALAR = 97;

        for (int i = 0; i < 10; i++)
        {
            // Generates a random number between 97 and 122
            char letter = (char) (ASCII_SCALAR + random.nextInt(26));

            // Adds a letter to the LinkedList 
            linkedList1.add(letter);
        }

        // Generates an iterator over the list and walks backwards through list adding each element to the new list
        ListIterator<Character> iterator = linkedList1.listIterator(linkedList1.size());
        while(iterator.hasPrevious())
        {
            linkedList2.add(iterator.previous());
        }

        // Display each list in console
        System.out.println(linkedList1);
        System.out.println(linkedList2);
    }

    
}