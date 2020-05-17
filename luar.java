import java.util.Scanner;
 
class luar
{
    private int a;
 
    public void setA(int nilai)
    {
        a = nilai;
    }
    public int getA()
    {
        return a;
    }
    class dalam
    {
        private int x = 100;
 
        public void liat()
        {
           System.out.println("Nilai a dari kelas luar = "+a);
           System.out.println("Nilai x dari kelas dalam = "+x);
        }
    }
    public void lihatData()
    {
        dalam bb = new dalam();
        bb.liat();
    }
}
