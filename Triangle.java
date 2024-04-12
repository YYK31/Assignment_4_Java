package javaassignment3;

public class Triangle {
           public void area(float a,float b,float c) {
        	 Triangle t=new Triangle();
        	 float semi=t.peri(a, b, c);
        	 semi=semi/2;
        	
        	 double area;
        	 
        	 area=semi*(semi-a)*(semi-b)*(semi-c);
        	 System.out.println("area of triangle:"+Math.sqrt(area));
        	 //System.out.println("semi perimeter of triangle is"+semi);
           }
           
           public float peri(float a,float b,float c) {
        	   float peri;
        	   peri=a+b+c;
        	   return peri;
           }
}
