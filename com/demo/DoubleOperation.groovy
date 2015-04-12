
package com.demo

import groovy.transform.TupleConstructor
import com.demo.Operation

@TupleConstructor
class DoubleOperation implements Operation {
  int baseValue

  def perform() {
    baseValue * 2
  }
}