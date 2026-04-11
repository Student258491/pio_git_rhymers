package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerJUnitTest {
    @Test
    public void testReportRejectedInitiallyZero() {
        HanoiRhymer rhymer = new HanoiRhymer();
        int result = rhymer.reportRejected();
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCountInValidElements() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(10);
        rhymer.countIn(5);
        rhymer.countIn(2);
        Assert.assertEquals(0, rhymer.reportRejected());
        Assert.assertEquals(2, rhymer.peekaboo());
    }

    @Test
    public void testCountInRejectedElements() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(5);
        rhymer.countIn(10);
        rhymer.countIn(8);
        rhymer.countIn(3);
        rhymer.countIn(4);
        Assert.assertEquals(3, rhymer.reportRejected());
        Assert.assertEquals(3, rhymer.peekaboo());
    }
}
