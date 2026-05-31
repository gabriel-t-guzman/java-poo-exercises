package aula07;


class Triangle extends Forma{                                                                                                                                                       
     float side1;
     float side2;
     float side3;
     String cor;
 
     Triangle (float s1, float s2, float s3, String color) {
        if ((s1 > 0 && s2 > 0 && s3 > 0) && ((s1 < s2 + s3) && (s2 < s1 + s3) && (s3 < s1 + s2))) {
             side1 = s1; side2 = s2; side3 = s3; cor = color;
        }
     }
 
     @Override
     public String toString() {
        return ("The side1 is : " + side1 + " The side2 is : " + side2 + " The side3 is : " + side3);
     }
 
     float getSide1(){return side1;}
     float getSide2(){return side2;}
     float getSide3(){return side3;}
    
     void setSide1(float s1){
        if ((s1>0) && ((s1 < side2 + side3) && (side2 < s1 + side3) && (side3 < s1 + side2)))
            side1 = s1;
     }
     void setSide2(float s2){
         if ((s2>0) && ((side1 < s2 + side3) && (s2 < side1 + side3) && (side3 < side1 + s2)))
          side2 = s2;
     }
     void setSide3(float s3){
         if ((s3>0) && ((side1 < side2 + s3) && (side2 < side1 + s3) && (s3 < side1 + side2)))
             side3 = s3;
     }
 
     public double area() {
         float s = (float)((side1 + side2 + side3)/2);
        float area = (float)(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
        return area;
     }
     public double perimetro() {return (float)(side1 + side2 + side3);}

     public static void main(String[] args) {     
     
           Triangle tr = new Triangle(4,4,7,"blue");
           System.out.println(tr.area());
           System.out.println(tr.perimetro());     
     
     }




}


  

