package doublecolonoperator;

public class Calculator {

    public static void findSum(int x,int y){
        System.out.println("Sum " + (x+y));
    }

    public static void findDiff(int x,int y){ System.out.println("Difference " + (x-y));}

    public void findDivide(int x,int y){ System.out.println("Quotient " + (x/y));
    }

    public void findMultiply(int x,int y){ System.out.println("Product " + (x*y));
    }

    public void findRem(int x,int y){ System.out.println("Remainder " + (x%y));
    }
}
