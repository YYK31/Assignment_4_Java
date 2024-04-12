package javaassignment3;

public class Complex {
          private double real;
          private double img;
		public Complex(double real, double img) {
			this.real = real;
			this.img = img;
		}
		
		public Complex add(Complex c) {
			this.img=this.img+c.img;
			this.real=this.real+c.real;
			return this;
		}
		
		public Complex sub(Complex c) {
			this.img=this.img-c.img;
			this.real=this.real-c.real;
			return this;
		}
		
		public Complex mul(Complex c) {
			this.img=this.img*c.img;
			this.real=this.real*c.real;
			return this;
		}

		@Override
		public String toString() {
			return "Complex [real=" + real + ", img=" + img + "]";
		}
		
		
		
          
          
}
