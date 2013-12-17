/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shikanga.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sir
 */
public class TestMultipleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Person> personList = new ArrayList<>();
        
        
        personList.add( new Person(1, "Chris"));
        personList.add( new Person(2, "John"));
        personList.add( new Person(3, "Harry"));
        personList.add( new Person(4, "Mark"));
        personList.add( new Person(5, "John"));
        
        Collections.sort(personList, PersonComparator.decending(PersonComparator.getComparator( PersonComparator.NAME_SORT, PersonComparator.ID_SORT )));
        
        for ( Person p : personList ){
            System.out.println( " " + p.getId() + " " + p.getName() );
            
        }
        // TODO code application logic here
    }
    
}
