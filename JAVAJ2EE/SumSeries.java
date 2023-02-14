package com.series;

public class SumSeries {


  public void SumSeries1(int n, double x) {
    double sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) 
        sum = sum - (x / i);
       else 
        sum = sum + (x / i);
      
    }
    System.out.println("Sum = " + sum);
  }

  public void SumSeries2() {
    int sum = 0;
    for (int i = 1; i <= 20; i++) {
      int product = 1;
      for (int j = 1; j <= i; j++) {
        product = product * j;
      }
      sum = sum + product;
    }
    System.out.println("Sum = " + sum);
  }
  
    public static void main(String[] args)
  {
    SumSeries ob = new SumSeries();
    ob.SumSeries1(4,2);
    ob.SumSeries2();
  }
}

         

          

