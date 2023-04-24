let bg = "#000000";
let fg = "#9e4d9e";

function setup() {
  createCanvas(900, 900);
}

function draw() {
  background(bg);
  noStroke();

  let tileX = 11;
  let tileY = tileX;
  let tileW = width / tileX;
  let tileH = width / tileY;

  for (let x = 0; x < tileX; x++) {
    for (let y = 0; y < tileY; y++) {
      let posX = tileW * x;
      let posY = tileH * y;

      push();
      translate(posX, posY);

      fill(fg);
      square(posX / 2, posY / 2, tileW / 2 + tileH / 2);

      pop();
    }
  }
}
