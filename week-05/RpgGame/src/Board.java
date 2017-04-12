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
  Area tile = new Area();
  Monster monster1 = new Monster();

  public Board() {
    setPreferredSize(new Dimension(canvasSise, canvasSise));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    tile.drawTile("assets/wallposition.csv");
    tile.drawBoard(graphics);

    hero.draw(graphics);
    monster1.draw(graphics);
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
    int x = hero.posX / tileSize;
    int y = hero.posY / tileSize;

    if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY >= tileSize && !tile.isWall(x,y - 1)) {
      hero.moveUp();
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY <= tileSize * 8 && !tile.isWall(x, y +1)) {
      hero.moveDown();
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX <= tileSize * 8 && !tile.isWall(x + 1, y)) {
      hero.moveRight();
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT && hero.posX > 0 && !tile.isWall(x - 1, y))  {
      hero.moveLeft();
    }
    repaint();
  }
}
