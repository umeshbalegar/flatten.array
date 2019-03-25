package com.umesh.sample.flatten.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author umeshbalegar
 *
 */
public class App {
    public static Integer[] flatten(Object [] input) {
    	if(input == null) 
    		return null;
    	
    	List<Integer> resList = new ArrayList<>();
    	
    	for(Object obj : input) {
    		if(obj instanceof Object[]) {
    			resList.addAll(Arrays.asList(flatten((Object[]) obj)));
    		}else {
    			resList.add((Integer) obj);
    		}
    	}
    	
    	return resList.toArray(new Integer[resList.size()]);
    }
}
