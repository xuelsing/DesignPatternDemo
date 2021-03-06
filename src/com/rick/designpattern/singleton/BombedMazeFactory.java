package com.rick.designpattern.singleton;

/**
 * Created by MyPC on 2017/6/20.
 */
public class BombedMazeFactory extends MazeFactory {
    static {
        register(BombedMazeFactory.class.getName(), new BombedMazeFactory());
    }

    private BombedMazeFactory() {
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int n) {
        return new RoomWithABomb(n);
    }
}
