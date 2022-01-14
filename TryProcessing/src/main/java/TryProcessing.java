import  processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 500;
    public static final int Diameter = 10;
    public static final int DENOMENATOR = 5;
    float x1=0,x2=0,x3=0,x4=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        getEllipseFirst(1,1);
        getEllipseSecond(2,2);
        getEllipseThird(3,3);
        getEllipseFourth(4,4);
    }
    private void getEllipseFirst(int numerator,float speed) {
        ellipse(x1,(HEIGHT*numerator)/DENOMENATOR, Diameter,Diameter);
        x1=x1+speed;
    }
    private void getEllipseSecond(int numerator,float speed) {
        ellipse(x2,(HEIGHT*numerator)/DENOMENATOR, Diameter,Diameter);
        x2=x2+speed;
    }
    private void getEllipseThird(int numerator,float speed) {
        ellipse(x3,(HEIGHT*numerator)/DENOMENATOR, Diameter,Diameter);
        x3=x3+speed;
    }
    private void getEllipseFourth(int numerator,float speed) {
        ellipse(x4,(HEIGHT*numerator)/DENOMENATOR, Diameter,Diameter);
        x4=x4+speed;
    }

}