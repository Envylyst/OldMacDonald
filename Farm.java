class Farm  
{     
    private Animal[] aBunchOfAnimals = new Animal[3];    
    public Farm()     
    {       
       aBunchOfAnimals[0] = new NamedCow("cow","moo-eow or just sam","meow meow im a cow, i said meow meow im a cow");          
       aBunchOfAnimals[1] = new Chick("chick","bock","becki");
       aBunchOfAnimals[2] = new Pig("pig","oinkers");    
    }     
    public void animalSounds()    
    {
      for (int nI=0; nI < aBunchOfAnimals.length; nI++) 
      {             
         System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() );       
      }       
      System.out.println( "the cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );    
    } 
}