import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

interface Sortable{
    void sort(int[] a);
}

class BubbleSort implements Sortable{

    public void sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
}

class MergeSort implements Sortable{

    public void sort(int[] a)
    {
        split(a,0,a.length-1);
    }

    void split(int[] a, int s, int e)
    {

        if(s>=e)
            return;
        int m=(s+e)/2;

        split(a, s, m);
        split(a,m+1,e);

        merge(a, s, m, e);
    }

    void merge(int[] a, int s, int m, int e)
    {

        int[] r= new int[m-s+1];
        System.arraycopy(a, s , r, 0, r.length);
        int[] l= new int[e-m];
        System.arraycopy(a, m+1 , l, 0, l.length);

        int i=0,j=0,k=s;

        while(i<r.length&&j<l.length)
        {
            if(r[i]<l[j])
            {
                a[k]=r[i++];
            }
            else
                a[k]=l[j++];
            k++;
        }

        while(i<r.length)
        {
            a[k++]=r[i++];
        }

        while(j<l.length)
        {
            a[k++]=l[j++];
        }

    }
}

    class QuickSort implements Sortable{

        public void sort(int[] a){
            qsort(a, 0, a.length-1);
        }

        void qsort(int[] a, int s, int e)
        {
            if(s<e)
            {
                int p=part(a,s,e);
                qsort(a, s,p-1);
                qsort(a,p+1,e);
            }
        }

        int part(int[] a, int s, int e)
        {
            int p= a[e];
            int i=s-1;

            for(int j=s;j<e;j++)
            {
                if(a[j]<=p)
                {
                    i++;
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
            int t= a[i+1];
            a[i+1]=a[e];
            a[e]=t;

            return i+1;
        }
    }
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Number of elements in array: ");
        int n= sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        System.out.println("1. BubbleSort\n2. MergeSort\n3. QuickSort ");
        System.out.print("Enter the number ahead of the sorting logic you want to use(default is QuickSort): ");
        int c= sc.nextInt();

        switch (c)
        {
            case 1:new BubbleSort().sort(a);
                break;
            case 2:new MergeSort().sort(a);
                break;
            default: new QuickSort().sort(a);
        }
//
//
        HashSet

        System.out.println(Arrays.toString(a));
    }
}