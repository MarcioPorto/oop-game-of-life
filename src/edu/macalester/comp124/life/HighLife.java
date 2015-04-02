package edu.macalester.comp124.life;

/**
 * RuleSet implementing a variation of Conway's Game of Life called High Life.
 */

public class HighLife implements RuleSet {

    public String getName() {
        return "High Life";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {
        if (isAlive) {
            if (neighborCount < 2) {
                return false;
            } else if (neighborCount >= 4) {
                return false;
            }
        } else {
            if (neighborCount == 3 || neighborCount == 6) {
                return true;
            }
        }
        return isAlive;
    }
}

