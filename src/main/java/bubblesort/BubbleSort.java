package bubblesort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

  private List<Integer> list = new ArrayList<>();
  public BubbleSort(List<Integer> list) {
    this.setList(list);
  }

  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }
  public List<Integer> sort(){
    List<Integer> copiedList = this.getList();
    int temp;
    for(int i = 0; i< copiedList.size();i++){
      for(int j = 1; j < copiedList.size();j++){
        if(copiedList.get(j) < copiedList.get(j-1)){
          temp = copiedList.get(j);
          copiedList.set(j, copiedList.get(j-1));
          copiedList.set(j-1, temp);
        }
      }
    }
    return copiedList;
  }
}
