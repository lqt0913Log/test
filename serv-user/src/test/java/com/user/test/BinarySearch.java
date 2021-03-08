package com.user.test;

import com.lqt.user.ServiceUserApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BinarySearch {
    @Test
    public void testBinary(){
        int[ ] arr = { 30,20,50,10,80,9,7,12,100,40,8};
        int searchWord = 20; // 所要查找的数
        Arrays.sort(arr); //二分法查找之前，一定要对数组元素排序
        System.out.println(Arrays.toString(arr));
        System.out.println(searchWord+"元素的索引："+binarySearch(arr,searchWord));
        System.out.println("========================");
        int errorWord = 66; // 查找不存在的数
        System.out.println(errorWord+"元素的索引："+binarySearch(arr,errorWord));
    }
    public static int binarySearch(int[] arr, int value) {

        int low = 0; // 开始位置
        int high = arr.length - 1; // 结束 位置

        while(low <= high) {
            int middle = (low + high) / 2;

            if (value == arr[middle]) {
                return middle; //返回查询到的索引位置
            }

            if (value > arr[middle]) {
                low = middle + 1;
            }

            if (value < arr[middle]) {
                high = middle - 1;
            }
        }
        //上面循环完毕，说明未找到，返回-1
        return -1;
    }
    @Test
    public void selectSort(){
        // 选择排序
        int a[]={1,54,6,3,78,34,12,45};

       int position=0;

       for(int i=0;i<a.length;i++) {

           int j = i + 1;

           position = i;

           int temp = a[i];

           for (; j < a.length; j++) {

               if (a[j] < temp) {
                   temp = a[j];
                   position = j;
               }
           }
           a[position]=a[i];
           a[i]=temp;
       }
        System.out.println(Arrays.toString(a));
    }
}
