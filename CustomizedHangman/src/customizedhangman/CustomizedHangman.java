package customizedhangman;

public class CustomizedHangman 
{
   String name;
   int sticksRemaining; 
    
   public CustomizedHangman(String name)
   {
      this.name = name;
      this.sticksRemaining = 5;      
   }
   
   public CustomizedHangman(String name, int sticks)
   {
      this.name = name;
      this.sticksRemaining = sticks;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setName(String nm)
   {
      name = nm;
   }
   
   public int getSticksRemaining()
   {
      return this.sticksRemaining;
   }
   
   public boolean isDead()
   {
      return (this.sticksRemaining < 1);        // dead: lost all sticks
   }
   
   public void lostStick()
   {
//      if (this.sticksRemaining == 0)            // correct version
       if (sticksRemaining < 0)          // faulty version        	  
         System.out.println(name + " has no sticks left to lose!");
      else
      {
         this.sticksRemaining--;
         System.out.println(name + " says, 'I lost my stick! \'");
      }
   }
   
}