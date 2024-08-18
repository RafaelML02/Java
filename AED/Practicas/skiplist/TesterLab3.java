
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2023/10/17 -- 23:46:7
// Seed: {1697,579165,863651}
//
//////////////////////////////////////////////////////////////////////



package aed.skiplist;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.EntryImpl;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.positionlist.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterLab3 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(50,60) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,5,1) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_01")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_01")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_02")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_03")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_04")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_05")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_06")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_07")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_08")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_09")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_10")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_11")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_12")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_13")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_14")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_15")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_16")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("si")).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("no")).doCall().checkResult(new String("si")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_17")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_18")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_19")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_20")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_21")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Sanchez")).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_22")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_23")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_24")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_25")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_26")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(new String("no")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(new String("si")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_27")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,15,new String("abc")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,20,new String("def")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,15).doCall().checkResult(new String("abc")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(new String("no")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,15).doCall().checkResult(new String("abc")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,20).doCall().checkResult(new String("def")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_28")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_29")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("abc")).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("def")).doCall().checkResult(new String("si")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("ghi")).doCall().checkResult(new String("no")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("abc")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("def")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("ghi")) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_30")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Albuixech")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Navarro")).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Fernandez")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_31")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_32")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,12,new String("Salut")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(new String("Privet")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("Salut")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("Hola")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("Namaste")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("Hej")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_33")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Bonet")).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Goicoechea")).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_34")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("Herrera")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_35")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Perez")).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Llorente")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(new String("Perez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_36")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Goicoechea")).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Prats")).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Navarro")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_37")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Garcia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Llorente")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Sanchez")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Benach")).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_38")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Goicoechea")).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_39")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Llorente")).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Garcia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Navarro")).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Ferrer")).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Marin")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(7) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_40")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Perez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Perez")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("Perez")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_41")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,6).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Benach")).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Bonet")).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Llorente")).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Fernandez")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_42")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_43")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Llorente")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Sanchez")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Benach")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Fernandez")).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Albuixech")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Bonet")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Perez")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_43")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_44 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_44")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Garcia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Gonzalez")).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Gonzalez")).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Marti")).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Martinez")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Rossello")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("Martinez")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Garcia")).doCall().checkResult(new String("Martinez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Navarro")).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Benach")).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Benach")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Garcia")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_44")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_45 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_45")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Castro")).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Sanchez")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Bonet")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Martinez")).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Herrera")).doCall().checkResult(new String("Martinez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(5) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(new String("Martinez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Goicoechea")).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(5) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Marin")).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,6).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_45")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_46 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_46")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Garcia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Albuixech")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Marti")).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Lopez")).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,6).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Sanchez")).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Fernandez")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Navarro")).doCall().checkResult(new String("Martinez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Benach")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Boix")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("Sanchez")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_46")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_47 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_47")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Rossello")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Lopez")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Llorente")).doCall().checkResult(new String("Boix")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Rodriguez")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Benach")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(new String("Martinez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Navarro")).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Boix")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Echeberria")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Echeberria")).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Rodriguez")).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Sanchez")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("Boix")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(new String("Boix")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Echeberria")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Ferrer")).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_47")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_48 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_48")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Castro")).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Marti")).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Goicoechea")).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Sanchez")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Navarro")).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Navarro")).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Marin")).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Rodriguez")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Rodriguez")).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_48")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_49 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_49")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Ferrer")).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(5) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(5) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Garcia")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Boix")).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("Boix")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Navarro")).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Lopez")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Albuixech")).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Ferrer")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Perez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Rossello")).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Marin")).doCall().checkResult(new String("Perez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Bonet")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Goicoechea")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Fernandez")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(5) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_49")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_50 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<SkipListMap<Integer,String>,Void> v_0 = null ;
SkipListMap<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_50")) ;
if (ok_sofar)
{
  v_0 = new Constructor(Integer.MIN_VALUE,Integer.MAX_VALUE).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(new String("Boix")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Garcia")).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Rodriguez")).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Alzaga")).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Lopez")).doCall().checkResult(new String("Boix")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("Boix")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Navarro")).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Castro")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Herrera")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("Garcia")).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("Boix")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Echeberria")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Fernandez")).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,0).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,6).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Marin")).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Bonet")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("Prats")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Llorente")).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Benach")).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Goicoechea")).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,0,new String("Gonzalez")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("Castro")).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("Benach")).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("Perez")).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("Bonet")).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,6).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  ok_sofar = new SkiplistOk(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("Prats")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_50")) ;
    ResultsHandler.add_result(new String("skiplistmap"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab3";
}


static class SkipListMapUtils {
  static HashMap<Object,String> mapNames = null;
  static Integer nameCounter = 0;

  public static void resetPrinter() {
    mapNames = null;
    nameCounter = 0;
  }

  public static String printer(Object obj) {
    if (obj instanceof Map<?,?>) {
      if (mapNames == null)
        mapNames = new HashMap<Object,String>();
      String name = mapNames.get(obj);
      if (name == null) {
        name = "map_"+nameCounter.toString();
        mapNames.put(obj,name);
        nameCounter++;
      }
      return name;
    } else return TestUtils.printer(obj, x -> printer(x));
  }

  public static Boolean skiplistOk(SkipListMap<Integer,String> m) {
    // First lets extract the list of lists
    PositionList<PositionList<Node<Integer,String>>> skipList = null;
    try {
      Field f;
      f = m.getClass().getDeclaredField("skipList");
      f.setAccessible(true);
      skipList = (PositionList<PositionList<Node<Integer,String>>>) f.get(m);
    } catch ( Throwable exc ) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "no puede acceder al campo skipList dentro SkipListMap");
      return false;
    }

    // Next determine where the bottom list is, if it exists
    boolean bottomIsLast = true;

    if (skipList == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "el atributo skipList es null\n");
      return false;
    }

    if (skipList.size() == 0) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "el atributo skipList es vacio\n");
      return false;
    }

    PositionList<Node<Integer,String>> first = null;
    PositionList<Node<Integer,String>> last = null;

    if (skipList.size() != 1) {
      first = skipList.first().element();
      last = skipList.last().element();
      if (first==null || last==null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "una lista dentro skipList es null"
           +"\nEl atributo skipList: \n"+printSkipList(skipList)
           );
        return false;
      }
      if (allNulls(skipList,first)) bottomIsLast=false;
    } else {
      first = skipList.first().element();
      last = skipList.last().element();
    }

    // We know where the bottom list is; check that it has all nulls
    boolean allNulls;
    
    if (bottomIsLast)
      allNulls = allNulls(skipList,last);
    else
      allNulls = allNulls(skipList,first);

    if (!allNulls) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "hay un Node<> dentro la lista al fondo de skipList que no tiene getBelow() == null"
         +"\nEl atributo skipList: \n"+printSkipList(skipList)
         );
      return false;
    }

    // Check that all sublists contain min as first element and max last element
    for (PositionList<Node<Integer,String>> sublist : skipList) {
      if (sublist == null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "una lista dentro skipList es null"
           +"\nEl atributo skipList: \n"+printSkipList(skipList)
           );
        return false;
      }

      boolean isOk = sublist.size() >= 2;
      if (isOk) {
        Node<Integer,String> firstNode = sublist.first().element();
        Node<Integer,String> lastNode = sublist.last().element();
        if ((firstNode == null) || (lastNode == null)) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "hay un Node<> dentro la lista al fondo de skipList que es null"
             +"\nEl atributo skipList: \n"+printSkipList(skipList)
             );
          return false;
        }
        Integer firstKey = firstNode.getKey();
        Integer lastKey = lastNode.getKey();
        if ((firstKey == null) || (lastKey == null)) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "Un Node<> dentro la lista al fondo de skipList tiene un null key"
             +"\nEl atributo skipList: \n"+printSkipList(skipList)
             );
          return false;
        }
        isOk = firstKey.equals(Integer.MIN_VALUE) && lastKey.equals(Integer.MAX_VALUE);
        if (!isOk) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "una lista dentro skipList no tiene min como primer elemento y max como ultimo elemento"
             +"\nEl atributo skipList: \n"+printSkipList(skipList)
             );
          return false;
          
        }
      }
    }
    
    // Now iterate over the lists, starting from the bottom list,
    // making sure that getBelow is linked correctly, and that keys are ordered correctly

    Position<PositionList<Node<Integer,String>>> prevList = null;
    Position<PositionList<Node<Integer,String>>> cursor = null;
    if (bottomIsLast) cursor = skipList.last();
    else cursor = skipList.first();

    while (cursor != null) {
      PositionList<Node<Integer,String>> list = cursor.element();
      if (list == null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "una lista dentro skipList es null"
           +"\nEl atributo skipList: \n"+printSkipList(skipList)
           );
        return false;
      }

      Integer prev = null;
      Position<Node<Integer,String>> nodeCursor = list.first();

      while (nodeCursor != null) {
        Node<Integer,String> node = nodeCursor.element();
        nodeCursor = list.next(nodeCursor);
        if (node == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "hay un Node<> que es null"
             +"\nEl atributo skipList: \n"+printSkipList(skipList)
             );
          return false;
        }
        Integer key = node.getKey();
        Position<Node<Integer,String>> below = node.getBelow();
        String value = node.getValue();
        
        if (key == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "Un Node<> tiene un null key"
             +"\nEl atributo skipList: \n"+printSkipList(skipList)
             );
          return false;
        }

        if ((below == null) && (prevList != null)) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "Un Node<> "+node+" no al fondo tiene getBelow() null"
             +"\nEl atributo skipList: \n"+printSkipList(skipList)
             );
          return false;
        }
        
        if (!key.equals(Integer.MIN_VALUE) && !key.equals(Integer.MAX_VALUE)) {
          if (value == null) {
            TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "Un Node<> "+node+" que no tiene la clave minima o maxima tiene getValue() null"
               +"\nEl atributo skipList: \n"+printSkipList(skipList)
               );
            return false;
          }
        }

        if (prevList != null && nodeCursor instanceof es.upm.aedlib.Node<?,?>) {
          es.upm.aedlib.Node<?,?> nn = (es.upm.aedlib.Node<?,?>) below;
          if (nn.owner() != prevList.element()) {
            TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "El Node<> "+node+" tiene un getBelow() que no refiere a un nodo en la lista debajo"+
               "\n la lista de getBelow() es "+nn.owner()+
               "\n pero la lista deberia ser "+prevList
               +"\nEl atributo skipList: \n"+printSkipList(skipList)
               );
            return false;
          }
        }

        if (below != null) {
          Node<Integer,String> nodeBelow = below.element();
          if (nodeBelow == null) {
            TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "Un Node<> "+node+" tiene un below pero != null pero below.element() == null"
               +"\nEl atributo skipList: \n"+printSkipList(skipList)
               );
            return false;
          }

          Integer nodeBelowKey = nodeBelow.getKey();
        
          if (nodeBelowKey == null) {
            TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "Un Node<> tiene un null key"
               +"\nEl atributo skipList: \n"+printSkipList(skipList)
               );
            return false;
          }

          if (!key.equals(nodeBelowKey)) {
            TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "Un Node<> tiene una clave "+key+" que es distinto a la clave en el nodo debajo "+
               nodeBelowKey
               +"\nEl atributo skipList: \n"+printSkipList(skipList)
               );
            return false;
          }
        }
      }

      prevList = cursor;
      if (bottomIsLast)
        cursor = skipList.prev(cursor);
      else
        cursor = skipList.next(cursor);
    }
    
    PositionList<Node<Integer,String>> bottom = null;
    if (bottomIsLast) bottom = skipList.last().element();
    else bottom = skipList.first().element();

    int numKeys = bottom.size()-2;
    if (numKeys >= 8) {
      // System.out.println("Checking keys...");
      checkHeuristics(numKeys,skipList);
    }

    return true;
  }

  private static void checkHeuristics(int numKeys, PositionList<PositionList<Node<Integer,String>>> skipList) {
    
    if (skipList.size() == 1) {
      TestUtils.printWarning
        (TestUtils.ExecutionTime.UNRELATED,
         " ADVERTENCIA: el numero de claves es "+numKeys+"; sin embargo solo hay una lista dentro el atributo skipList:\n"+printSkipList(skipList)+
         "\nPodria ser porque la clase esta mal implementada -- pero no es seguro.");
    } else {
      Integer minSize = null;
      Integer maxSize = null;
      for (PositionList<Node<Integer,String>> l : skipList) {
        int size = l.size();
        if (minSize == null || size<minSize)
          minSize = size;
        if (maxSize == null || size>maxSize)
          maxSize = size;
      }
      if (minSize == maxSize) {
        TestUtils.printWarning
          (TestUtils.ExecutionTime.UNRELATED,
           " ADVERTENCIA: todas las listas de skipList:\n"+
           "tiene el mismo nunero de claves "+minSize+
           ".\nPodria ser porque la clase esta mal implementada -- pero no es seguro.");
      } // else System.out.println("min="+minSize+" max="+maxSize);
    }
  }

  private static boolean allNulls(PositionList<PositionList<Node<Integer,String>>> skipList, PositionList<Node<Integer,String>> l) {
    for (Node<Integer,String> node : l) {
      if (node == null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "un node es null dentro una lista de skipList"
           +"\nEl atributo skipList: \n"+printSkipList(skipList)
           );
        throw new RuntimeException();
      }

      if (node.getBelow() != null) return false;
    }
    return true;
  }

  private static String printSkipList(PositionList<PositionList<Node<Integer,String>>> s) {
    StringBuffer sb = new StringBuffer();
    if (s == null) sb.append("null\n");
    else {
      sb.append("[");
      Position<PositionList<Node<Integer,String>>> cursor = s.first();
      while (cursor != null) {
        if (cursor != s.first()) sb.append(" ");
        PositionList<Node<Integer,String>> l = cursor.element();
        if (l == null) sb.append("null");
        else {
          sb.append("[");
          Position<Node<Integer,String>> nodeCursor = l.first();
          while (nodeCursor != null) {
            Node<Integer,String> node = nodeCursor.element();
            if (node == null) sb.append("null");
            else sb.append(node.toString());
            if (nodeCursor != l.last()) sb.append(", ");
            nodeCursor = l.next(nodeCursor);
          }
          sb.append("]");
        }
        if (cursor != s.last()) sb.append(",\n");
        cursor = s.next(cursor);
      }
    }
    sb.append("]");
    return sb.toString();
  }
}




























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";

    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  TestData.message("the call to "+msg+" raised the exception "+exc+
			     " although it should not have");
	  break;
      default:
	  TestData.message(" -- the exception "+exc+" was raised although it "+
			     "should not have been\n"+msg);
	  break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
      
    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
    }
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
				     TestResult<E,F> result,
				     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
	("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2)) 
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }
  
  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {
    
    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();
    
    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
	return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect(String callString, E[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
            (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input list "+TestUtils.print(original)+
	     "; it has now the elements "+TestUtils.print(l));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input array "+TestUtils.print(original)+
	       "; it has now the elements "+TestUtils.print(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;
    
    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
	(Integer) majorMethod.invoke(null);
      aedlibMinor = 
	(Integer) minorMethod.invoke(null);
      aedlibPatchlevel = 
	(Integer) patchlevelMethod.invoke(null);

      isOk =
	((aedlibMajor > major)
	 || ((aedlibMajor == major) &&
	     ((aedlibMinor > minor)
	      || ((aedlibMinor == minor) &&
		  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
	("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
	"*** ERROR: aedlib is too old. Minimum version needed is "+
	major+"."+minor+"."+patchlevel+"; your version is "+
	aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
	". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true; 	      
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }
  
  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
	return callString + "  =>  " + getException();
      else
	{
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));
    
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] original, Object[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] original, int[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] original, char[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);
    
    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }
    
    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.LAST,
	   "\nthe call to "+this+" returned null, "+
	   "but should have returned "+TestUtils.print(expected));
	return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
	 "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }      
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}


static class Constructor extends TestCall<SkipListMap<Integer,String>,Void>
{
  int x_1;
  int x_2;
  
  public Constructor (int x_1,int x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new SkipListMap<Integer,String>")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public SkipListMap<Integer,String> call () 
  {
    return new SkipListMap<Integer,String>(x_1,x_2) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class Get extends TestCall<String,String>
{
  SkipListMap<Integer,String> x_1;
  Integer x_2;
  
  public Get (SkipListMap<Integer,String> x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".get")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public String call () 
  {
    return x_1.get(x_2) ;
  }
  
  public boolean checkResult (String expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Put extends TestCall<String,String>
{
  SkipListMap<Integer,String> x_1;
  Integer x_2;
  String x_3;
  
  public Put (SkipListMap<Integer,String> x_1,Integer x_2,String x_3)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".put")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public String call () 
  {
    return x_1.put(x_2,x_3) ;
  }
  
  public boolean checkResult (String expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Size extends TestCall<Integer,Integer>
{
  SkipListMap<Integer,String> x_1;
  
  public Size (SkipListMap<Integer,String> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".size")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return x_1.size() ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Remove extends TestCall<String,String>
{
  SkipListMap<Integer,String> x_1;
  Integer x_2;
  
  public Remove (SkipListMap<Integer,String> x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".remove")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public String call () 
  {
    return x_1.remove(x_2) ;
  }
  
  public boolean checkResult (String expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class IsEmpty extends TestCall<Boolean,Boolean>
{
  SkipListMap<Integer,String> x_1;
  
  public IsEmpty (SkipListMap<Integer,String> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".isEmpty")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return x_1.isEmpty() ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class SkiplistOk extends TestCall<Boolean,Boolean>
{
  SkipListMap<Integer,String> x_1;
  
  public SkiplistOk (SkipListMap<Integer,String> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    return new String("") ;
  }
  
  public Boolean call () 
  {
    return SkipListMapUtils.skiplistOk(x_1) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    return silentCheckTrueResult() ;
  }
  
}







static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}









 
static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
    runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath) 
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);
 
    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) 
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }
 
    return sb.toString();
  }
  
}


static class TesterCode
{
  
  public static void resetPrinter () 
  {
    SkipListMapUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return SkipListMapUtils.printer(obj) ;
  }
  
}


}
