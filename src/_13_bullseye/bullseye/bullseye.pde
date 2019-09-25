int number=200;
void setup(){
size(500,500);

}
void draw(){

for (int i=8; i>0; i--){
    if (i % 2 == 0) {
      fill(#EA0000);
        ellipse(250,250,i*20,i*20);
    }
    else {
      fill(#0D0202);
      ellipse (250,250,i*20,i*20);
    }


}}
