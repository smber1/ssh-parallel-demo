
package com.demo

import com.demo.DoubleOperation
import com.demo.ParallelMapper

class Main {
  static void main(String... args) {
    def operations = [new DoubleOperation(1), new DoubleOperation(2), new DoubleOperation(3)]
    ParallelMapper parallelMapper = new ParallelMapper(operations)
    println parallelMapper.map();
  }
}