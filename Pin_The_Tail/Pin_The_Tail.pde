PImage lion;
PImage tail;
void setup (){
size(1900,1068);
lion=loadImage("lion.jpg");
background(lion);
tail=loadImage("dragontail.png");
} 
void draw () {
 if (mousePressed) {
  image(tail,mouseX-260,mouseY-20);
}
rect (0,0,100,100);
}