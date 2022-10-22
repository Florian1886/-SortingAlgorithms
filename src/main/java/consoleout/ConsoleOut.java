package consoleout;

import config.SortingAlgorithmsConfiguration;

import java.util.List;

public class ConsoleOut {


  public void showMenu() {
    System.out.println();
    System.out.println("Sorting app");
    System.out.println("Press the number what sort you want");
    System.out.println("-----------------------------------------------");
    System.out.println(SortingAlgorithmsConfiguration.BUBBLESORT_KEYNUMBER + ". Bubble sort");
    System.out.println(SortingAlgorithmsConfiguration.QUICKSORT_KEYNUMBER + ". Quick sort");
    System.out.println(SortingAlgorithmsConfiguration.COUNTINGSORT_KEYNUMBER + ". Counting sort");
    System.out.println(SortingAlgorithmsConfiguration.BUCKETSORT_KEYNUMBER + ". Bucket sort");
    System.out.println(SortingAlgorithmsConfiguration.MERGESORT_KEYNUMBER + ". Merge sort");
    System.out.println(SortingAlgorithmsConfiguration.ALLSORT_KEYNUMBER + ". All sort available above");
    System.out.println("0. Exit");
  }

  public void pressedOtherThanInt() {
    System.out.println("It's not a number. Enter the number");
  }

  public void pressedWrongNumber() {
    System.out.println("Number is not listed above");
  }

  public void printNumber(int number) {
    System.out.print(number + " ");
  }

  public void consoleStartBubble() {
    System.out.println();
    System.out.println("Bubble sort");
    System.out.println("Złożonośc obliczeniowa : O(n^2)");
    System.out.println("Złożonośc pamięciowa : O(1)");
  }

  public void consoleStartQuick() {
    System.out.println();
    System.out.println("Quick sort");
    System.out.println("Złożonośc obliczeniowa : O(n*log n)");
    System.out.println("Złożonośc pamięciowa : O(log n)");
  }

  public void consoleStartCounting() {
    System.out.println();
    System.out.println("Counting sort");
    System.out.println("Złożonośc obliczeniowa : O(n+k)");
    System.out.println("Złożonośc pamięciowa : O(k)");
  }

  public void consoleStartBucket() {
    System.out.println();
    System.out.println("Bucket sort");
    System.out.println("Złożonośc obliczeniowa : O(n+k)");
    System.out.println("Złożonośc pamięciowa : O(n)");
  }

  public void consoleStartMerge() {
    System.out.println();
    System.out.println("Merge sort");
    System.out.println("Złożonośc obliczeniowa : O(n*log n)");
    System.out.println("Złożonośc pamięciowa : O(log n)");
  }

  public void printResult(List<Integer> list) {
    for (Integer number : list) {
      System.out.print(number + " ");
    }
  }

  public void showTime(long time) {
    System.out.println();
    System.out.println("Time = " + time / SortingAlgorithmsConfiguration.MILISECONDS_DIVIDE + "ms");
  }
}
