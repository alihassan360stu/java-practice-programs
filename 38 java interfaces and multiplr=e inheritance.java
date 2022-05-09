
interface  ali
{
     void khan();

}

interface  ali2
{
    void khan2();

}

 class bus implements ali,ali2
{   @Override
     public void khan()
    {
        System.out.println("i am bus class interfacse ali");
    }

    public void khan2()
    {
        System.out.println("i am bus class interfacse ali2");
    }
}

class hassan implements ali,ali2
{
    public void khan()
    {
        System.out.println("i am hassan class interface ali");
    }
    public void khan2()
    {
        System.out.println("i am hassan class interface ali2");
    }
}



public class graghics
{

    public static void main(String[] args)
    {
      bus ha=new bus();
        hassan hass=new hassan();
        ha.khan();
        ha.khan2();
        System.out.println("\n\n\n\n");
        hass.khan();
        hass.khan2();
    }
}
