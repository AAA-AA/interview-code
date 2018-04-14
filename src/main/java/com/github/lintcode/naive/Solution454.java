package com.github.lintcode.naive;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 11:54
 */
public class Solution454 {
     /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here



    public static class Rectangle {
        public int width;
        public int height;

        Rectangle(int width,int height) {
            this.width = width;
            this.height = height;
        }

        public int getArea() {
            return width*height;
        }


    }

}
