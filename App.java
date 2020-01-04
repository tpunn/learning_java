package com.bitsforabetterworld.learningjava;

public class App {
    /*
     * 1. Hello World Write a method that prints out "Hello Word", and make it run.
     */
    static void problem1() {
        System.out.println("Hello World!");
    }

    /*
     * 2. Counting Write a method that prints the numbers from 1 to 10, each on a
     * separate line.
     */
    static void problem2() {
        // Fill in your answer here.
        int x = 1;
        while(x <= 10) {
            System.out.println(x); 
            x++;
        }

    }

    /*
     * 3. More complex counting
     * 
     * Write a program that prints the numbers from 1 to 100, with ten numbers on
     * each line, like this: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
     * 22 23 24 25 26 27 28 29 30 ...
     */
    static void problem3() {
        // Fill in your answer here.
        int col = 1, row = 0;
        while (row < 10) {
          String line = "";
          while (col <= 10) {
            line += "\t"+(col+row*10);
            col++;
          }
          System.out.println(line);
          row++;
          col = 1;
        }
    }

    /*
     * 4. Write a "power" method. This method computes x to the y power. 2^3
     */
    static int power(int x, int y) {
        int t = 1, c = 0;
        while ( c < y ) {
            t *= x;
            c++;
        }

        return t;
    }

    static void problem4() {
        System.out.println("2 to the 8th power is: " + power(2, 8));
        System.out.println("3 to the 4th power is: " + power(3, 4));
        System.out.println("5 to the 3rd power is: " + power(5, 3));
    }

    /*
     * 5. Power table Write a "powerTable" method to print out a table of x to the
     * power of y. In this table, "x" counts the numbers as you go from left to
     * right in the table, and "y" counts the numbers as you go from top to bottom
     * in the table. Each number in the table is calculated using the "power" method
     * that you wrote for problem 4.
     * 
     * The result should look like this:
     * 
     * 1 1 1 1 1 1 1 1 1 1
     * 2 4 8 16 32 64 128 256 512 1024
     * 3 9 27 81 273 729 2187 6561 19683 59049
     * 4 16 64 256 1024 4096 16384 65536 262144 1048576
     * 5 25 125 625 3125 15625 78125 390625 1953125 9765625
     * ...
     */
    static void problem5() {
        int col = 1, row = 1;
        while (row <= 5) {
          String line = "";
          while (col <= 10) {
            line += "\t"+(power(row,col));
            col++;
          }
          System.out.println(line);
          row++;
          col = 1;
        }
    }

    /* 6. Booleans and if statements
     *    In the for-loop, print "fizz" if a number is divisible by 2, "buzz" if it is divisible
     *    by 3, and "fizzbuzz" if it is divisible by both. If none of these is true, print "nope".
     * 
     *    The first few entries (starting with the number 0) should be:
     *    fizzbuzz
     *    nope
     *    fizz
     *    buzz
     *    fizz
     *    nope
     *    fizzbuzz
     *    ...
     */
    static void problem6() {
        for (int i = 0; i < 100; i++) {
            String msg = "";
            if (i % 2 == 0 && i % 3 == 0) msg = "fizzbuzz";
            else if (i % 2 == 0) msg = "fizz";
            else if (i % 3 == 0) msg = "buzz";
            else msg = "nope";
            System.out.println(msg);
        }
    }

    /* 7. Arrays
        Write a method that returns an array containing all of the integers from
        0 to a value n that is specified by the caller.
    */
    static int[] numbersUpToN(int n) {
        int[] integers = new int[n+1]; // Can you see why we need n+1 elements?
        
        for ( int i = 0; i < n+1; i++ ) {
            integers[i] = i;
        }
            
        return integers;
    }

    static void problem7() {
        int[] upTo9 = numbersUpToN(9);
        for (int number : upTo9) {
            System.out.println(""+number);
        }
    }


    /* 8. let's use arrays to solve a problem!
        Implement the Sieve of Eratosthenes
    */
    static int[] findPrimesLessThanN(int n)
    {

    	boolean[] possiblePrimes = new boolean[n];
        
        for ( int i = 0; i < possiblePrimes.length; i++ ) {
            possiblePrimes[i] = true;
        }

        possiblePrimes[0] = false;
        possiblePrimes[1] = false;
	
        for ( int i = 2; i < n; i++ ) {
            for ( int j = i * 2; j < n; j += i ) {
                possiblePrimes[j] = false;
            }
        }

        int b = 0, t = 0, p = 0;
        for ( boolean i : possiblePrimes ) {
            if (i) b++;
        }
	
        int[] primes = new int[b];
        
        for ( boolean i : possiblePrimes ) {
            if (i) { 
                primes[t] = p;
                t++;
            }
            p++;
        }
	
        return primes;
    }

    static void problem8() {
        int[] primesUpTo100 = findPrimesLessThanN(100);
        for (int prime : primesUpTo100) {
            System.out.println(""+prime);
        }

    }

    public static void main(String[] args) {
        System.out.println("Problem 1");
        problem1();
        System.out.println("Problem 2");
        problem2();
        System.out.println("Problem 3");
        problem3();
        System.out.println("Problem 4");
        problem4();
        System.out.println("Problem 5");
        problem5();
        System.out.println("Problem 6");
        problem6();
        System.out.println("Problem 7");
        problem7();
        System.out.println("Problem 8");
        problem8();
    }
}