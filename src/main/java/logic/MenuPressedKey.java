package logic;

import config.SortingAlgorithmsConfiguration;
import consoleout.ConsoleOut;
import random.RandomListGenerator;
import sorting.bubblesort.BubbleSort;
import sorting.bucketsort.BucketSort;
import sorting.countingsort.CountingSort;
import sorting.mergesort.MergeSort;
import sorting.quicksort.QuickSort;

import java.util.ArrayList;
import java.util.List;

public class MenuPressedKey {

  private final ConsoleOut consoleOut = new ConsoleOut();

  public boolean checkPressedKey(int pressedKey) {
    boolean keyInRange = this.validateKey(pressedKey);
    if (this.checkExit(pressedKey)) {
      return false;
    }
    if (!keyInRange) {
      consoleOut.pressedWrongNumber();
      return true;
    }
    this.chooseSort(pressedKey);
    return true;
  }


  private boolean validateKey(int pressedKey) {
    return pressedKey > SortingAlgorithmsConfiguration.EXIT_KEYNUMBER &&
            pressedKey <= SortingAlgorithmsConfiguration.ALLSORT_KEYNUMBER;
  }

  private boolean checkExit(int pressedKey) {
    return pressedKey == SortingAlgorithmsConfiguration.EXIT_KEYNUMBER;
  }

  private void chooseSort(int pressedKey) {
    RandomListGenerator randomListGenerator = new RandomListGenerator();

    switch (pressedKey) {
      case 1 -> {
        new BubbleSort(randomListGenerator.getList());
      }
      case 2 -> {
        new QuickSort(randomListGenerator.getList());
      }
      case 3 -> {
        new CountingSort(randomListGenerator.getList());
      }
      case 4 -> {
        new BucketSort(randomListGenerator.getList());
      }
      case 5 -> {
        new MergeSort(randomListGenerator.getList());
      }
      case 6 -> {
        List<Integer> listBubble = new ArrayList<>(randomListGenerator.getList());
        List<Integer> listQuick = new ArrayList<>(randomListGenerator.getList());
        List<Integer> listCounting = new ArrayList<>(randomListGenerator.getList());
        List<Integer> listBucket = new ArrayList<>(randomListGenerator.getList());
        List<Integer> listMerge = new ArrayList<>(randomListGenerator.getList());
        new BubbleSort(listBubble);
        new QuickSort(listQuick);
        new CountingSort(listCounting);
        new BucketSort(listBucket);
        new MergeSort(listMerge);
      }
      default -> System.out.println("Oops");
    }
  }
}