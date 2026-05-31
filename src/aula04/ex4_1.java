package aula04;
// import

class Circle {

    float  radius;
  
    Circle (float radius) {
        if (radius > 0)
            this.radius = radius;
    }
    @Override
    public String toString() {
        return ("The radius is : " + radius);
    }

    float getRadius() {
        return radius;
    }

    void setRadius(float radius) {
        this.radius = radius;
    }

    float Area() {return (float)(radius*radius*Math.PI);}
    float Perimeter() {return (float)(2*radius*Math.PI);}

   // @Override
   // public boolean equals() { // ver na net como override equals()
   // } 
}

class Rectangle {

    float heigth;
    float width;

    Rectangle (float h, float w) {
        if (h > 0 && w > 0) {
            heigth = h;
            width = w;
        }
    }
    @Override
    public String toString() {
        return ("The heigth is : "+heigth + " The width is : " + width);
    }

    float getHeigth(){return heigth;}
    float getWidth(){return width;}

    void setHeigth(float heigth) {
        if (heigth > 0)
            this.heigth = heigth;
    }
    void setWidth(float width) {
        if (width > 0)
            this.width = width;
    }

    float Area() {return (float)(heigth * width);}
    float Perimeter() {return (float)(2*heigth + width*2);}



}

class Triangle {

    float side1;
    float side2;
    float side3;

    Triangle (float s1, float s2, float s3) {
        if ((s1 > 0 && s2 > 0 && s3 > 0) && ((s1 < s2 + s3) && (s2 < s1 + s3) && (s3 < s1 + s2))) {
            side1 = s1; side2 = s2; side3 = s3;
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

    float Area() {
        float s = (float)((side1 + side2 + side3)/2);
        float area = (float)(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
        return area;
    }
    float Perimeter() {return (float)(side1 + side2 + side3);}


}

public class ex4_1 {
    public static void main (String[] args) {

        Triangle t = new Triangle(3,3,5);
        System.out.println(t);
        Rectangle rec = new Rectangle(4, 4);
        System.out.println(rec.toString());
       Circle cr = new Circle(5);
       System.out.println(cr.getRadius()); 
       cr.setRadius(8);
       System.out.println(cr.getRadius());
       t.setSide2(4);
       System.out.println(t.toString());
       System.out.println(cr.Area());
       System.out.println(t.Area());
       System.out.println("The circle perimeter is " + cr.Perimeter() );
    }

}
