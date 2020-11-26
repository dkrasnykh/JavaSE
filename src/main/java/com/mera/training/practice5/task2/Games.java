package com.mera.training.practice5.task2;

public enum Games {
    SNOWBALLS("снежки"),
    BOATS("запуск корабликов по ручьям"),
    PICKING_BERRIES("собирание и поедание ягод"),
    PUDDLE_MEASUREMENT("измерение глубины луж методом 'сапога'");

    final private String description;

    Games(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
