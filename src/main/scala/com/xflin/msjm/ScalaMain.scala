package com.xflin.msjm

object ScalaMain {
  def main(args: Array[String]) {
    println("ScalaMain starts")
    new JavaService().hello()
    println("ScalaMain ends")
  }
}
