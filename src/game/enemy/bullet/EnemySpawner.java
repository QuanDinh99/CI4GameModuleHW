package game.enemy.bullet;

import base.GameObject;
import base.GameObjectManager;
import game.enemy.Enemy;

import java.util.Random;

public class EnemySpawner extends GameObject {
    private int count = 0;
    private Random random;

    public EnemySpawner() {
        this.random = new Random();
    }

    @Override
    public void run() {
        super.run();
        if (this.count >= 80) {
            Enemy enemy = new Enemy();
            enemy.position.set(random.nextInt(400),0);
            enemy.velocity.set(0,random.nextInt(3) + 1);
            GameObjectManager.instance.add(enemy);
            this.count = 0;
        }
        else{
            this.count += 1;
        }
    }
}
