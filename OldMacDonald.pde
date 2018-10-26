public void setup() {     
    Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());  
    Pig p = new Pig("pig", "oinkers");
    System.out.println(p.getType() + "goes" + c.getSound());  
}