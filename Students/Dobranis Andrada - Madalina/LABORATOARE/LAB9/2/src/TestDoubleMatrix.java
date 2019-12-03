
public class TestDoubleMatrix {
	 public static void main(String[] args) {
		 Double[][] m1 = new Double[][]{{1.11, 2.22, 3.33}, {4.44, 5.55, 6.66}, {1.11, 1.11, 1.11}};
		 Double[][] m2 = new Double[][]{{1.11, 1.11, 1.11}, {2.22, 2.22, 2.22}, {0.0, 0.3, 0.6}};
	 
		 DoubleMatrix DoubleMatrix = new DoubleMatrix();
		 System.out.println("\nm1 + m2 is ");
		 GenericMatrix.printResult(m1, m2, DoubleMatrix.addMatrix(m1, m2), '+');
		 System.out.println("\nm1 * m2 is ");
		 GenericMatrix.printResult(m1, m2, DoubleMatrix.multiplyMatrix(m1, m2), '*');
	 }
}
