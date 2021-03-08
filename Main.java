class Main 
{
  public static void main(String[] args) 
  {
    System.out.println(concatInts(5));
    System.out.println(whileInts(5));
  }
  public static String concatInts(int num)
  {
    String result = " ";
    //base case - lowest level - turn around point
    if (num == 0)
    {
      return " " + 0;
    }
    else 
    {
      result += num + ", " + concatInts(num - 1);
      //this is the line in which the recursion happens 
      //(you call the method again within the same method: concatInts)
      //note the method name and the decrement of the parameter: The method keeps running until result == 0 by decrementing it. It recursively gets decremented by 1

    }
    return result;
  }//close concatInts

  public static String whileInts(int num)
  {
    String result = " ";
    while (num != -1)
    {
      result += num + ",  ";
      num--;
    }
    //How to add 0 without using -1 in the while loop
    //result += "0";
    return result;
  }
}