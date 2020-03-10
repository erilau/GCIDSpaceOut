package ui;

/**
 * @author Eric Lau, A01027727
 *
 */
public class StringSpacer {

  /**
   * This returns the first 3 char in the string
   * 
   * @param GCID
   * @return GCID(0,3)
   */
  public static String storeNumber(String GCID) {
    if (GCID != null) {
      return GCID.substring(0, 3);
    }
    return "Not a Valid String";
  }

  /**
   * This return the 3rd and 8th char in the string
   * 
   * @param GCID
   * @return
   */

  public static String datePart(String GCID) {
    if (GCID != null) {
      return GCID.substring(3, 8);
    }
    return "Not a Valid String";
  }

  /**
   * This returns the 9th and 11th char in string
   * 
   * @param GCID
   * @return
   */

  public static String transactionPart(String GCID) {
    if (GCID != null) {
      return GCID.substring(9, 11);
    }
    return "Not a Valid String";
  }

  /**
   * This returns the 11th and 15th char of the string
   * 
   * @param GCID
   * @return
   */

  public static String incidentPart(String GCID) {
    if (GCID != null) {
      return GCID.substring(11, 15);
    }
    return "Not a Valid String";
  }

}
