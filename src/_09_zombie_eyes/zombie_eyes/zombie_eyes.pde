
void setup() {
  PImage face = loadImage("zzz.jpg");
image(face, 0, 0);
size(700,700);
face.resize(500,500 );
}
void draw() {
  fill(mouseX, mouseY,100);
ellipse(283,270, 100,100 );
ellipse(503,250 , 150,150 );
fill(0,0,0);
ellipse(503,250,50,50);
ellipse(283,270,25,25);
}
