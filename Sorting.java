import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int []arr={25, 0, -12, 5, 8};
        System.out.println("Insertion sort Results");
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Bubble sort Results");
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
        int[] num={5,4,2,1,3};
        System.out.println("Cyclic sort Results");
        cyclicSort(num);
        System.out.println(Arrays.toString(num));
        
        

    }

    static void insertion(int[] arr)
    {
        for (int i=0; i< arr.length-1;i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if (arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;
            }
        }

    }
    
    static void bubble(int []arr)
    {
        boolean flag;
        for(int i=0; i<arr.length;i++)
        {
            flag=false;
            for(int j=1; j< arr.length-i;j++)
            {
                //for each step max item will come  at the last respective index
                if (arr[j] < arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
            }
            //if you did not swap for a particular value of i, it means array is already sorted.
            //Thus, stop the program
            if(!flag)
                break;
        }
    }
    
    static void cyclicSort(int[] num)
    {
        int i=0;
        while(i<num.length)
        {
            //Here, -n is done where n is the minimum or initial index
            //Here, -1 is done because array's minimum element is 1
            int correct=num[i]-1;
            //check if element at "i" index is correct or not
            if(num[i]!=num[correct])
            {
                //if not correct then swap with correct index element
                int temp=num[i];
                num[i]=num[correct];
                num[correct]=temp;
            }
            else //Move to next index(Move Forward)
                i++;
        }
    }

}
