class Dmart
{
 static void getVegatables(String[] vegatables)
   {
   System.out.println("inside getVegatables()");
   System.out.println("Size of Vegatables is "+ vegatables.length);
   System.out.println("list of vegatables are");
     for(int s =  0; s< vegatables.length; s++)
     {
      System.out.println(vegatables[s] +" ");
    
     }

   System.out.println("end of getVegtables"); 

   }


static void getperfumes(String[] perfumes)
   {
   System.out.println("inside getperfumes");
   System.out.println("list of perfumes are");  
     for(int b = 0; b<perfumes.length; b++)
     {
       System.out.println(perfumes[b] +" ");
     }
   
   System.out.println("end of getPerfumes");
   }
static void getBiscuits(String[] Biscuits)
    {  
   System.out.println("inside getBiscuits()");
   System.out.println("Size of Biscuits is "+ Biscuits.length);
    System.out.println(" list of Biscuits");
    for(int f=0;f<Biscuits.length; f++)
    {
   System.out.println(Biscuits[f] +" ");
    }
    
   System.out.println("end of getBiscuits");
  }  
static void getfruits(String[] fruits)
{
   System.out.println("inside getfruits");
   System.out.println("list of fruits are");
   for(int c =0; c<fruits.length; c++)
    {
    System.out.println(fruits[c] +" ");
    }  
   System.out.println("end of getfruits");
}

static void getChocalates(String[] Chocalates)
{
 System.out.println("inside Chocalates");
 System.out.println(" list of Chocalates");
 for( int e=0; e<Chocalates.length; e++)
 {
 System.out.println(Chocalates[e] +" ");
 }
System.out.println("end of getChocalates");
}

static void getDetergents(String[] Detergents)
{
System.out.println("inside Detergents");
System.out.println(" list of  Detergents");
for(int  h=0; h<Detergents.length; h++){
System.out.println(Detergents[h] +" ");
}

 System.out.println("end of getDetergents");
}
static void getCooldrinks(String[] Cooldrinks)
  {
  System.out.println("inside Cooldrinks");
  System.out.println("list of Cooldrinks");
 for(int a=0; a<Cooldrinks.length; a++)
   {
    System.out.println(Cooldrinks[a] +" ");
   }

  
  System.out.println(" end of getCooldrinks");
}
static void getGrocerys(String[] Grocerys)
 {
 System.out.println("inside Grocerys ");
 System.out.println(" list of  Grocerys");
 for( int i=0; i<Grocerys.length; i++)
   {
System.out.println( Grocerys[i] +" ");
   }

System.out.println("end of getGrocerys");
 }

static void getCosmetics(String[]  Cosmetics)
  {
 System.out.println("inside Cosmetics ");  
 System.out.println(" list of Cosmetics");
 for(int k=0; k<Cosmetics.length; k++)
  {
System.out.println(Cosmetics[k] + " ");
 }

System.out.println("end of getCosmetics");
}


}