package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListGenerator {

  public List<Integer> generateNumbers(){
    List<Integer> numberList = new ArrayList<>();
    Random rand = new Random();
    int numberQuantity = 50; //zrobic potem od uzytkownika
    int helper;
    for(int i = 0; i<numberQuantity; i++){
      helper = rand.nextInt(0,100);
      numberList.add(helper);
      System.out.print(helper + " ");
    }
    return numberList;
  }


}
