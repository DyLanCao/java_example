//package c05;


//import com.bruceeckel.tools.Assert.*;
//import com.bruceeckel.tools.*;
//import com.bruceeckel.tools.Assert.*;
import com.bruceeckel.tools.HelloWorld.*;
import com.bruceeckel.tools.Assert.*;

public class TestAssert {
    public static void main(String[] args)
    {
        HelloWorld stu = new HelloWorld();
        stu.say();
        Assert.is_true((2 + 2) ==  5);
        Assert.is_false((1 + 1) ==  2);
        Assert.is_true((2 + 2) ==  5, "2 + 2 == 5");
        Assert.is_false((1 + 1) ==  2, "1 + 1 != 2");
    }
}
