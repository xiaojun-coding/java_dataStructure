package com.xiaojun;

public class ArrayRemainder {
  public int getReminder(int nums[], int val) {
    // 快慢指针
    int slowIndex = 0;
    for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
      if (nums[fastIndex] != val) {
        nums[slowIndex] = nums[fastIndex];
        slowIndex++;
      }
    }
    return slowIndex;
  }
}
