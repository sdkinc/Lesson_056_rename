public class Task7Rename {
/*
  Воспользовавшись разобранными на уроке задачами, напишите рекурсивный метод public static String
  reverse(int x), который будет возвращать строку, содержащую десятичные цифры числа в обратном
  порядке (развернёт число).
 */
  public static void main(String[] args) {
    String string = "nothing else matters";
    System.out.println(reverse(string));
    int testInt = 12345;
    System.out.println(reverse(testInt));
  }

  public static String reverse(String s) {
    if (s.length() < 2) {
      return s;
    }

    return reverse(s.substring(1)) + s.charAt(0);
  }

  /***
   *
   * @param x входное натуральное число
   * @return строка содержащая число х с развернутым порядком цифр.
   */
  public static String reverse(int x) {
    if (x < 10) {
      return String.valueOf(x);
    }
    return x % 10 + reverse(x / 10);
  }
}
