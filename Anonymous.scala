class Anonymous {
  def bar(in: Seq[Int]): Int = in.foldLeft(0)(_ + _)
}
