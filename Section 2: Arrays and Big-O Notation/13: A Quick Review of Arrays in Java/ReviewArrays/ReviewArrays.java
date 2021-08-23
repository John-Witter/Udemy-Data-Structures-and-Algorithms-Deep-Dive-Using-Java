// package Section 2: Arrays and Big-O Notation.13: A Quick Review of Arrays in Java.ReviewArrays;

public class ReviewArrays {
    public static void main(String[] args) {
        // to create an array in java
        int [] intArray = new int[7]; //arrays in Java are not dymanically sized

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        
        for (int i = 0 ; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}

// To create a new project: 
/* 
    Parent Folder has to be same name as current file that runs main
*/

// To run in terminal
/* 
    1st, type: javac ReviewArrays.java
        * this will create or update the ReviewArrays.class file
    2nd, type: java ReivewArrays
        * hit enter --> this will run the code  
*/