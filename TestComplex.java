package javaassignment3;

public class TestComplex {

	public static void main(String[] args) {
		Complex complex=new Complex(3, 7);
		Complex complex1=new Complex(6, 7);
		System.out.print("addition:");
		System.out.println(complex.add(complex1));
		System.out.print("sub:");
		System.out.println(complex.sub(complex1));
		System.out.print("mul:");
		System.out.println(complex.mul(complex1));

	}

}
