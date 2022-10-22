package sorting.quicksort;

import sorting.Sorting;
import sorting.Sort;

import java.util.List;

public class QuickSort extends Sort implements Sorting {

  public QuickSort(List<Integer> list) {
    super(list);
    consoleOut.consoleStartQuick();
    final long startTime = timeCounter.getTime();
    list = this.sort();
    final long endTime = timeCounter.getTime();
    final long time = timeCalculator.calculateTime(startTime, endTime);
    consoleOut.printResult(list);
    consoleOut.showTime(time);
  }

  @Override
  public List<Integer> sort() {
    List<Integer> copiedList = this.getList();
    quicksort(copiedList, 0, copiedList.size() - 1);
    return copiedList;
  }


  private void quicksort(List<Integer> lista, int frontList, int backList) {
    int i = frontList;
    int j = backList;
    int pivot = lista.get((i + j) / 2);
    int temp;

    do {
      while (lista.get(i) < pivot) {
        i++;
      }
      while (lista.get(j) > pivot) {
        j--;
      }
      if (i <= j) {
        temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
        i++;
        j--;
      }
    }
    while (i <= j);
    if (frontList < j) {
      quicksort(lista, frontList, j);
    }
    if (i < backList) {
      quicksort(lista, i, backList);
    }
  }
}


