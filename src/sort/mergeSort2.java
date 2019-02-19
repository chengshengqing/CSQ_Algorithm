package sort;

import java.util.Formatter;
import java.util.Locale;

public class mergeSort2 {
	public static void main(String[] args) {

	      // create a new formatter
	      StringBuffer buffer = new StringBuffer();
	      Formatter formatter = new Formatter(buffer, Locale.US);
	      // format a new string
	      String name = "World";
	      formatter.format("Hello %s !", name);

	      // print the formatted string with default locale
	      System.out.println("" + formatter + " " + formatter.locale());

	   }
}
