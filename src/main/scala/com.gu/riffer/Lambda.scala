package com.gu.riffer

import com.typesafe.scalalogging.LazyLogging

class Lambda extends LazyLogging {
  def handler(): String = {
    "hello world"
  }
}
