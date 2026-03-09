package testngconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation
{

    public int addition(int a,int b)
    {
        int sum = a+b;
        return sum;
    }

    public  boolean eligibleToVote(int age)
    {
        boolean flag = false;
        if(age>=18)
        {
            flag= true;
        }
        return flag;
    }

    @Test
    public void checkAddition()
    {
        Assert.assertEquals(addition(12, 38), 40);
    }

    @Test
    public void checkAddition1()
    {
        Assert.assertNotEquals(addition(12, 38), 40);
    }

    @Test
    public  void checkEligibility()
    {
        Assert.assertTrue(eligibleToVote(25));
    }

    @Test
    public  void checkEligibility1()
    {
        Assert.assertFalse(eligibleToVote(25));
    }
}
