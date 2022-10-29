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
    } else{
      this.chooseSort(pressedKey);
    }
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
        BubbleSort bubbleSort = new BubbleSort(randomListGenerator.getList());
        bubbleSort.sort();
      }
      case 2 -> {
        QuickSort quickSort = new QuickSort(randomListGenerator.getList());
        quickSort.sort();
      }
      case 3 -> {
        CountingSort countingSort = new CountingSort(randomListGenerator.getList());
        countingSort.sort();
      }
      case 4 -> {
        BucketSort bucketSort = new BucketSort(randomListGenerator.getList());
        bucketSort.sort();
      }
      case 5 -> {
        MergeSort mergeSort = new MergeSort(randomListGenerator.getList());
        mergeSort.sort();
      }
      case 6 -> {
        List<Integer> listBubble = new ArrayList<>(randomListGenerator.getList());
        List<Integer> listQuick = new ArrayList<>(randomListGenerator.getList());
        List<Integer> listCounting = new ArrayList<>(randomListGenerator.getList());
        List<Integer> listBucket = new ArrayList<>(randomListGenerator.getList());
        List<Integer> listMerge = new ArrayList<>(randomListGenerator.getList());
        BubbleSort bubbleSort = new BubbleSort(listBubble);
        QuickSort quickSort = new QuickSort(listQuick);
        CountingSort countingSort = new CountingSort(listCounting);
        BucketSort bucketSort =new BucketSort(listBucket);
        MergeSort mergeSort = new MergeSort(listMerge);
        bubbleSort.sort();
        quickSort.sort();
        countingSort.sort();
        bucketSort.sort();
        mergeSort.sort();
      }
      default -> System.out.println("Oops");
    }
  }
}