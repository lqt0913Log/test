package com.lqt.user.controller;

import java.math.BigDecimal;

public class SFJT {
    private static int a=1;
    private static int b=2;
    private static int c=3;
    private static long  sum=0;
    private static int number;
    private static BigDecimal bigDecimalSum;
    private static BigDecimal bigDecimal1;
    private static BigDecimal bigDecimal2;
    private static BigDecimal bigDecimal3;
    private static BigDecimal bigDecimalSumAdd=new BigDecimal(0);

    public static BigDecimal getBigDecimal(int d){
        BigDecimal b1=new BigDecimal(1);
        BigDecimal b2;
        for(int i=1;i<=d;i++){
            b2=new BigDecimal(i);
            b1=b1.multiply(b2);
        }
        return b1;
    }
    public static void main(String args[]){
        for(int i=0;i<=100;i++){
            for(int j=0;j<=50;j++){
                for(int k=0;k<=33;k++){
                    if((i*a+j*b+k*c)==100){
                        number=i+j+k;
                        bigDecimalSum=getBigDecimal(number);

                        if(i>0)bigDecimal1=getBigDecimal(i);
                        else bigDecimal1=new BigDecimal(1);

                        if(j>0)bigDecimal2=getBigDecimal(j);
                        else bigDecimal2=new BigDecimal(1);

                        if(k>0)bigDecimal3=getBigDecimal(k);
                        else bigDecimal3=new BigDecimal(1);

                        bigDecimalSum=bigDecimalSum.divide(bigDecimal1).divide(bigDecimal2).divide(bigDecimal3);
                        bigDecimalSumAdd=bigDecimalSumAdd.add(bigDecimalSum);
                        sum++;
                        System.out.println("一阶:"+i+"\t2阶:"+j+"\t3阶:"+k+"\t\t有"+bigDecimalSum);
                        break;
                    }else if((i*a+j*b+k*c)>100){
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
        System.out.println(bigDecimalSumAdd);
    }
}
