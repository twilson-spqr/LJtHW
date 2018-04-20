public class VariableChangeShortcuts {
  public static void main ( String [] args) {
    int i, j, k;

    i = 6;
    j = 6;
    k = 6;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
    i = i + 3;
    j = j - 3;
    k = k * 3;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

    i = 6;
    j = 6;
    k = 6;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
    i += 3;
    j -= 3;
    k *= 3;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

    i = j = k = 6;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
    i += 1;
    j -= 2;
    k *= 3;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

    i = j = 6;
    System.out.println( "i: " + i + "\tj: " + j );
    i =+ 1; //oops
    j =- 2;
    System.out.println( "i: " + i + "\tj: " + j + "\n" );

    i = j = 6;
    System.out.println( "i: " + i + "\tj: " + j );
    i++;
    j--;
    System.out.println( "i: " + i + "\tj: " + j + "\n" );
  }
}
