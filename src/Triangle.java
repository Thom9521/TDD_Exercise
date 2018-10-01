public class Triangle {

    int sides = 0;
    double area;

    public int getSides(){
        return sides;
    }

    public void setSides(int sides){
        this.sides = sides;
    }

    public double area(int sides){
        area = (Math.pow(3,0.5)/4) * ((Math.pow(sides,2)));
    return area;
    }

}
