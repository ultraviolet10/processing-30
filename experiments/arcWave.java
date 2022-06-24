color bg = #000000; //black
color fg = #ff0000; //red

void setup() {
  size(700, 700);
}

void draw() {
  background(bg);

  noStroke();

  float tilesX = 4;
  float tilesY = tilesX;

  float tilesH = height / tilesY;
  float tilesW = width / tilesX;

  for (int i = 0; i < tilesX; i++) {
    for (int j = 0; j < tilesY; j++) {
      float posX = tilesW * i;
      float posY = tilesH * j;

      float wave = sin(radians(frameCount + i * 10 + j * 10));
      float mappedWave = map(wave, -1, 1, 0, 5);
      int selector = int(mappedWave);
      pushMatrix();
      translate(posX, posY);

      switch (selector) {
      case 0:
        fill(fg);
        arc(0, 0, tilesW*2, tilesH*2, radians(0), radians(90));
        break;
      case 1:
        fill(#1268b2);
        arc(tilesW, 0, tilesW*2, tilesH*2, radians(90), radians(180));
        break;
      case 2:
        fill(fg);
        arc(tilesW, 0, tilesW*2, tilesH*2, radians(90), radians(180));
        break;
      case 3:
        fill(fg);
        arc(0, tilesH, tilesW*2, tilesH*2, radians(180), radians(270));
        break;
      default:
        fill(#1268b2); //teal (?)
        ellipse(0, 0, tilesW, tilesH);
      }

      popMatrix();
    }
  }
}
