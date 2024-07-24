class Datatype{
    static int i;
    static boolean b;
    static float f;
    static double d;
    static char c;
    static long l;
    static byte y;
    static short s;
  void print() {
       System.out.println("int i:" + i);
       System.out.println("boolean b:" + b);
       System.out.println("float f:" + f);
       System.out.println("double d:" + d);
       System.out.println("char c:" + c);
       System.out.println("long l:" + l);
       System.out.println("byte y:" + y);
       System.out.println("short s:" + s);
   }
}
public class Primitivedatatype {
    public static void main(String[] args)
    {
     Datatype data = new Datatype();
     data.print();
    }
}
