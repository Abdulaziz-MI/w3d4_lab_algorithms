import java.util.Stack;

public class ParenthesesChecker {

    /*
     * Create a stack of char type. break the inputString into a charArray
     * loop For each character in the inputCharArray
     * 1. If string is "" stack will also be empty, so return true
     * separate checks for each bracket family
     * */



    public boolean checkParentheses(String string){

        Stack<Character> stack = new Stack<>();
        for (char character :string.toCharArray()){


            // check for ()
            if(character == '(') // if open bracket is found, push it to the stack.
                {stack.push(character);}

            if (character==')') // if a closed bracket is found,
                {if (stack.isEmpty()) {return false;} //  AND Stack is empty return False
                else {stack.pop(); } // else pop from stack to empty it (when stack is empty true is returned)
                }


            // check for [] brackets
            if(character == '[') // if open bracket is found, push it to the stack.
                {stack.push(character);}

            if (character==']')  // if a closed bracket is found,
                {if (stack.isEmpty()) {return false;} //  AND Stack is empty return False
                else {stack.pop();} // else pop from stack to empty it (when stack is empty true is returned)
                }


            // check for {} brackets
            if(character == '{') // if open bracket is found, push it to the stack.
                {stack.push(character);}

            if (character=='}')  // if a closed bracket is found,
                {if (stack.isEmpty()) {return false;} //  AND Stack is empty return False
                else {stack.pop();}// else pop from stack to empty it (when stack is empty true is returned)
                }

            // check for <> brackets
            if(character == '<') // if open bracket is found, push it to the stack.
                {stack.push(character);}

            if (character=='>')  //if a '>' is found and Stack is empty return F else T
                {if (stack.isEmpty()) {return false;}
                else {stack.pop();} // else pop from stack to empty it (when stack is empty true is returned)
                }
        }

        return stack.isEmpty(); // boolean if stack is empty return true, else false.
    }


}
