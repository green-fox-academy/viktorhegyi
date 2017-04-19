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
  Skeleton skeleton;
  Boss boss;
  List<Character> listOfMonsters = new ArrayList<>();

  public Board() {
    setPreferredSize(new Dimension(mapSize, mapSize + HUB_HEIGHT));
    setVisible(true);
    hero = new Hero();
    area = new Area();
    boss = new Boss();
    listOfMonsters.add(boss);
    int numberOfSkeleton = randomNumber();

    for (int i = 0; i < numberOfSkeleton; i++) {
      skeleton = new Skeleton();
      while ( !isCharacterOnThisTile(skeleton.posX, skeleton.posY)) {
        listOfMonsters.add(skeleton);
      }
    }
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    area.drawBoard(graphics);
    drawMonsters(graphics);
    hero.draw(graphics);
    area.drawHub(graphics, hero.info());

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
    if (e.getKeyCode() == KeyEvent.VK_UP ) {
      hero.setImage(ImageLoader.getInstance().HERO_UP);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.setImage(ImageLoader.getInstance().HERO_DOWN);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.setImage(ImageLoader.getInstance().HERO_RIGHT);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT)  {
      hero.setImage(ImageLoader.getInstance().HERO_LEFT);
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    int x = hero.posX / tileSize;
    int y = hero.posY / tileSize;

    if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY >= tileSize && !area.isWall(x,y - 1)) {
      hero.posY -= tileSize;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY <= tileSize * 8 && !area.isWall(x, y + 1)) {
      hero.posY += tileSize;
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX <= tileSize * 8 && !area.isWall(x + 1, y)) {
      hero.posX += tileSize;
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT && hero.posX > 0 && !area.isWall(x - 1, y))  {
      hero.posX -= tileSize;
    }
    repaint();
  }

  public boolean isMonsters(int x, int y) {
    for (int i = 0; i <listOfMonsters.size() ; i++) {
      if(listOfMonsters.get(i).posX == x && listOfMonsters.get(i).posY == y){
        return true;
      }
    }return false;
  }

  public int randomNumber() {
    int randomNumber = (int) ((Math.random() * 4) + 2);
    return randomNumber;
  }

  public void drawMonsters(Graphics graphics) {
    for (int i = 0; i <listOfMonsters.size() ; i++) {
      listOfMonsters.get(i).draw(graphics);
    }
  }

  public boolean isCharacterOnThisTile(int currentPosX, int currentPosY) {
    for( Character character : listOfMonsters) {
      if ( character.posX == currentPosX && character.posY == currentPosY ) {
        return true;
      }
    } return false;
  }

}
