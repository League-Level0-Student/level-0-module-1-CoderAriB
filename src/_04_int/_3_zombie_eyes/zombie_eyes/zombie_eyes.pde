 PImage face;
void setup() {
   face = loadImage("face.jpg");
  size(1000, 1000);
  face.resize(1000, 1000);
  image(face, 0,0);

}
void draw() {
 fill(206, 29, 29);
 ellipse(363, 452, 100, 100);
 ellipse(650, 415, 100, 100); 
 
 
  fill(0,0,0);
  ellipse(363, 452, 25, 25);
  ellipse(650, 415, 25, 25); 
    
}
 
  void mouseMoved (){
   fill(17, 234, 43);
   ellipse(363, 452, 100, 100);
   ellipse(650, 415, 100, 100); 
 


     fill(0,0,0);
     ellipse(363, 452, 25, 25);
     ellipse(650, 415, 25, 25); 
   }
    
  
// cords are (363,452) and (650,415)

   
