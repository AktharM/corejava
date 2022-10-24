class Speaker
{
 static String brand;
 static String Color;
 static double price;
 static boolean isConnected;
 static int minVolume;
 static int currentVolume = 8;
 static int maxVolume;

    public static boolean onOroff()
    {
    System.out.println(" inside onOrOff()");
    if(isConnected == false)
    {
    isConnected=true;
    System.out.println("Speaker is turned onn..... ");
    }
    else if(isConnected == true)
     {
           isConnected=false;
          System.out.println("Speaker is turned off..... ");
     }

       System.out.println("end of onOroff()");
       return isConnected ;
     }
        public static void increaseVolume()
        {
           System.out.println("inside increaseVolume()");
           if(isConnected ==true)
           {
              if(currentVolume<maxVolume)
              {
                currentVolume= currentVolume+1;
                System.out.println("the current volume is:"+currentVolume);
              }
              else
              {
                 System.out.println("max Volume reached...");
              }
          }
              else
              {
              System.out.println("gube....firstspeaker on madu");
              }
        }
         
        public static void decreaseVolume()
        {
           System.out.println("inside decreseVolume()");
           if(isConnected ==true)
           {
              if(currentVolume>minVolume)
              {
                currentVolume= currentVolume-1;
                System.out.println("the current volume is:" +currentVolume);
              }
              else
              {
                 System.out.println("min Volume reached...");
              }
          }
              else
              {
              System.out.println("gube....firstspeaker on madu");
              }
        }
 


 


}


