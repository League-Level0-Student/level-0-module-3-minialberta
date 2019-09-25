int xOne=250;
int xTwo=750;
void setup(){
size(1000,500);
}
void draw(){
  fill(#F2F2F2);
  background(1000);
for (int i=25; i>0; i--){

      noFill();
        ellipse(xOne,250,i*20,i*20);
}
    for (int k=25; k>0; k--){
  
      noFill();
        ellipse(xTwo,250,k*20,k*20);
    
    }
    xOne++;
    xTwo--;
   if (xOne>1000){
    
    xOne=0;
   }
   if (xTwo<0){
     xTwo=1000;
}}
