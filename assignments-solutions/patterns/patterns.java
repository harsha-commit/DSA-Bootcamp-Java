/*
    ********* Steps for solving pattern problems *********
    1. No. of rows == No. of times the outer loop will run
    2. Relate the No. of columns with (MIGHT CONTAIN CONDITIONALS)
        2.1 No. of rows, or
        2.2 No. of spaces
        2.3 N
        2.4 <or> directly print the pattern (without needing no. of columns)
            * especially, for non-starts
    3. Print the spaces, if any
    4. Extract the cell's value and print
 */

public class patterns {

    static int N = 5;

    public static void pattern1(){
        /*
            * * * *
            * * * *
            * * * *
            * * * *
         */

        for(int row = 1; row <= N; row++){
            // for each row
            for(int col = 1; col <= N; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern2(){
        /*
            *
            * *
            * * *
            * * * *
            * * * * *

            row col
            1 1
            2 2
            3 3
            4 4
            5 5
         */
        for(int row = 1; row <= N; row++){
            // for each row
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern3(){
        /*
            * * * * *
            * * * *
            * * *
            * *
            *

            row col
            1 5
            2 4
            3 3
            4 2
            5 1
         */

        for(int row = 1; row <= N; row++){
            // for each row
            for(int col = 1; col <= N - row + 1; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern4(){
        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */

        for(int row = 1; row <= N; row++){
            // for each row
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern5(){
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *

            row col
            1 1
            2 2
            3 3
            4 4
            5 5
            ---- pattern changed
            6 4 (N - 1) 1 == 6-N
            7 3 (N - 2) 2 == 7-N => N - (row - N)
            8 2
            9 1

            // second half -> 2*N - row
         */

        for(int row = 1; row <= 2*N - 1; row++){
            // for each row
            int columns = (row <= N) ? row : (2*N - row);

            for (int col = 1; col <= columns; col++)
                System.out.print("* ");

            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern6(){
        /*
                 *
               * *
             * * *
           * * * *
         * * * * *

         row col
          1  1
          2  2
          3  3
          4  4
          5  5

          Spaces:
          row col
          * 1 4 (N - row)
          * 2 3
          * 3 2
          * 4 1
          * 5 0

         */

        for(int row = 1; row <= N; row++){
            // spaces
            for(int space = 1; space <= N - row; space++)
                System.out.print("  ");

            // for each row
            for (int col = 1; col <= row; col++)
                System.out.print("* ");

            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern7(){
        /*
            * * * * *
              * * * *
                * * *
                  * *
                    *

            row col
            * 1  5 (N - row + 1)
            * 2  4
            * 3  3
            * 4  2
            * 5  1

            spaces
            row col
            * 1  0 (row - 1)
            * 2  1
            * 3  2
            * 4  3
            * 5  4
         */

        for(int row = 1; row <= N; row++){
            // spaces
            for(int space = 1; space <= row - 1; space++)
                System.out.print("  ");

            // for each row
            for(int col = 1; col <= N - row + 1; col++)
                System.out.print("* ");
            System.out.println("");
        }
        System.out.println("----------------");
    }
    public static void pattern8(){
        /*
           |    *
           |   ***
           |  *****
           | *******
           |*********

           row col
           1  1 (2*row - 1)
           2  3
           3  5
           4  7
           5  9

           spaces
           row col
           * 1 4 (N - row)
           * 2 3
           * 3 2
           * 4 1
           * 5 0
         */
        for(int row = 1; row <= N; row++){
            // spaces
            for(int space = 1; space <= N - row; space++)
                System.out.print(" ");

            // for each row
            for(int col = 1; col <= 2*row - 1; col++)
                System.out.print("*");
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern9(){
        /*
            *********
             *******
              *****
               ***
                *

            row col
            1   9 (2*N -1)
            2   7 (2*5 - 3) => 2*N - (2*row - 1)
            3   5 (2*5 - 5)
            4   3 (2*5 - 7)
            5   1 (2*5 - 9)

            spaces
            row col
            * 1  0 (row - 1)
            * 2  1
            * 3  2
            * 4  3
            * 5  4
         */

        for(int row = 1; row <= N; row++){
            // spaces
            for(int space = 1; space <= row - 1; space++)
                System.out.print(" ");

            // for each row
            for(int col = 1; col <= 2*N - 2*row + 1; col++)
                System.out.print("*");
            System.out.println("");
        }
        System.out.println("----------------");
    }
    public static void pattern10(){
        /*
                *
               * *
              * * *
             * * * *
            * * * * *

            row == col

            spaces
            row col
            * 1  4 (N - row)
            * 2  3
            * 3  2
            * 4  1
            * 5  0
         */
        for(int row = 1; row <= N; row++){
            // spaces
            for(int space = 1; space <= N-row; space++)
                System.out.print(" ");

            // for each row
            for(int col = 1; col <= row; col++)
                // Each cell is ("*" + " ")
                // space is " "
                System.out.print("* ");
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern11(){
        /*
            * * * * *
             * * * *
              * * *
               * *
                *

            col == N - row + 1

            spaces
            row col
            * 1  0 (row - 1)
            * 2  1
            * 3  2
            * 4  3
            * 5  4
         */
        for(int row = 1; row <= N; row++){
            // spaces
            for(int space = 1; space <= row-1; space++)
                System.out.print(" ");

            // for each row
            for(int col = 1; col <= N - row + 1; col++)
                // Each cell is ("*" + " ")
                // space is " "
                System.out.print("* ");
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern12(){
        /*
                 * * * * *
                  * * * *
                   * * *
                    * *
                     *
                     *
                    * *
                   * * *
                  * * * *
                 * * * * *

                 row col
                 * 1  5 (N - row + 1)
                 * 2  4
                 * 3  3
                 * 4  2
                 * 5  1
                 ------- pattern change
                 * 6  1 (row - N)
                 * 7  2
                 * 8  3
                 * 9  4
                 * 10 5

                 spaces
                 row col
                 * 1  0 (row - 1)
                 * 2  1
                 * 3  2
                 * 4  3
                 * 5  4
                 ------- pattern change
                 * 6  4 (row - 2) => 2*N - row
                 * 7  3 (row - 4)
                 * 8  2 (row - 6)
                 * 9  1 (row - 8)
                 * 10 0 (row - 10)
         */
        for(int row = 1; row <= 2*N; row++){
            // spaces
            int spaces = (row <= N) ? (row - 1) : (2*N - row);
            for(int space = 1; space <= spaces; space++)
                System.out.print(" ");

            // for each row
            int columns = (row <= N) ? (N - row + 1) : (row - N);
            for(int col = 1; col <= columns; col++)
                System.out.print("* ");
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern13(){
        /*
                *    - 5 & 5
               * *   - 4 (5-1) & 6(5+1) => N - (row-1) && N + (row-1)
              *   *  - 3(5-2) & 7(5+2)
             *     * - 2(5-3) & 8(5+3)
            ********* - (1 - 9)

            rows cols
            * 1  1
            * 2  2
            * 3  2
            * 4  2
            * 5  9

            spaces
            rows cols
            * 1  4 (N - row)
            * 2  3
            * 3  2
            * 4  1
            * 5  0
         */

        for(int row = 1; row <= N; row++){
            // spaces
            for(int space = 1; space <= N - row; space++)
                System.out.print(" ");

            // for each row
            for(int col = N - (row - 1); col <= N + (row - 1); col++){
                if(col == N - (row - 1) || col == N + (row - 1) || row == N){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern14(){
        /*
          ********* -> (5 - 4) & (5 + 4)
           *     * -> (5 - 3) & (5 + 3) => N - (N - row) & N + (N - row)
            *   *  -> 3 & 7 => (5 - 2) & (5 + 2) =>
             * *   -> 4 & 6
              *    -> 5 & 5

            row col
            * 1  9
            * 2  2
            * 3  2
            * 4  2
            * 5  1

            spaces
            row col
            * 1  0 (row - 1)
            * 2  1
            * 3  2
            * 4  3
            * 5  4
         */

        for(int row = 1; row <= N; row++){
            // spaces
            for(int space = 1; space <= row - 1; space++)
                System.out.print(" ");

            // for each row
            for(int col = row; col <= 2*N - row; col++){
                if(col == row || col == 2*N - row || row == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern15(){
        /*
         *
         * *
         *   *
         *     *
         *       *
         *     *
         *   *
         * *
         *

         * N = 5
         * row col
         * 1  1
         * 2  2
         * 3  3
         * 4  4
         * 5  5 --- (row == col)
         * 6  4  (N + (N - row))
         * 7  3
         * 8  2
         * 9  1

         */

        for(int row = 1; row <= 2*N - 1; row++){
            int totalSpaces = (row <= N) ? (N - row) : (row - N);
            int totalColumns = (N >= row) ? (row) : (2*N - row);

            // for each row
            for(int space = 1; space <= totalSpaces; space++){
                System.out.print("  ");
            }

            for(int col = 1; col <= 2*totalColumns - 1; col++){
                if(col == 1 || col == 2*totalColumns - 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern16(){
        /*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

      row col
      1   1
      2   2
      3   3 (row == col)

      spaces
      row col
      1   4
      2   3
      3   2
      4   1
      5   0
         */
    }
    public static void pattern17(){
        /*
            17.      1
                    212
                   32123
                  4321234
                   32123
                    212
                     1

            row col
            1         1
            2       2 1 2
            3     3 2 1 2 3
            4   4 3 2 1 2 3 4
            5     3 2 1 2 3 (2*N - row)
            6       2 1 2
            7         1

            spaces
            row col
            1  3
            2  2
            3  1
            4  0 -- (N - row)
            5  1    (row - N)
            6  2
            7  3
         */

        for(int row = 1; row <= 2*N - 1; row++){
            // for each row
            int totalSpaces = (row <= N) ? (N - row) : (row - N);
            int c = (row <= N) ? (row) : (2*N - row);

            for(int space = 1; space <= totalSpaces; space++){
                System.out.print("  ");
            }

            for(int col = c; col > 1; col --){
                System.out.print(col + " ");
            }

            for(int col = 1; col <= c; col++){
                System.out.print(col + " ");
            }

            System.out.println("");
        }

        System.out.println("----------------");
    }
    // MUST REFER
    public static void pattern18(){
        /*
            18.   **********
                  ****  **** - 5, 6
                  ***    *** - 4, 5, 6, 7
                  **      **  - 3 4 5 6 7 8 ()
                  *        * - 2 3 4 5 6 7 8 9 (2-9)
                  *        * -
                  **      **
                  ***    ***
                  ****  ****
                  **********

                row  col
                1    all
                2    4 stars + 2 hollow + 4 stars (N - row +1)stars + 2*(row-1)hollow + (N - row + 1)stars
                3    3 stars + 4 hollow + 3 stars
                4    2 stars + 6 hollow + 2 stars
                5    1 stars + 8 hollow + 1 stars ----
                6    1 stars + 8 hollow + 1 stars (row - N)stars + (2*N - 2*(row - N))hollow
                7    2 stars + 6 hollow + 2 stars
                8    3 stars + 4 hollow + 3 stars
                9    4 stars + 2 hollow + 4 stars

                total rows && columns == 2*N
                hollow
                row  col
                1    0
                2    5-6 (N - row - 2) to (N + row - 1)
                3    4-7 (N - 1) to (N + 2)
                4    3-8 (N - 2) to (N + 3)
                5    2-9 (N - 3) to (N + 4) ---------
                6    2-9 (row - N + 1) to
                7    3-8
                8    4-7
                9    5-6 (row - N + 1) => (2*N - row) + 1times
                10   0


         */

        for(int row = 1; row <= 2*N; row++){
            // for each row
            int stars = (row <= N) ? (N-row+1) : (row-N);
            int hollows = 2*(N - stars);  // OBSERVE THIS !!! (BEST TO SAVE TIME)
            // SEE NEXT PROBLEM -> MORE EFFECTIVE

            for(int star = 1; star <= stars; star++){
                System.out.print("* ");
            }

            for(int hollow = 1; hollow <= hollows; hollow++){
                System.out.print("  ");
            }

            for(int star = 1; star <= stars; star++){
                System.out.print("* ");
            }

            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern19(){
        /*
                   *        *
                   **      **
                   ***    ***
                   ****  ****
                   **********
                   ****  ****
                   ***    ***
                   **      **
                   *        *

                   * row col
                   * 1  1
                   * 2  2
                   * 3  3
                   * 4  4
                   * 5  5 -------
                   * 6  4 (2*N - row)
                   * 7  3
                   * 8  2
                   * 9  1
         */

        for(int row = 1; row <= 2*N - 1; row++){
            // for each row
            int totalCols = (row <= N) ? (row) : (2*N - row);

            // using range instead of multiple loops
            int startHollow = totalCols + 1;
            int endHollow = 2*N - 1 - totalCols;

            for(int col = 1; col <= 2*N-1; col++){
                if(col < startHollow || col > endHollow){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern20(){
        /*
            20.    ****
                   *  *
                   *  *
                   *  *
                   ****
         */

        for(int row = 1; row <= N; row++){
            // for each row
            for(int col = 1; col <= N - 1; col++){
                if(col == 1 || col == N - 1 || row == 1 || row == N){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern21(){
        /*
            21.    1
                   2  3
                   4  5  6
                   7  8  9  10
                   11 12 13 14 15
         */
        int counter = 1;
        for(int row = 1; row <= N; row++){
            // for each row
            for(int col = 1; col <= row; col++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern22(){
        /*
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
         */
        int counter = -1;
        for(int row = 1; row <= N; row++){
            counter = (row%2);
            // for each row
            for(int col = 1; col <= row; col++){
                System.out.print(counter + " ");
                counter = 1 - counter; // swap
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern23(){}
    public static void pattern24(){
        /*
                   *        * - 1
                   **      ** - 1,2 => (10-1+1), (10-2+1) => (N - row + 1)
                   * *    * * - 1,3
                   *  *  *  * - 1,4
                   *   **   * - 1,5
                   *   **   * - 1,5 (2*N - row + 1)
                   *  *  *  * - 1,4
                   * *    * * - 1,3
                   **      ** - 1,2
                   *        * - 1

         */

        for(int row = 1; row <= 2*N; row++){
            // for each row
            for(int col = 1; col <= 2*N; col++){
                if(
                        (col == 1) // constant 1
                        || (col == 2*N ) // constant 2
                        || (col == row) // diagonal
                        || (col == 2*N - row + 1 ) // anti-diagonal
                ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern25(){
        /*
            25.       *****
                     *   *
                    *   *
                   *   *
                  *****

                spaces
                row col
                5   0  (N - row)
                4   1
                3   2
                2   3
                1   4
         */

        for(int row = 1; row <= N; row++){
            // for each row
            int spaces = N - row;
            for(int space = 1; space <= spaces; space++){
                System.out.print(" ");
            }

            for(int col = 1; col <= N; col++){
                if(row == 1 || row == N || col == 1 || col == N){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern26(){
        /*
              26.     1 1 1 1 1
                      2 2 2 2
                      3 3 3
                      4 4
                      5
         */
        for(int row = 1; row <= N; row++){
            // for each row
            for(int col = 1; col <= N -row + 1; col++){
                System.out.print(row + " ");
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern27(){
        /*
            27.   1 2 3 4  17 18 19 20
                    5 6 7  14 15 16
                      8 9  12 13
                        10 11
         */
    }
    public static void pattern28(){
        /*
            28.      *
                    * *
                   * * *
                  * * * *
                 * * * * *
                  * * * *
                   * * *
                    * *
                     *
         */

        for(int row = 1; row <= 2*N - 1; row++){
            // for each row
            int spaces = (row <= N) ? (N -row) : (row - N);
            int totalCols = (row <= N) ? (row) : (2*N - row);

            for(int space = 1; space <= spaces; space++){
                System.out.print(" ");
            }

            for(int col = 1; col <= totalCols; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern29(){
        // same as 19
        pattern19();
    }
    public static void pattern30(){
        /*
            30.         1
                      2 1 2
                    3 2 1 2 3
                  4 3 2 1 2 3 4
                5 4 3 2 1 2 3 4 5

                row col
                1   1
                2   3 (2*row - 1)
                3   5
                4   7

                spaces
                row col
                5  0
                4  1
                3  2
                2  3
                1  4 (N - row)
         */

        for (int row = 1; row <= N; row++){
            // for each row
            int spaces = N - row;
            for(int space = 1; space <= spaces; space++){
                System.out.print("  ");
            }

            for (int col = row; col > 1; col --){
                System.out.print(col + " ");
            }

            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }

            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern32(){
        /*

           E
           D E
           C D E
           B C D E
           A B C D E

           5 - start from N -row + 1
           4 5
           3 4 5
           2 3 4 5
           1 2 3 4 5
         */

        for(int row = 1; row <= N; row++){
            // for each row
            for(int col = N - row + 1; col <= N; col++){
                char temp = (char)('A' + (col - 1)); // changing to corresponding char
                System.out.print(temp + " ");
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern33(){
        /*
            33.    a
                   B c
                   D e F
                   g H i J
                   k L m N o
         */
        char temp = 'a';
        for(int row = 1; row <= N; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(temp + " ");
                temp = (char)(temp + 1);
                // toggle uppercase to lowercase
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern34(){
        /*
            34.    E D C B A
                   D C B A
                   C B A
                   B A
                   A

                   5 4 3 2 1
                   4 3 2 1
                   3 2 1
                   2 1
                   1
         */
        for (int row = 1; row <= N; row++){
            // for each row
            for(int col = (N - row + 1); col >= 1; col --){
                System.out.print( (char)('A' + col - 1) + " ");
            }
            System.out.println("");
        }

        System.out.println("----------------");
    }
    public static void pattern35(){
        /*
                    1      1
                    12    21
                    123  321
                    12344321
         */

        // multiple for loops is easy to think
        for(int row = 1; row <= N; row++){

            int spaces = 2*N - 2*(row);

            // for each row
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }

            for (int space = 1; space <= spaces; space++){
                System.out.print(" ");
            }

            for(int col = row; col >= 1; col--){
                System.out.print(col);
            }

            System.out.println("");
        }

        System.out.println("----------------");
    }

    public static void main(String[] args){
        System.out.println("PATTERNS: ");
        System.out.println("----------------");

        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();
        pattern12();
        pattern13();
        pattern14();
        pattern15();
        // pattern16(); TO BE COMPLETED
        pattern17();
        pattern18();
        pattern19();
        pattern20();
        pattern21();
        pattern22();
        pattern24();
        pattern25();
        pattern26();
        // pattern27();
        pattern28();
        pattern29();
        pattern30();
        // pattern31();
        pattern32();
        pattern33(); // small work to do
        pattern34();
        pattern35();
    }
}