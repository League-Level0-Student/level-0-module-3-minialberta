int number=200;
void setup(){
size(500,500);

}
void draw(){

for (int i=0; i<8; i++){
    if (i % 2 == 0) {
      fill(#EA0000);
        ellipse(250,250,number,number);
    }
    else {
      fill(#0D0202);
      ellipse (250,250,number,number);
    }
    number=number-50;

}}
