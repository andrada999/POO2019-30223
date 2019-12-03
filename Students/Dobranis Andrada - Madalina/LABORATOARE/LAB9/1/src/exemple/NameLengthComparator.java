package exemple;

import java.util.Comparator;
import java.io.*;

class NameLengthComparator implements Comparator<File> {
	 public int compare(File filea, File fileb) {
		 int comp = fileb.getName().length() - filea.getName().length();
		 if (comp != 0) {
			 return comp;
		 } else {
			 return filea.getName().compareToIgnoreCase(fileb.getName());
		 }
	 }
}