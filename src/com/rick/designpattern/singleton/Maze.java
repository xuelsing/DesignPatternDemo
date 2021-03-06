package com.rick.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 迷宫
 * <p>
 * Created by MyPC on 2017/6/20.
 */

public class Maze {
    private List<Room> rooms;

    public Maze() {
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
}
