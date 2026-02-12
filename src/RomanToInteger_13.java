public class RomanToInteger_13 {


    /*
    is it too crazy if i convert the string to an array of char and then go through it and add while its not empty that seems fine

     */

    public static void main (String[] args) {

       String s = "III";
       String s1 = "IV";
        String s3 = "LVIII";
        String s4 = "MCMXCIX";

       System.out.println(romanToInt(s));
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s3));
        System.out.println(romanToInt(s4));//2 ? whatevr


    }// end main
//  this was the easiest one so far i think


    public static int romanToInt(String s){
      //   for (String s: s )no loop needed oops
        int count=0;
        int el= 0;
        // im declaring outside for space complexity yess

        char[] arr = s.toCharArray();
        for (int i=0; i<arr.length; i++){
            //el = arr[i];
            // count = count + value(arr[i]);

            // check if at end first right
            //i have to make sure im doing value bc it doesn tknow if the letter is less
            if ((i+1) < arr.length && value(arr[i]) < value(arr[i+1])){
                // subtract if less than the next
                count= count- value(arr[i]);
            }
            else{
                count = count + value(arr[i]);
            }


        } // end for loop



        return count;
    } // end romantoInt

    /*
    i fail last test bc i lowkey dont think im doing the subtracting thing
    do i have to take the ones next to it into account

rule is if the smaller value is before the larger one then you subtract it so i have to look ahead
bc they should always be getting smaller right so if the enxt one is large then subtarct
     */



    static int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }


} // LAST BRACKET
