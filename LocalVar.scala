class LocalVar {
  def baz(in: Seq[Int]): Int = {
    var x = System.currentTimeMillis.toInt
    in.foldLeft(0)(_ + _ + x)
  }
}
