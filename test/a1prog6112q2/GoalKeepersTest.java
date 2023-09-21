/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package a1prog6112q2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author lab_services_student
 */
public class GoalKeepersTest {

    GoalKeepers gk = new GoalKeepers(0, 0, 0, 0, "", 0, 0, 0, 0, 0, 0);

    @Test
    public void testCalcTime() {
        int exp1 = 1;
        int exp2 = 2;

        int actual1 = gk.calcTime(50);
        int actual2 = gk.calcTime(61);

        assertEquals(exp1, actual1);
        assertEquals(exp2, actual2);
    }

    @Test
    public void testCalcCleanSheet() {
        int exp1 = 4;
        int exp2 = 0;

        int actual1 = gk.calcCleanSheet(1);
        int actual2 = gk.calcCleanSheet(2);

        assertEquals(exp1, actual1);
        assertEquals(exp2, actual2);
    }

    @Test
    public void testCalcShotsSaved() {
        int exp1 = 3;
        int exp2 = 0;

        int actual1 = gk.calcShotsSaved(9);
        int actual2 = gk.calcShotsSaved(2);

        assertEquals(exp1, actual1);
        assertEquals(exp2, actual2);
    }

    @Test
    public void testCalcGoalsConceded() {
        int exp1 = -5;
        int exp2 = 0;

        int actual1 = gk.calcGoalsConceded(10);
        int actual2 = gk.calcGoalsConceded(1);

        assertEquals(exp1, actual1);
        assertEquals(exp2, actual2);
    }

    @Test
    public void testCalcGoals() {
        int exp1 = 6;

        int actual1 = gk.calcGoals(1);

        assertEquals(exp1, actual1);

    }

}
