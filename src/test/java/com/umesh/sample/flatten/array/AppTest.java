package com.umesh.sample.flatten.array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6};


    @org.junit.Test
    public void testNullReturnsNull() throws IllegalArgumentException {
        Assert.assertNull(
                "Testing a null argument",
                App.flatten(null)
        );
    }

    @org.junit.Test
    public void testEmptyArray() throws IllegalArgumentException {
        assertArrayEquals(
                "Testing an empty array",
                new Integer[]{},
                App.flatten(new Object[]{})
        );
    }
    
    @org.junit.Test
    public void testFlattenUtility() {
        assertArrayEquals(
                "Testing a flat array",
                expected,
                App.flatten(new Object[]{1, 2, 3, 4, 5, 6})
        );
    }

    @org.junit.Test
    public void testNestedArray(){
        assertArrayEquals(
                "Testing nested array",
                expected,
                App.flatten(new Object[]{1, 2, 3, 4, new Object[]{5, 6}})
        );
    }

    @org.junit.Test
    public void testMultipleNestedArrays() {
        assertArrayEquals(
                "Testing multiple nested arrays",
                expected,
                App.flatten(new Object[]{1, 2, new Object[]{3, 4, new Object[]{5}, 6}})
        );
    }
}
