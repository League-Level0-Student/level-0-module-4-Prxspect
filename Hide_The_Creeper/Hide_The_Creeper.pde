import javax.swing.*;
PImage creeper; 
int creeperX=270;
int creeperY=395; 
void setup () {
size(500,500);
PImage borderland= loadImage("borderland.jpg");
borderland.resize(500,500);
background(borderland);
creeper=loadImage("creeper.png");
creeper.resize(5,5);

}
void draw () {
image(creeper, creeperX, creeperY);
fill(#FF1717);
ellipse(mouseX,mouseY,10,10);
if(isNear(mouseX,creeperX) && isNear(mouseY,creeperY)) {
  fill(#1BE323);
  ellipse(mouseX,mouseY,10,10);
  creeperX=100;
  creeperY=200;
  JOptionPane.showMessageDialog(null, "You Found The Creeper! Find The Next One!");
  
 }
  
 
}



boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else {
     return false;
}


}