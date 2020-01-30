import java.awt.*;

public class PlayerBullet {

	private static final int SPEED = 8;

	private MyModel mm;
	private int x, y;
	private boolean isAlive;

	public PlayerBullet() {
		this.mm = new MyModel();
		isAlive = false;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void set(int x, int y) {
		this.x = x + 79 / 2;
		//this.x = x - 79 / 2;
		this.y = y + SPEED;
		//this.y = y - 100 + SPEED;
		isAlive = true;
	}

	public void move() {
		if (y < -100) {
			isAlive = false;
		} else {
			y -= SPEED;
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, 2, 10);
	}
}

