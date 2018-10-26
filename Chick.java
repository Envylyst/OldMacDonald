class Chick implements Animal {     
     private String myType;     
     private String mySound;
     private String mySoundSass;     
     public Chick(String type, String sound, String sass)     {         
         myType = type;         
         mySound = sound;
         mySoundSass = sass;     
     } 
     public Chick()
     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound() 
     { 

        if (Math.random()*2 < 1)
        {
             return mySound;
        }
        else
        {
             return mySoundSass;
        }
    }

     public String getType(){return myType;} 
}
