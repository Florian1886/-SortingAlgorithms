package sorting.countingsort;

import sorting.Sort;

import java.util.ArrayList;
import java.util.List;

public class CountingSort implements Sort {
  private List<Integer> list = new ArrayList<>();

  public CountingSort(List<Integer> list) {
    this.list = list;
  }

  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }
  @Override
  public List<Integer> sort(){
    List<Integer> copiedList = this.getList();
    int max = 0;
    for (Integer integer : copiedList) {
      if (integer > max) {
        max = integer;
      }
    }
    int[] count = new int[max+1];
    for(int i = 0; i<count.length;i++){
      count[i] = 0;
    }
    for(int i = 0; i<copiedList.size(); i++){
      count[copiedList.get(i)]++;
    }
    List<Integer> resultSorted = new ArrayList<>();
    for(int i = 0; i < max + 1; i++){
      while(count[i] > 0){
        resultSorted.add(i);
        count[i]--;
      }
    }


    return resultSorted;
  }
}
