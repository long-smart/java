package cn.loong.java;

import org.junit.Assert;
import org.junit.Test;

public class Func03Test {

    @Test
    public void testGetSum() {
        int result = Func03.getSum(1, 2);
        Assert.assertEquals(3, result);
    }
}
