import java.util.Scanner;
class InfoRectangle
{
    int a,b;
    public InfoRectangle(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void show()
    {
        System.out.println("Стороны прямоугольника: "+a+" "+b);
    }
    public int Perimetr()
    {
        int res=a+b;
        return res;
    }
    public int Square()
    {
        int s=a*b;
        return s;
    }
}

public class Rectangle
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a,b,p,s;
        System.out.println("Введите сторону прямоугольника");
        a=scan.nextInt();
        System.out.println("Введите сторону прямоугольника");
        b=scan.nextInt();
        InfoRectangle t=new InfoRectangle(a,b);
        p=t.Perimetr();
        s=t.Square();
        t.show();
        System.out.println("Периметр прямоугольника равен "+p);
        System.out.println("Площадь прямоугольника равен "+s);
    }

}
