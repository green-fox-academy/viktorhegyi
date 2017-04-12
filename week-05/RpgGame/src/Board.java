/**
 * Created by hegyi on 2017-04-10.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  final static int mapSize = 720;
  final static int tileSize = 72;
  Hero hero;
  Area area;
  Monster monster1;
  Monster monster2;
  Monster monster3;
  Boss boss;
  Hub hub;

  public Board() {
    setPreferredSize(new Dimension(mapSize, mapSize + 50));
    setVisible(true);
    hero = new Hero();
    area = new Area();
    monster1 = new Monster();
    monster2 = new Monster();
    monster3 = new Monster();
    boss = new Boss();
    hub = new Hub();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    area.drawBoard(graphics);
    hub.drawHub(graphics);

    hero.draw(graphics);
    monster1.draw(graphics);
    monster2.draw(graphics);
    monster3.draw(graphics);
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
    int x = hero.posX / tileSize;
    int y = hero.posY / tileSize;

    if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY >= tileSize && !area.getWallInfo(x,y - 1)) {
      hero.moveUp();
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY <= tileSize * 8 && !area.getWallInfo(x, y + 1)) {
      hero.moveDown();
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX <= tileSize * 8 && !area.getWallInfo(x + 1, y)) {
      hero.moveRight();
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT && hero.posX > 0 && !area.getWallInfo(x - 1, y))  {
      hero.moveLeft();
    }
    repaint();
  }
}
