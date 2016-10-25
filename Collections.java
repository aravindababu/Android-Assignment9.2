/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author user2
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating An arraylist with duplicate elements
        List<String> Cars = new ArrayList<String>();
        
        Cars.add("JAGUAR");
        Cars.add("MERCEDES");
        Cars.add("AUDI");
        Cars.add("BUGATTI");
        
        //Creating Duplicates
                Cars.add("AUDI");
                Cars.add("JAGUAR");
                //Print ArrayList With Duplicates
                System.out.println("List of Cars : "+Cars);
                
        //Using LinkedHashSet which will not allow us to insert duplicates
        //Duplicate elements will be automatically Filtered
        
        Set<String> Duplicates = new LinkedHashSet<String>(Cars);

        Cars.clear();
        //Clearing the ArrayList to copy elements from LinkedHashSet
        
        Cars.addAll(Duplicates);
        //Copying Elements Without Duplicates
        
        //Printing Elements without Duplicates
        System.out.println("List of Cars Without Duplicates : "+Cars);
    }
    
}
