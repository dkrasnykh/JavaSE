package com.mera.training.practice5.task2;

public enum Season {
    WINTER(Games.SNOWBALLS),
    SPRING(Games.BOATS),
    SUMMER(Games.PICKING_BERRIES),
    AUTUMN(Games.PUDDLE_MEASUREMENT);

    final Games game;

    Season(Games game) {
        this.game = game;
    }

    public Games getGame() {
        return game;
    }
}
