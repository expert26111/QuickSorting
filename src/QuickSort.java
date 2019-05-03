import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class QuickSort
{


    int partition(ArrayList<Cake> list, int low, int high)
    {
        Cake cake = list.get(high);
        int pivot = cake.getStrawberryNumber();
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            if(list.get(j).getStrawberryNumber() <= pivot)
            {
                i++;
                Cake temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }

        }
        Cake temp = list.get(i+1);
        list.set(i+1, list.get(high));
        list.set(high, temp);

        return i+1;
    }

    void sort(ArrayList<Cake> list, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(list, low, high);
            sort(list, low, pi-1);
            sort(list, pi+1, high);
        }
    }

    static void printArray(ArrayList<Cake> list)
    {
        for (int counter = 0; counter < list.size(); counter++)
        {
            System.out.println(list.get(counter).getStrawberryNumber());
        }
    }
    static void getFirstK(ArrayList<Cake> list, int k)
    {
        for (int counter = 0; counter < list.size(); counter++)
        {
            System.out.println(list.get(counter).getStrawberryNumber());
        }
    }
    public static void quickSortInDescendingOrder (ArrayList<Cake> list, int low, int high)
    {
        int i=low;
        int j=high;
     //   int temp;
      //  int middle=numbers[(low+high)/2];
        Cake middle = list.get((low+high)/2);

        while (i<j)
        {
            while (list.get(i).getStrawberryNumber() > middle.getStrawberryNumber())
            {
                i++;
            }
            while (list.get(j).getStrawberryNumber() < middle.getStrawberryNumber())
            {
                j--;
            }
            if (j>=i)
            {
                Cake temp = list.get(i);
              //  temp=numbers[i];
                list.set(i, list.get(j));
               // numbers[i]=numbers[j];
                list.set(j, temp);
                i++;
                j--;
            }
        }
        if (low<j)
        {
            quickSortInDescendingOrder(list, low, j);
        }
        if (i<high)
        {
            quickSortInDescendingOrder(list, i, high);
        }
    }

    public static void main(String args[])
    {

        ArrayList<Cake> listCake = new ArrayList<>();
        List<Cake> newList = new ArrayList<Cake>(listCake);

        listCake.add(new Cake(13,17));
        listCake.add(new Cake(8,10));
        listCake.add(new Cake(1,4));
        listCake.add(new Cake(0,1));
        listCake.add(new Cake(5,10));

        int n = listCake.size();
//      QuickSort ob = new QuickSort();

 //     ob.sort(listCake, 0, n-1); // the n cakes inside sort method
       // System.out.println("sorted array");
      //  printArray(listCake);
        quickSortInDescendingOrder(listCake,0,n-1);
        System.out.println("Getting as many strawberries as you can");
        int k = 0;
        while(k < 3)
        {
            Cake cake = listCake.get(k);
            k++;
            System.out.println(cake.toString() );
        }
    }
}
