packagecom.testannotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
importorg.testng.annotations.AfterClass;
importorg.testng.annotations.Test;
importorg.testng.annotations.BeforeClass;
importorg.testng.annotations.AfterClass;
importorg.testng.annotations.Test;
importorg.testng.annotations.BeforeClass;
import org.testng.annotations.*;
publicclass TestAnnotations {
@Test
publicvoid Test1() {
System.out.println("Test1 Executed");
}
@Test
publicvoid Test2() {
System.out.println("Test2 Executed");
}
@BeforeTest
publicvoid beforeTest() {
System.out.println("BeforeTest Executed");
}
@AfterTest
publicvoid AfterTest() {
System.out.println("AfterTest Executed");
}
@BeforeMethod
publicvoid beforeMethod() {
System.out.println("BeforeMethod Executed");
}
@AfterMethod
publicvoid afterMethod() {
System.out.println("AfterMethod Executed");
}
@BeforeClass
publicvoid beforeClass() {
System.out.println("BeforeClass Executed");
}
@AfterClass
publicvoid afterClass() {
System.out.println("AfterClass Executed");
}
}


