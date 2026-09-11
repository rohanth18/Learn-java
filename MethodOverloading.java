public class MethodOverloading {

    int max(byte x, byte y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    //int max(byte x, byte y)//no two parameters can be same in two methods
    int max(int x, int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    float max(float x,float y)//when it is not called this will be called widening
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    //max of 3 numbers
    int max(int x, int y,int z)
    {
        if(x>y && x>z)
        {
            return x;
        }
        else if(y>z && y>x)
        {
            return y;
        }
        else
        {
            return z;
        }
    }




    public static void main(String[] args) 
    {
        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.max(10,20));
        System.out.println(obj.max(10,20,30));
        
    }
    
}
