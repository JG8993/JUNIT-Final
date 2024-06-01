import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class canDriveTest {

  @Test
  public void test01_JustBeforeDrivingAge() {
    Assertions.assertFalse(Drive.canDrive(15), "Age just before driving age should return false");
  }

  @Test
  public void test02_DrivingAge() {
    Assertions.assertTrue(Drive.canDrive(16), "Driving age should return true");
  }

  @Test
  public void test03_JustAfterDrivingAge() {
    Assertions.assertTrue(Drive.canDrive(17), "Age just after driving age should return true");
  }

  @Test
  public void test04_SeniorAge() {
    Assertions.assertTrue(Drive.canDrive(70), "Senior age should return true");
  }

  @Test
  public void test05_MaximumReasonableAge() {
    Assertions.assertTrue(Drive.canDrive(120), "Maximum reasonable age should return true");
  }

  @Test
  public void test06_MinimumAge() {
    Assertions.assertFalse(Drive.canDrive(0), "Minimum age should return false");
  }

  @Test
  public void test07_MidAge() {
    Assertions.assertTrue(Drive.canDrive(35), "Middle-age allowed.");
  }

  @Test
  public void test08_VeryOldAge() {
    Assertions.assertTrue(Drive.canDrive(150),
        "Very old age is allowed.");
  }

  @Test
  public void test09_VeryYoungAge() {
    Assertions.assertFalse(Drive.canDrive(2), "Very young age not allowed.");
  }

  @Test
  public void test10_MaxIntegerValue() {
    Assertions.assertTrue(Drive.canDrive(Integer.MAX_VALUE),
        "Maximum integer value age is technically allowed.");
  }

  // Your code ends here
}
