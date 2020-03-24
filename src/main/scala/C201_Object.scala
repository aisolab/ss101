object C201_Object {
  def main (args: Array[String]) : Unit = {
    // 비교 연산자
    println(1 == 1)
    println('a' == 'a')
    println(1 == 'a')

    // 문자열 비교
    val s1 = "Hello"
    val s2 = "Hello"
    val s3 = "HELLO"

    // 객체비교
    case class Person(p1: String, p2: String) // 케이스 클래스 인스턴스를 생성할 때, new 를 사용하지 않는 클래스
    val p1 = Person("a", "b")
    val p2 = Person("a", "b")
    val p3 = Person("b", "c")

    println(p1 == p2)
    println(p2 == p3)
  }
}
