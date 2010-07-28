class LocalVal {
  def baz(in: Seq[Int]): Int = {
    val x = System.currentTimeMillis.toInt
    in.foldLeft(0)(_ + _ + x)
  }
}
