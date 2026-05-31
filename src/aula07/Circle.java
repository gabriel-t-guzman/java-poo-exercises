package aula07;
// import

class Circle extends Forma{
    float radius;
    String cor;


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
    String getCor() {
        return cor;
    }

    void setRadius(float radius) {
        this.radius = radius;
    }
    void setCor(String color) {
        cor = color;
    }

    public double area() {
        return (double)(radius*radius*Math.PI);
    }
    
    public double perimetro() {return (double)(2*radius*Math.PI);}


    public static void main (String[] args) {

       Circle cr = new Circle(5);
       System.out.println(cr.getRadius()); 
       cr.setRadius(8);
       System.out.println(cr.getRadius());
       System.out.println("The circle perimeter is " + cr.perimetro() );
    }
}
