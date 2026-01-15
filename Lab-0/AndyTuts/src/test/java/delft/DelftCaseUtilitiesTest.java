package delft;

import static org.assertj.core.api.Assertions.*;
//import static org.junit.Assert.assertEquals;

import java.util.stream.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

//package delft;
//
//import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.*;
//import java.util.stream.*;
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.params.*;
//import org.junit.jupiter.params.provider.*;

public class DelftCaseUtilitiesTest {

    DelftCaseUtilities delftCaseUtilities = new DelftCaseUtilities();

    @Test
    public void test1(){
        Assertions.assertEquals("abc", delftCaseUtilities.toCamelCase("abc", false, ','));
        assertThat("abc");
    }

}
