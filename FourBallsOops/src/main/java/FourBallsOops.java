import processing.core.*;
public class FourBallsOops extends  PApplet {
    public static  final int width = 640;
    public static final int height = 500;
    public static final int diameter = 10;
    Ball[] balls=new Ball[4];
//    float state=0;
   @Override
    public void settings() {
        super.settings();
        size(width, height);
        for(int i=0;i<4;i++){
            balls[i]=new Ball(i,((i+1)*height)/5,i);
        }
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.display();
        }
//        ellipse(mouseX,mouseY,10,10);
    }
    class Ball {
        float posX;
        float posY;
        float speed;
        float state;

        Ball(float posX, float posY, float speed) {
            this.posX = posX;
            this.posY = posY;
            this.speed = speed+1;
            this.state=0;
        }

        public void display() {
            ellipse(state, posY, diameter, diameter);
            state=state+speed;
        }
    }
    public static void main(String[] args) {
        PApplet.main("FourBallsOops",args);


    }
}
