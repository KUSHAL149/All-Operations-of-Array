/*PROGRAM OF SORTING,SEARCHING,INSERTION,DELETION AND MERGING
USING ARRAY
(LINEAR AND BINARY SEARCH)
(SELECTION SORT AND BUBBLE SORT)
*/
import java.util.Scanner;
class array_program
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
                int num=in.nextInt();
                int arr[]= new int [num*2];
                System.out.println("Enter the Elements: ");
                for(int loop=0;loop<num;loop++)
                {
                    arr[loop]=in.nextInt();
                }
        //Which program user want to do
        System.out.print("Enter 1 for Searching, 2 for Sorting, 3 for Insertion, 4 for Deletion, 5 for Merging: ");
        int choice = in.nextInt();
        switch(choice)
        {
            case 1:
            // Searching
            System.out.print("Enter 1 for Linear Search and 2 for Binary search: ");
            int choice1 = in.nextInt();
            if(choice1==1)
            {
                //Linear Search
                System.out.print("Enter the number you want to search: ");
                int search = in.nextInt();
                for(int loop1=0;loop1<num;loop1++)
                {
                    if(search==arr[loop1])
                    {
                        System.out.println("Number found!");
                        System.exit(0);
                    }
                }
                System.out.println("Number not found!");
            }
            else if(choice1==2)
            {
                //Binary Search
                for(int loop2=1;loop2<num;loop2++)
                {
                    if(arr[loop2-1]>arr[loop2])
                    {
                        System.out.println("Enter the number in Ascending Order!");
                        System.exit(0);
                    }
                }
                int first=0,last=num,mid,check;
                System.out.print("Enter the number you want to search: ");
                check=in.nextInt();
                while(first<=num)
                {
                    mid=(first+last)/2;
                    if(arr[mid]==check)
                    {
                        System.out.println("Number Found!");
                        System.exit(0);
                    }
                    if(arr[mid]>check)
                    last=mid-1;
                    if(arr[mid]<check)
                    first=mid+1;
                }
                System.out.println("Number not found!");
            }
            else
            System.out.println("Enter correct Option!");
            break;
            case 2:
            //Sorting
            System.out.print("Enter 1 for Selection sort and 2 for Bubble sort: ");
            int wish=in.nextInt();
            if(wish==1)
            {
                //Selection Sort
                int min,index=0;
                for(int loop3=0;loop3<num;loop3++)
                {
                    min=arr[loop3];
                    index=loop3;
                    for(int loop4=loop3;loop4<num;loop4++)
                    {
                        if(min>arr[loop4])
                        {
                        min=arr[loop4];
                        index=loop4;
                        }
                    }
                    arr[index]=arr[loop3];
                    arr[loop3]=min;
                }
                System.out.println("In Ascending Order:- ");
                for(int loop5=0;loop5<num;loop5++)
                {
                    System.out.println(arr[loop5]);
                }
            }
            else if(wish==2)
            {
                //Bubble Sort
                int max=0;
                for(int loop6=num-1;loop6>=0;loop6--)
                {
                    for(int loop61=0;loop61<loop6;loop61++)
                    {
                        if(arr[loop61]>arr[loop61+1])
                        {
                            max=arr[loop61];
                            arr[loop61]=arr[loop61+1];
                            arr[loop61+1]=max;
                        }
                    }
                }
                System.out.println("In Ascending Order: ");
                for(int loop7=0;loop7<num;loop7++)
                {
                    System.out.println(arr[loop7]);
                }
            }
            else
            System.out.println("Enter Correct Option!");
            break;
            case 3:
            //Insertion
            int copy;
            System.out.print("Enter the Element to be inserted: ");
            int ele=in.nextInt();
            System.out.print("Enter the Position you want to insert: ");
            int pos=in.nextInt();
            for(int loop8=num-1;loop8>=pos-1;loop8--)
            {
                copy=arr[loop8];
                arr[loop8+1]=copy;
            }
            arr[pos-1]=ele;
            for(int loop10=0;loop10<=num;loop10++)
            {
                System.out.println(arr[loop10]);
            }
            break;
            case 4:
            //DELETON
            System.out.print("Enter Position you want to delete: ");
            int pos_delete=in.nextInt();
            for(int loop11=pos_delete-1;loop11<num;loop11++)
            {
                arr[loop11]=arr[loop11+1];
            }
            System.out.println("The new Array is:- ");
            for(int loop12=0;loop12<num-1;loop12++)
            {
                System.out.println(arr[loop12]);
            }
            break;
            case 5:
            //Merging
            System.out.print("Enter the elements of second array: ");
            int num5=in.nextInt();
            System.out.println("Enter the Elements: ");
            int num6=num5+num;
            int arr3[]=new int [num6];
            for(int loop13=num;loop13<num6;loop13++)
            {
                arr3[loop13]=in.nextInt();
            }
            for(int loop14=0;loop14<num;loop14++)
            {
                arr3[loop14]=arr[loop14];
            }
            System.out.println("After Merging the array is: ");
            for(int loop15=0;loop15<num6;loop15++)
            {
                System.out.println(arr3[loop15]);
            }
            break;
            default:
            System.out.println("Enter a Correct Choice!");
        }
        in.close();
    }    
}
