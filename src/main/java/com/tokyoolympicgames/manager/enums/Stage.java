package com.tokyoolympicgames.manager.enums;

/**
 * Enum with the game stage.
 *
 * @author Wendler
 */
public enum Stage {
    FINAL("F"),
    EIGHTFINAL("EF"),
    QUARTERFINAL("QF"),
    SEMIFINAL("SF"),
    ELIMINATORY("E");

    private String stage;

    Stage(String stage) {
        this.stage = stage;
    }

    public String getStage() {
        return stage;
    }
}
