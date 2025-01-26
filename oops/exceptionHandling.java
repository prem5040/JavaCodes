package oops;

public class exceptionHandling {
    public static void main(String[] args) {
        int a=20;
        int b=0;
        int[] arr =new int[4];
        try{
            int ans=a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            int x=arr[4];
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("all checks concluded.");
        }
    }
}
