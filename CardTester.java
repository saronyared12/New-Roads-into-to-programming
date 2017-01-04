// this class is to test the Card object

public class CardTester{
  
  // main method for testing
  
  public static void main (String[] args){
   
    // reating a Card object 
    Card c = new Card();
    
    c.setColor("black");
    
    //print out new card
    
    System.out.println(c.toString());
  }
} //end of class

 public static void main(String[]args){
  suit s = new Suit();
  
}

  Card c = new Card();
c.setSuit( "hearts")
c.setColor("red");
c.setRank ('K')
 
    System.out.println(c.toString());

Card c2 = new Card();
c.setSuit( "club")
c.setColor("black");
c.setRank ('5')
 System.out.println(c.toString());

Card c3 = new Card();
c.setSuit( "spade")
c.setColor("red");
c.setRank ('J')
  System.out.println(c.toString());

Card c4 = new Card();
c.setSuit( "club")
c.setColor("red");
c.setRank ('7')
  System.out.println(c.toString());

Card c5 = new Card();
c.setSuit( "spade")
c.setColor("black");
c.setRank ('9')
  System.out.println(c.toString());
  }
}