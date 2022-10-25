void setup() {
    background(20);
    size(700, 700);
  }
  
  float t;

  // https://www.youtube.com/watch?v=LaarVR1AOvs  
  
  static final float NUM_LINES = 15.0;
  
  void draw() {
    background(20);
    strokeWeight(5);
  
    translate(width/2, height/2);
    for (float i = 0; i <= NUM_LINES; i+=1.5) {
      stroke(#ff88f6);
      line(x1(t - i), y1(t - i), x2(t - i), y2(t - i));
  
      stroke(#4171ac);
      line(x2(t + i), y2(t + i), x1(t + i), y1(t + i));
  
      stroke(#c6b468);
      line(x1(t * i), y1(t / i), x2(t - 2*i), y2(t - i));
  
      stroke(#ecffde);
      line(x1(t / i), y1(t * i), x2(t + i), y2(t + i));
    }
  
    t+=0.5;
  }
  
  float x1(float t) {
    return sin(t / 10) * 100 + sin(t) * 2;
  }
  
  float y1(float t) {
    return cos(t / 10) * 100;
  }
  
  float x2(float t) {
    return sin(t / 10) * 100 + cos(t/15) * 200;
  }
  
  float y2(float t) {
    return cos(t / 10) * 100 + cos(t/2) * 40;
  }
  