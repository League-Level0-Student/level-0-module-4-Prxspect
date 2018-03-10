PImage creeper;{
mouseX=270;
mouseY=395;}
void setup () {
size(500,500);
PImage borderland= loadImage("borderland.jpg");
borderland.resize(500,500);
background(borderland);
creeper=loadImage("creeper.png");
creeper.resize(5,5);

}
void draw () {
image(creeper, mouseX, mouseY);
fill(#FF1717);
ellipse(30,30,50,50);

}