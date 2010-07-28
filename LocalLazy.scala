class LocalLazy {
  def baz(in: Seq[Int]): Int = {
    lazy val x = System.currentTimeMillis.toInt
    in.foldLeft(0)(_ + _ + x)
  }
}


