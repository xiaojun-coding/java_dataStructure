package com.xiaojun;

public class Binary {
  public int search(int nums[], int target) {
    int left = 0;
    int rigth = nums.length - 1; // 左闭右闭
    while (left <= rigth) {
      int middle = left + ((rigth - left) >> 1) ;
      if(nums[middle] > target) {
        rigth = middle - 1;
      } else if(nums[middle] < target) {
        left = middle + 1;
      } else if(nums[middle] == target) {
        return middle;
      } else  {
        return  -1;
      }
    }
    return  -1;
  }
}
