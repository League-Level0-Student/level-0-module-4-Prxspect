void setup() {
      PImage waldo = loadImage("wheres waldo.jpg"); // 5. Change this to match your file name.
      size(3500, 3500);
      image(waldo, 0, 0);
     doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
     woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}

void draw() {
      println("X: " + mouseX + " Y: " + mouseY); 

      // 7. If the mouse is on Waldo, print “Waldo found!”
if (mouseX>680 && mouseX<700 && mouseY>499 && mouseY<568) {
println("Waldo Found!");
playWoohoo();
}
if (mousePressed) { 
  playDoh();
}
      
      
      
     
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;