class FuncRef {
  def add(a: Int, b: Int) = a + b
  def bar(in: Seq[Int]): Int = in.foldLeft(0)(add)
}
