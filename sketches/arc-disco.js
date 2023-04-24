let bg = "#000000";
let fg = "#0fff22";
let fg2 = "#123456";
let fg3 = "#ff0000";
let hoverColor = "#ff8000";

function setup() {
  createCanvas(900, 900);
}

function draw() {
  background(bg);
  noStroke();

  let tileX = 10;
  let tileY = tileX;
  let tileW = width / tileX;
  let tileH = height / tileY;

  for (let x = 0; x < tileX; x++) {
    for (let y = 0; y < tileY; y++) {
      let posX = tileW * x;
      let posY = tileH * y;

      let wave = sin(radians(frameCount + x * 10 + y * 10));
      let mappedWaves = map(wave, -1, 1, 0, 5);
      let selector = int(mappedWaves);
      push();
      translate(posX, posY);

      // Check if mouse is hovering over the current arc
      if (dist(mouseX - posX, mouseY - posY, tileW, tileH) < tileW) {
        fill(hoverColor);
      } else {
        // Normal algorithm resumes
        if (selector == 0) {
          fill(fg);
          arc(0, 0, tileW * 2, tileH * 2, radians(0), radians(90));
        } else if (selector == 1) {
          fill(fg2);
          arc(tileW, 0, tileW * 2, tileH * 2, radians(90), radians(180));
        } else if (selector == 3) {
          fill(fg);
          square(tileW, tileH, tileW * 2);
        } else if (selector == 4) {
          fill(fg3);
          arc(0, tileH, tileW * 2, tileH * 2, radians(270), radians(360));
        } else {
          fill(fg);
          rect(0, 0, tileW, tileH);
        }
      }

      // Draw arc
      arc(tileW, tileH, tileW * 2, tileH * 2, radians(0), radians(90));

      pop();
    }
  }
}
