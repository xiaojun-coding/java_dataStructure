package com.xiaojun;

public class RemainderTest {
  public static void main (String args[]) {
    int nums [] = {1,3,4,5,6,7,4,4};
    ArrayRemainder rem = new ArrayRemainder();
    System.out.println(rem.getReminder(nums, 4));
  }
}
