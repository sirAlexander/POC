/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Shikanga
 */
public class TestRanking {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Value> valueList = new ArrayList<Value>();
        
        Map<Value, Integer> myMap = new HashMap<Value, Integer>();

        valueList.add(new Value(Double.valueOf(567567)));
        valueList.add(new Value(Double.valueOf(12456)));
        valueList.add(new Value(Double.valueOf(567567)));
        valueList.add(new Value(Double.valueOf(9766)));
        valueList.add(new Value(Double.valueOf(667567)));
        valueList.add(new Value(Double.valueOf(567997)));
        valueList.add(new Value(Double.valueOf(348567)));
        valueList.add(new Value(Double.valueOf(5167)));
        valueList.add(new Value(Double.valueOf(8670)));
        valueList.add(new Value(Double.valueOf(5167)));
        valueList.add(new Value(Double.valueOf(2167)));
        
        
        
        for ( Value v : valueList ){
            System.out.println( " UNSORTED " + v.getVotes() );
        }
        
        System.out.println( " **************** " );
        Collections.sort(valueList,  new ValueComparator() );
        Collections.reverse(valueList);
        boolean jump = false;       
        int rank = 0;
        Double lastVotes = Double.valueOf(-1);
        for ( Value v : valueList ){          
            
            if ( jump  ){
                rank += 1;                
            }
            
            if ( !v.getVotes().equals( lastVotes ) ){
                jump = false;                
                rank += 1;                
            } else {
                jump = true;                
            }
            
            v.setRank(rank);
            myMap.put( v, rank );
            lastVotes = v.getVotes(); 
            
            System.out.println( " SORTED " + v.getVotes() + " RANK " + v.getRank() );
             
        }       
        
        System.out.println( " **************** " );       
        
//        for ( Map.Entry< Value, Integer> entry : myMap.entrySet() ){
//            System.out.println("Key : " + entry.getKey().getVotes() + " Value : "
//			+ entry.getValue());
//        }



    }
}
