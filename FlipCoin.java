package flip_coin;

  public class FlipCoin {
	  
	  public static void main(String[] args){
		  if (Math.random() < 0.5)
			  System.out.println("Tails");
		  else {
			  System.out.println("Heads");
		  }
	  }
  }