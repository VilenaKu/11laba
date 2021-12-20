import java.util.Scanner;
class InfoArray
{
    int n;
    int []a;
    public InfoArray(int n)
    {
        this.n=n;
        a=new int[n];
    }
    public void show()
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    public void input(Scanner s)
    {
        System.out.println("Введите элементы массива");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
    }
    public void sort()
    {
        for(int i=0;i<n;i++)
        {
            int min=a[i];
            int nmin=i;
            for(int j=i+1;j<n;j++)
                if(min>a[j])
                {
                    min=a[j];
                    nmin=j;
                }
            a[nmin]=a[i];
            a[i]=min;
        }

    }

}

public class Array
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Введите размер массива");
        n=scan.nextInt();
        InfoArray a=new InfoArray(n);
        a.input(scan);
        System.out.println("Исходный массив");
        a.show();
        a.sort();
        System.out.println("Отсортированный массив");
        a.show();

    }

}
