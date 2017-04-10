/**
 * Created by hegyi on 2017-04-10.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int canvasSise = 720;
  int tileSize = 72;
  Hero hero = new Hero();
  Boss boss = new Boss("assets/boss.png", tileSize * 9, tileSize* 9);


  public Board() {
    setPreferredSize(new Dimension(canvasSise, canvasSise));
    setVisible(true);

  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    Area tile = new Area();
    tile.drawTile("assets/wallposition.csv");
    tile.drawBoard(graphics);

    hero.draw(graphics);
    boss.draw(graphics);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY > 0) {
      hero.posY -= tileSize;
      hero.setImage("assets/hero-up.png");
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN ) {
      hero.posY += tileSize;
      hero.setImage("assets/hero-down.png");
      if (hero.posY > canvasSise - tileSize) {
        hero.posY -= tileSize;
      }
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.posX += tileSize;
      hero.setImage("assets/hero-right.png");
      if (hero.posX > canvasSise - tileSize) {
        hero.posX -= tileSize;
      }
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.posX -= tileSize;
      hero.setImage("assets/hero-left.png");
      if (hero.posX < 0) {
        hero.posX += tileSize;
      }
    }
    repaint();
  }

}