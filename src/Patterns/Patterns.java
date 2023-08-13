package Patterns;

public class Patterns {
    public static void main(String[] args) {

        int n=5;
        int space = 2*(n-1);
        int num=1;
        char alpha = 'A';

       /* Pattern 1

        * * * *
        * * * *
        * * * *
        * * * *

        */

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println();

        /* Pattern 2

         *
         * *
         * * *
         * * * *

         */

        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println();

        /* Pattern 3

         1
         1 2
         1 2 3
         1 2 3 4

         */

        for (int i=1;i<n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println("");
        }

        System.out.println();

        /* Pattern 4

        1
        2 2
        3 3 3

         */

        for (int i=1;i<n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println("");
        }

        System.out.println();

        /* Pattern 5

         * * * *
         * * *
         * *
         *

         */

        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println();

        /* Pattern 6

         1 2 3 4
         1 2 3
         1 2
         1

          */

        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" "+(n-j+1));
            }
            System.out.println("");
        }


        System.out.println();

        /* Patter 7

          *
         ***
        *****
       *******

         */

        for (int i=0;i<n;i++){

            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        /* Pattern 8

         *******
          *****
           ***
            *

         */


        for (int i=0;i<n;i++){

            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (int j=0; j < 2*n -(2*i +1);j++){
                System.out.print("*");
            }
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        /* Pattern 9

           *
          ***
         *****
        *******
        *******
         *****
          ***
           *

         */

        for (int i=0;i<n;i++){

            for (int j =0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j=0; j < 2*i +1;j++){
                System.out.print("*");
            }
            for (int j =0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i=0;i<n;i++){

            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (int j=0; j < 2*n -(2*i +1);j++){
                System.out.print("*");
            }
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        /* Pattern 10

         *
         * *
         * * *
         * * * *
         * * *
         * *
         *

         */

        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("");

        /* Pattern 11

            1
            01
            101
            0101
            10101

         */
        int start =1;
        for (int i=0;i<n;i++){

            if (i%2==0){
                start=1;
            }
            else {
                start=0;
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(start);
                start = 1-start;

            }

            System.out.println("");

        }

        System.out.println("");

        /* Pattern 12

            1        1
            12      21
            123    321
            1234  4321
            1234554321

         */

        for (int i = 1; i <= n; i++) {

            //num
            for (int j = 1; j<=i ; j++) {
                System.out.print(j);
            }
            //space
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            //num
            for (int j = i; j>=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }

        System.out.println("");

        /* Pattern 13

            1
            2 3
            4 5 6
            7 8 9 10

         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num += 1;
            }
            System.out.println();
        }

        System.out.println("");

        /* Pattern 14

        A
        AB
        ABC
        ABCD
        ABCDE

         */

        for (int i = 0; i <n ; i++) {
            for (char j = 'A'; j <='A'+i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("");


        /* Pattern 15

            ABCDE
            ABCD
            ABC
            AB
            A

         */
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j<='A'+(n-i-1) ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("");

        /* Pattern 16

            A
            BB
            CCC
            DDDD
            EEEEE

         */

        for (int i = 0; i < n; i++) {
            for (int  j = 0; j<=i ; j++) {
                System.out.print(alpha);
            }
            alpha++;
            System.out.println();
        }

        System.out.println("");

        //

        for (int i=0;i<n;i++){

            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
