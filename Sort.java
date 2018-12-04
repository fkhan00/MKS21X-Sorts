public class Sort
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
  }
}
