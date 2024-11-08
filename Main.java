import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(isPrime(1));
    System.out.println(isPrime(17));
  }

  public static boolean isPrime(int N)
  {
    boolean prime = true;
    if (N == 1)
      {
        prime = false;
      }
    for (int i = 2; i < N; i++)
    {
      if (N%i == 0)
      {
        prime = false;
      }
    }
    return prime;
  }
}
