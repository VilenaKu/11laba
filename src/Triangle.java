import java.util.Scanner;
class InfoTriangle
{
    int a,b,c;
    public InfoTriangle(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void show()
    {
        System.out.println("Стороны треугольника: "+a+" "+b+" "+c);
    }
    public int Perimetr()
    {
        int res=a+b+c;
        return res;
    }
    public double Square()
    {
        double p=Perimetr()/2.0;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}

public class Triangle
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a,b,c,p;
        double s;
        System.out.println("Введите сторону треугольника");
        a=scan.nextInt();
        System.out.println("Введите сторону треугольника");
        b=scan.nextInt();
        System.out.println("Введите сторону треугольника");
        c=scan.nextInt();
        InfoTriangle t=new InfoTriangle(a,b,c);
        p=t.Perimetr();
        s=t.Square();
        t.show();
        System.out.println("Периметр треугольника равен "+p);
        System.out.println("Площадь треугольника равен "+s);
    }

}
