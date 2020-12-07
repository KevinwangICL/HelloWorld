import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
    public void testSum(){
        int tsum = 345;
        sum_storage ts = new sum_storage(tsum);
        Assert.assertEquals(ts.getSs(),tsum);
    }
}
