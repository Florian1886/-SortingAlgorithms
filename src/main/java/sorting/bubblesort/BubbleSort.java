package sorting.bubblesort;

import sorting.Sorting;
import sorting.Sort;

import java.util.List;

public class BubbleSort extends Sort implements Sorting {

  public BubbleSort(List<Integer> list) {
    super(list);
  }

  @Override
  public void sort() {

    consoleOut.consoleStartBubble();
    final long startTime = timeCounter.getTime();

    List<Integer> copiedList = this.getList();
    int temp;
    for (int i = 0; i < copiedList.size(); i++) {
      for (int j = 1; j < copiedList.size(); j++) {
        if (copiedList.get(j) < copiedList.get(j - 1)) {
          temp = copiedList.get(j);
          copiedList.set(j, copiedList.get(j - 1));
          copiedList.set(j - 1, temp);
        }
      }
    }
    final long endTime = timeCounter.getTime();
    final long time = timeCalculator.calculateTime(startTime, endTime);
    consoleOut.printResult(copiedList);
    consoleOut.showTime(time);
  }
}
