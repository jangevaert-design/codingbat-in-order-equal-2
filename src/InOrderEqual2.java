public class InOrderEqual2 {
  public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    return (a < b && b < c || equalOk && a <= b && b <= c);
  }
}
