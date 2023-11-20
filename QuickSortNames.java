import java.util.Scanner;

public class QuickSortNames 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[numNames];

        // names from user
        for (int i = 0; i < numNames; i++)
        {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        quickSort(names, 0, numNames - 1);

        System.out.println("\nSorted names in ascending order:");
        for (String name : names) 
        {
            System.out.println(name);
        }

        scanner.close();
    }

    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) 
        {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(String[] arr, int low, int high)
     {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
            if (arr[j].compareToIgnoreCase(pivot) < 0) 
            {
                i++;

              
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

