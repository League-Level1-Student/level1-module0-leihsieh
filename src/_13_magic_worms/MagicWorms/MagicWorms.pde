float x = 0;
float y = 0;
int worm = 50;

void setup(){
  size(600,600);
  background(0,0,0);
}

void draw(){
  makeMagical();
  fill(255,0,0);
  for(int i = 0; i < worm; i++){
    ellipse(x,y, 15,15);
    x = getWormX(i);
    y = getWormY(i);
  }
}

void mouseClicked(){
  worm++;
}

 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
