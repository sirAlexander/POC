/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.Comparator;

/**
 *
 * @author Shikanga
 */
public class ValueComparator implements Comparator<Value> {

    @Override
    public int compare(Value t, Value t1) {
        int result = 0;
        
        if ( t != null && t1 != null ){
            result = t.getVotes().compareTo( t1.getVotes() );
        }       
        return result;
    }


    
}
