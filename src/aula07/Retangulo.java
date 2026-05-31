package aula07;
// import

class Retangulo extends Forma{
    float altura;
    float largura;
    String cor;


    Retangulo (float altura, float largura, String cor) {
        if (altura*largura > 0){
            this.altura = altura;
            this.largura = largura;
            this.cor = cor;
        }
    }
    @Override
    public String toString() {
        return ("Largura : " + largura + " Altura : " + altura + " Cor:" + cor );
    }
    // getters
   // float getArea() {return area();}
    String getCor() {return cor;}
   // float getPerimeter(){return perimeter();}
    float getLargura(){return largura;}
    float getAltura(){return altura;}

    // setters
    void setAltura(float altura) {
        this.altura = altura;
    }
    void setLargura(float largura) {
        this.largura = largura;
    }
    void setCor(String color) {
        cor = color;
    }

    public double area() {
        return (double)(altura*largura);
    }
    
    public double perimetro() {return (double)(largura*2+altura*2);}


    public static void main (String[] args) {

       Retangulo cr = new Retangulo(5,7,"red");
       System.out.println(cr.area()); 
       cr.setAltura(8);
       System.out.println(cr.getLargura());
       System.out.println(cr);
    }
}
