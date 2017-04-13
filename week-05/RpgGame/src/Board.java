/**
 * Created by hegyi on 2017-04-10.
 */
import java.util.*;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  final static int mapSize = 720;
  final static int tileSize = 72;
  final static int HUB_HEIGHT = 50;
  Hero hero;
  Area area;
  Monster monster;
  Boss boss;
  Hub hub;
  List<Monster> listOfMonsters = new ArrayList<>();

  public Board() {
    setPreferredSize(new Dimension(mapSize, mapSize + HUB_HEIGHT));
    setVisible(true);
    hero = new Hero();
    area = new Area();
    boss = new Boss();
    hub = new Hub();
    
    for (int i = 0; i < randomNumber(); i++) {
      monster = new Monster();
      listOfMonsters.add(monster);
    }
  }
  public int randomNumber() {
    int randomNumber = (int) ((Math.random() * 5) + 2);
    return randomNumber;
  }

  public void drawMonsters(Graphics graphics) {
    for (int i = 0; i <listOfMonsters.size() ; i++) {
      listOfMonsters.get(i).draw(graphics);
    }
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    area.drawBoard(graphics);
    hub.drawHub(graphics);

    hero.draw(graphics);
    boss.draw(graphics);
    drawMonsters(graphics);
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
