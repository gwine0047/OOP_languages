package school_magt_sys;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 */
public class deletemain
{
    public static void main(String[] args)
    {
        //creating a list of integers that does not require 
        // an alloted memory before declaratio
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(45);
        numbers.add(2344);

        System.out.println(numbers);
    }
}