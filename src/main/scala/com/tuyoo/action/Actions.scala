package com.tuyoo.action

import com.tuyoo.config.TYCONFIG

object Actions {

  def check(line: String, allEvent: Set[String]): Boolean = {
    val words = line.split("\t")
    val len = words.length
    if (len > 3) {
      words(2) match {
        case "1" => if (len == 26) allEvent.contains(words(10)) else false //coin  金流
        case "2" => if (len == 26) allEvent.contains(words(6)) else false //login 登录
        case "3" => if (len == 38) allEvent.contains(words(6)) else false //pay   充值
        case "4" => if (len == 47) allEvent.contains(words(6)) else false //game  游戏
        case _ => false
      }
    } else {
      false
    }
  }

}