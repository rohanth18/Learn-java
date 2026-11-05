public class BalancedExpression 
{
    static boolean isEquationBalanced(String exp)
    {
        if(exp == null)
        {
            return false;
        }


        MyStack myStack = new MyStack(exp.length());
        boolean isbalanced = true;

        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);

            if(ch == '(')
            {
                myStack.push(ch);
                continue;
            }
            else if(ch == ')')
            {
                if(myStack.peek() == -1)
                {
                    isbalanced = false;
                    break;
                }
                    myStack.pop();
            }
        }
        if(myStack.peek() != -1)
        {
            isbalanced = false;
        }
        return isbalanced;
    }
    public static void main(String[] args) 
    {
        String exp = "((a+b)*c)+((a+b))";
        System.out.println(isEquationBalanced(exp));
    }
    
}
