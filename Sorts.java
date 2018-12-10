import java.util.Random;
import java.util.Arrays;
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

  public static void insertionSort(int[] ary)
  {
    ArrayList<Integer> arList = new ArrayList<Integer>(ary.length);
    for(int i = 0; i < ary.length; i++)
    {
      for(int j = 0; j < arList.size(); j ++)
      {
        if(ary[i] > arList.get(i))
        {
          arList.add(j, ary[i]);
        }
      }
    }
    for(int i = 0; i < ary.length; i++)
    {
      ary[i] = arList.get(i);
    }
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
  public static void main(String[]artie){

    int[] randish = new int[Integer.parseInt(artie[0])];
    for(int i = 0 ; i < randish.length; i++){
      randish[i] =(int)(Math.random()*10000);
    }

    if(artie[1].equals("selection")){
      Sorts.selectionSort(randish);
    }
    if(artie[1].equals("bubble")){
      Sorts.bubbleSort(randish);
    }
    if(artie[1].equals("test")){
      int[] randish2 = Arrays.copyOf(randish,randish.length);
      int[] randish3 = Arrays.copyOf(randish,randish.length);
      Sorts.selectionSort(randish);
      Sorts.bubbleSort(randish2);
      Arrays.sort(randish3);
      if( Arrays.equals(randish,randish3)){
        System.out.println("Selection Correct!");
      }else{
       System.out.println("Selection BROKEN!!!!");
      }
      if( Arrays.equals(randish2,randish3)){
        System.out.println("Bubble Correct!");
      }else{
       System.out.println("Bubble BROKEN!!!!");
      }
    }
  }

}
