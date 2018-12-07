public class Sort
{
  public static void bubbleSort(int[] ary)
  {
    int hold = 0;
    boolean check = false;
    while(!check)
    {
      check = true;
      for(int i = 0; i < ary.length - 1; i++)
      {
        if(ary[i] > ary[i + 1])
        {
          check = false;
          hold = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = hold;
        }
      }
    }
    System.out.println(ary.toString());
  }

  public static void main(String[] args)
  {
    int[] nAry = new int[10];

    for(int i = 0; i < 10; i++)
    {

    }
  }
}
