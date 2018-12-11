import java.util.Random;
import java.util.ArrayList;
public class Sorts
{
  public static void selectionSort(int[] ary)
  {
    int[] min = new int[2];
    for(int i = 0; i < ary.length; i++)
    {
      min[0] = ary[ary.length - 1];
      min[1] = ary.length - 1;
      for(int j = i; j < ary.length; j++)
      {
        if(ary[j] < min[0])
        {
          min[0] = ary[j];
          min[1] = j;
        }
      }
      ary[min[1]] = ary[i];
      ary[i] = min[0];
    }
    //System.out.println(toString(ary));
  }
  public static void bubbleSort(int[] ary)
  {
    int hold = 0;
    boolean check = false;
    while(!check)
    {
      check = true;
      for(int i = 0; i < ary.length- 1; i++)
      {
        if(ary[i] > ary[i + 1])
        {
          check = false;
          hold = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = hold;
        }
        if(ary[i + 1] < ary[i])
        {
          check = false;
          hold = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = hold;
        }
      }
    }
    //System.out.println(toString(ary));
  }
  public static void insertionSort(int[] ary)
  {
    int c = 0;
    int place = 0;
    for(int i = 1; i < ary.length; i++)
    {
      place = ary[i];
      c = i - 1;
      while(c >= 0 && place <= ary[c])
      {
        ary[c + 1] = ary[c];
        c--;
      }
      ary[c + 1] = place;
    }
}


  public static String toString(int[] ary)
  {
    String output = "[";
    for(int i = 0; i < ary.length; i++)
    {
      output += (" " + ary[i]);
    }
    output += "]";
    return output;
  }

  // public static void main(String[] args)
  // {
  //
  //   Random randgen = new Random();
  //   int[] nAry = new int[Integer.parseInt(args[0])];
  //   for(int i = 0; i < Integer.parseInt(args[0]); i++)
  //   {
  //     nAry[i] = randgen.nextInt() % 100;
  //   }
  //    //long start = System.currentTimeMillis();
  //    //bubbleSort(nAry);
  //   //long elapsedTimeMillis = System.currentTimeMillis()-start;
  //    //System.out.println(elapsedTimeMillis);
  //   long start = System.currentTimeMillis();
  //   selectionSort(nAry);
  //   long elapsedTimeMillis = System.currentTimeMillis()-start;
  //   System.out.println(elapsedTimeMillis);
  //   start = System.currentTimeMillis();
  //   insertionSort(nAry);
  //   elapsedTimeMillis = System.currentTimeMillis()-start;
  //   System.out.println(elapsedTimeMillis);
  //   }
}
