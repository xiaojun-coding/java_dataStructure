package com.xiaojun;

public class BinaryTest {
  public static void main (String args[]) {
    // 测试
    Binary binary = new Binary();
    int nums[] = {-1,2,3,4,7,8,9,10};
    System.out.println(binary.search(nums, -1)); // 0
    System.out.println(binary.search(nums, 2)); // 1
    System.out.println(binary.search(nums, 100)); // -1
    System.out.println(binary.search(nums, 8)); // 5
    System.out.println(binary.search(nums, 10)); // 7

    BinaryTwo binary2 = new BinaryTwo();
    int nums1[] = {-1,2,3,4,7,8,9,11};
    System.out.println(binary2.search(nums1, -1)); // 0
    System.out.println(binary2.search(nums1, 2)); // 1
    System.out.println(binary2.search(nums1, 100)); // -1
    System.out.println(binary2.search(nums1, 8)); // 5
    System.out.println(binary2.search(nums1, 11)); // 7

  }
}

