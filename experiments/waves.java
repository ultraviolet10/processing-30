void setup() {
  size(700, 700);
  background(0);
}


void draw() {
  translate(width/2, height/2);

  float mag = 300;
  float s = 3;
  noStroke();
  for (int i = 0; i < 100; i++) {

    float wave1 = map(sin(radians(frameCount*0.8 + i)), -1, 1, -mag, mag);
    float wave2 = map(cos(radians(frameCount + i)), -1, 1, -mag, mag);
    
    float c = map(sin(radians(frameCount * 2 + i)), -1, 1, 0, 255);
    
    fill(c);

    rect(wave1, wave2, s, s);
  }
}
