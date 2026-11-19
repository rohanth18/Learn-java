public class ValidExpression 
{
    static char getOpenBrace(char ch)
    {
        char openBrace = '*';
        if(ch == ')')
        {
            openBrace = '(';
        }
        if(ch == '}')
        {
            
            openBrace = '{';
        }
        if(ch == ']')
        {
            openBrace = '[';
        }
        return openBrace;
    }
    static boolean isExpressionValid(String exp)
    {
        if(exp == null)
        {
            return false;
        }

        MyCharStack myCharStack = new MyCharStack(exp.length());
        boolean isbalanced = true;

        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
            {
                myCharStack.push(ch);
                continue;
            }
            else if(ch == ')' || ch == '}' || ch == ']')
            {
                if(myCharStack.peek() == '*')
                {
                    isbalanced = false;
                    break;
                }
                if(myCharStack.peek() != getOpenBrace(ch))
                {
                    isbalanced = false;
                    break;
                }
                    myCharStack.pop();
            }
        }
        if(myCharStack.peek() != '*')
        {
            isbalanced = false;
        }
        return isbalanced;
    }
    public static void main(String[] args) 
    {
        String exp = "{{(a+b)*c}+[(a+b)]}";
        System.out.println(isExpressionValid(exp));
    }
    
}
