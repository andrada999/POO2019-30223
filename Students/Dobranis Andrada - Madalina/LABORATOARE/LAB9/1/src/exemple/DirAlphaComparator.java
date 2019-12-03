package exemple;

import java.util.Comparator;
import java.io.*;

class DirAlphaComparator implements Comparator<File> {
	 public int compare(File filea, File fileb) {
		 if (filea.isDirectory() && !fileb.isDirectory()) {
			 return -1;
		 } else if (!filea.isDirectory() && fileb.isDirectory()) {
			 return 1;
		 } else {
			 return filea.getName().compareToIgnoreCase(fileb.getName());
		 }
	 }
}

