class LocalLazy {
  private lazy val x = System.currentTimeMillis.toInt
  def baz(in: Seq[Int]): Int = x
}


