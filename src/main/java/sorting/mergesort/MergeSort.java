package sorting.mergesort;

import sorting.Sort;
import sorting.Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort extends Sort implements Sorting {

  public MergeSort(List<Integer> list) {
    super(list);

  }

  @Override
  public void sort() {
    consoleOut.consoleStartMerge();
    final long startTime = timeCounter.getTime();
    List<Integer> copiedList = this.getList();
    mergesort(copiedList, 0, copiedList.size() - 1);
    final long endTime = timeCounter.getTime();
    final long time = timeCalculator.calculateTime(startTime, endTime);
    consoleOut.printResult(copiedList);
    consoleOut.showTime(time);
  }

  private void mergesort(List<Integer> copiedList, int minArrayIndex, int maxArrayIndex) {
    if (minArrayIndex < maxArrayIndex) {
      int middleArrayIndex = (minArrayIndex + maxArrayIndex) / 2;
      mergesort(copiedList, minArrayIndex, middleArrayIndex);
      mergesort(copiedList, middleArrayIndex + 1, maxArrayIndex);
      merge(copiedList, minArrayIndex, middleArrayIndex, maxArrayIndex);
    }
  }

  private void merge(List<Integer> copiedList, int minArrayIndex,
                     int middleArrayIndex, int maxArrayIndex) {
    int sizeArrayLeft = middleArrayIndex - minArrayIndex + 1;
    int sizeArrayRight = maxArrayIndex - middleArrayIndex;

    int[] arrayLeft = new int[sizeArrayLeft];
    int[] arrayRight = new int[sizeArrayRight];

    for (int i = 0; i < sizeArrayLeft; i++) {
      arrayLeft[i] = copiedList.get(minArrayIndex + i);
    }
    for (int i = 0; i < sizeArrayRight; i++) {
      arrayRight[i] = copiedList.get(middleArrayIndex + 1 + i);
    }
    int indexLeftArray = 0;
    int indexRightArray = 0;
    int indexLowest = minArrayIndex;

    while (indexLeftArray < sizeArrayLeft && indexRightArray < sizeArrayRight) {
      if (arrayLeft[indexLeftArray] <= arrayRight[indexRightArray]) {
        copiedList.set(indexLowest, arrayLeft[indexLeftArray]);
        indexLeftArray++;
      } else {
        copiedList.set(indexLowest, arrayRight[indexRightArray]);
        indexRightArray++;
      }
      indexLowest++;
    }
    while (indexLeftArray < sizeArrayLeft) {
      copiedList.set(indexLowest, arrayLeft[indexLeftArray]);
      indexLeftArray++;
      indexLowest++;
    }
    while (indexRightArray < sizeArrayRight) {
      copiedList.set(indexLowest, arrayRight[indexRightArray]);
      indexRightArray++;
      indexLowest++;
    }
  }
}

