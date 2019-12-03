
public class TestLongMatrix {
	 public static void main(String[] args) {
		 Long[][] m1 = new Long[][]{{(long)1e10, (long)2e10, (long)3e10}, {(long)1e5, (long)2e5, (long)3e5}, {(long)1e4, (long)1e4, (long)1e4}};
		 Long[][] m2 = new Long[][]{{(long)1e3, (long)1e3, (long)1e3}, {(long)2e4, (long)2e4, (long)2e4}, {(long)1e3, (long)1e3, (long)1e3}};
	 
		 LongMatrix LongMatrix = new LongMatrix();
		 System.out.println("\nm1 + m2 is ");
		 GenericMatrix.printResult(m1, m2, LongMatrix.addMatrix(m1, m2), '+');
		 System.out.println("\nm1 * m2 is ");
		 GenericMatrix.printResult(m1, m2, LongMatrix.multiplyMatrix(m1, m2), '*');
	 }
}
