package np.com.rts.internship.beginners;

import java.util.*;


public class Main {
    String[] strings = new String[] {
            "hello",
            "mello",
            "mell",
            "1mell",
            "hmmm",
            "h2mmm",
            "zxcvb",
            "asdf",
            "%$compli"
    };

  public Main() {
      // Write your code here

      int j;
      boolean flag = true;
      String temp;

      while ( flag )
      {
          flag = false;
          for ( j = 0;  j < strings.length - 1;  j++ )
          {
              if ( strings [ j ].compareToIgnoreCase( strings [ j+1 ] ) > 0 )
              {
                  temp = strings [ j ];
                  strings [ j ] = strings [ j+1];
                  strings [ j+1] = temp;
                  flag = true;
              }
          }
      }
      for ( int k = 0;  k < 9;  k++ )
          System.out.println( strings [ k ] );
  }

    public static void main(String[] args) {

        new Main();

    }
  }
