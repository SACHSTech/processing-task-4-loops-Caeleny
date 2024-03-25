import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
    // Background size
    size(400, 400);
  }

  public void setup() {
    // Background color
    background(255, 255, 255);

    
  }

  public void draw() {
    
    // Loop to create gradient
    for (int x = 0; x < width/2; x++) {
      for (int y = width/2; y < height; y++) {
        int gray = (int) map(x, 0, width/2, 0, 255);
        stroke(gray); 
        point(x, y);
    }
  }
    // Loop to create purple grid of circles 
    for (int circleY = width/22; circleY <= width/2; circleY += width/10) {
      for (int circleX = width/12 + width/2; circleX <= width/1; circleX += width/11) {
        fill(173, 38, 115);
        ellipse(circleX, circleY, width/19, height/19);
      }
    }

    // Set up variables for vertical lines of grid
    float WidthV = width / 2; 
    float HeightV = height / 2;
  
    // Loop to create vertical lines
    for (int x = 0; x <= WidthV; x += WidthV / 10) {
      stroke(0);
      line(x, 0, x, HeightV); 

    // Set up variables for horizontal lines of grid
    float WidthH = width / 2; 
    float HeightH = height / 2;

    // Loop to create horizontal lines
    for (int y = 0; y <= HeightH; y += HeightH / 10) {
      stroke(0);
      line(0, y, WidthH, y);
      }
    }
    // Circle in the middle of the petals of the flower
    fill(31, 74, 21);
    ellipse((float)(width*0.75), (float)(height*0.75), width/10, height/10); 
    
    }


}


   
  

  
   


