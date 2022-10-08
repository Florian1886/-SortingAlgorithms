package quicksort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
  private List<Integer> list = new ArrayList<>();

  public QuickSort(List<Integer> list) {
    this.list = list;
  }

  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }
  public List<Integer> sort(){
    List<Integer> copiedList = this.getList();
    quicksort(copiedList,0, copiedList.size()-1);
    return copiedList;
    }


  private void quicksort(List<Integer> lista, int frontList, int backList){
    int i = frontList;
    int j = backList;
    int pivot = lista.get((i+j)/2);
    int temp;

    while(i<=j){
      while(lista.get(i)<pivot){
        i++;
      }
      while(lista.get(j)>pivot){
        j--;
      }
      if(i<=j){
        temp = lista.get(i);
        lista.set(i,lista.get(j));
        lista.set(j,temp);
        i++;
        j--;
      }
      if(frontList<j){
        quicksort(lista,frontList,j);
      }
      if(backList<i){
        quicksort(lista,i,backList);
      }
    }

  }
}
