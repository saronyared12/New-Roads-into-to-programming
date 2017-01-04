public class Card{
  
  // declare the properties
 private String color;
  private String suit;
  private char rank;
  
 
  // constructor - method to make this object
  public Card(){
    color = "red";
    suit = "diamonds";
    rank = 'A';
  }
  
  // the following are mutators
  public String getColor(){
    return color;
   
  }
  
 public void setColor(String newColor){
    color = newColor;
  }
  
  public String getSuit(){
    return suit;
  }
  
  public void setSuit(String newSuit){
    suit = newSuit;
    
  }
  
  public char getRank(){
    return suit;
    
  }
  public void setRank(Char newrank){
    rank = newRank;
  }
  
  
  // this prints out the object
  public String toString(){
    return color + " " + suit + " " + rank;
  }
  
}//end of the class
public Card (){
  color = "red";
    suit = "hearts";
    rank = 'K';
}
public String getColor(){
    return color;
   
  }
  
  public void setColor(String newColor){
    color = newColor;
  }
 public String toString(){
    return color + " " + suit + " " + rank;
  }
  
}

  