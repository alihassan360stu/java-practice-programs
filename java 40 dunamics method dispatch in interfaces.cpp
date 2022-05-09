package com.company;
class mobile
{    int data;
    void name()
    {
        System.out.println("samsung mobile ");
    }

}

interface phone
{
 void call();
 default  void misscall()
 {
     System.out.println("dont do miss call please ");
 }

}

interface camera
{
 void take();
 default void video()
 {
     System.out.println("dont shot me in vedio");
 }

}
class new_mobile extends mobile implements camera ,phone
{
    public void take()
    {
        System.out.println("take picture please ");
    }
    public void call ()
    {
        System.out.println("attent csll please ");
    }

}

public class Main {

    public static void main(String[] args)
    {
        camera cam= new new_mobile();
        cam.take();
        cam.video();
        phone pho= new new_mobile();
        pho.call();
        pho.misscall();
        new_mobile ne=new new_mobile();
        System.out.println("\n\n\n\nafter new mobile objecr we can accessed function ");
        ne.call();
        ne.misscall();
        ne.take();
        ne.video();
        ne.name();
    }
}
