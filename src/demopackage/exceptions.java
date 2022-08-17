package demopackage;

public class exceptions {
    public static void main(String[] args) {
        handleExceptions handleExceptions = new handleExceptions();
        handleExceptions.exceptionDeviation();
        handleExceptions.indexOutOfRange();

    }
}

class handleExceptions{

    int a = 10;
    int b = 0;
    int c;
    int[] intarray = new int[3];

    void exceptionDeviation()
    {
        try{
            c = a/b;
        }
        catch(Exception nn)
        {
            System.out.println(nn.toString());
        }
    }

    void indexOutOfRange()
    {

        try
        {
            for (int i=0; i <=3; i++)
            {
                System.out.println("the number is " + intarray[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }

}
