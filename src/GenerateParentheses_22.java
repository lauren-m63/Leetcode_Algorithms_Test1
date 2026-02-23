import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

    /*
    Given n pairs of parentheses,
     write a function to generate all combinations of well-formed parentheses.
    1 <= n <= 8
     */
/*
parentheses rules are just there has to be an opening and a close so it should be even
if the number is odd, the last one has to be a closing - should i do like the roman?
i think or no it s list of string not char
its pairs so double n
then if you open you have to close
this is 5 points
 */
    public List<String> generateParenthesis(int n) {

       if (n<=1 || n>=8) {
            return null;
       }
        List<String> ans = new ArrayList<String>();




        return ans;
    } // end method

} // LAST BRACKET END CLASS
