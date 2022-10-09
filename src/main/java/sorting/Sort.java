package sorting;

import consoleout.ConsoleOut;
import logic.TimeCalculator;
import timecounter.TimeCounter;

import java.util.ArrayList;
import java.util.List;

public class Sort {
  protected List<Integer> list = new ArrayList<>();
  protected final ConsoleOut consoleOut = new ConsoleOut();
  protected final TimeCalculator timeCalculator = new TimeCalculator();
  protected final TimeCounter timeCounter = new TimeCounter();


  public Sort(List<Integer> list) {
    this.setList(list);
  }

  protected List<Integer> getList() {
    return list;
  }

  protected void setList(List<Integer> list) {
    this.list = list;
  }
}
