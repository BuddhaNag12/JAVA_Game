import java.util.*;

class search{
  public static void main(String[] args)
  {
    String s[]={"RED","BLUE","GREEN","YELLOW","BLACK","SILVER","GREY","WHITE","IVORY","VIOLET"};
    
    int search;
   boolean set=true;
   boolean value1=false;
   boolean value2=false;
   boolean value3=false;
   boolean value4=false;
   boolean value5=false;
   boolean value6=false;
   boolean value7=false;
   boolean value8=false;
   boolean value9=false;
   boolean value10=false;
     Scanner in=new Scanner(System.in);
     do{ System.out.println("ENTER A FAVORITE NUMBER BETWEEN 1-10");
    search=in.nextInt();
    for(String x:s)
    {
      if(search==1)
      {
        value1=true;
        set=true;
      }
      else if(search==2)
      {
        value2=true;
        set=true;
      }
      if(search==3)
      {
        value3=true;
        set=true;
      }
      if(search==4)
      {
        value4=true;
        set=true;
      }
      if(search==5)
      {
        value5=true;
        set=true;
      }
       if(search==6)
      {
        value6=true;
        set=true;
      }
       if(search==7)
      {
        value7=true;
        set=true;
      }
       if(search==8)
      {
        value8=true;
        set=true;
      }
       if(search==9)
      {
        value9=true;
        set=true;
      }
       if(search==10)
      {
        value10=true;
        set=true;
      }
    }
     if(search>10||search<1)
    {
      System.out.print("PROVIDE REQUIRED NUMBER:");
       set=false;
      }
     }while(!set);
      if(value1)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
       if(value2)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
        if(value3)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
           if(value4)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
              if(value5)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
                 if(value6)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
                    if(value7)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
                       if(value8)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
                          if(value9)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
                             if(value10)
      {
        System.out.print("YAY YOU GOT "+s[search-1]);
      }
    
  
  }
}
   
    
