package random;

import config.SortingAlgorithmsConfiguration;
import consoleout.ConsoleOut;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomListGenerator {
  private ConsoleOut consoleOut = new ConsoleOut();
  private List<Integer> list = new ArrayList<>();

  public RandomListGenerator() {
    this.setList(this.generateNumbers());
  }

  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }

  public List<Integer> generateNumbers() {
    List<Integer> numberList = new ArrayList<>();
    Random rand = new Random();
    int numberQuantity = SortingAlgorithmsConfiguration.NUMBERS_TO_GENERATE; //zrobic potem od uzytkownika
    int randomNumber;
    for (int i = 0; i < numberQuantity; i++) {
      randomNumber = rand.nextInt(SortingAlgorithmsConfiguration.LOWER_BOUND, SortingAlgorithmsConfiguration.UPPER_BOUND);
      numberList.add(randomNumber);
      consoleOut.printNumber(randomNumber);
    }
    this.setList(numberList);
    return numberList;
  }
}
