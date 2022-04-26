package com.company;

public class arrays_1 {
    public static void main(String[] args) {
     // declaration
        int [] marks;
        // memory allocation
        marks=new int[3];
        // initialization
        marks[0]=22;
        marks[1]=77;
        marks[2]=99;
        System.out.println(marks[0]);
        System.out.println(marks.length);

        // declaration and memory allocation
      /*  int [] a=new int[3];

        //declaration and initialization
        System.out.println("--using for loops in array-- ");
        int [] tooba={11,33,36,66,88,99};
        for (int i=0; i< tooba.length; i++)
        System.out.println(tooba[i]);

      //display array in reverse order
        int [] natural={1,2,3,4,5,6,7,8,9};
        for (int i=natural.length-1; i>=0; i--){
            System.out.println(natural[i]);
        }
        //2-D array
    /*   int[][] flats = {{101, 102, 103}, {201, 202, 203},{301,302,303}};
        for (int i = 0; i < 3; i++) {      //lop for row
            for (int j = 0; j < 3; j++) {   //loops for column
                System.out.print( " "+ flats[i][j]);
            }
            System.out.println();
        }

        System.out.println("---multi dimensional array---");
        //array of array
    /*    int [][] mat1={{1,2,3},{4,5,6}};   //row 0
        int [][] mat2={{4,5,7},{12,3,5}};  //row 1
        int [][] sum={{0,0,0},{0,0,0}};

        for (int i=0; i<2; i++){           //loop 2 times for rows
            for (int j=0; j<3; j++){       //loop 3 times for columns
                sum[i][j]=mat1[i][j]mat2[i][j];
                System.out.print("  "+sum[i][j]);
            }
            System.out.println();  //after first loop print line than second loop is execute
        }*/

    }
}