
package com.demo

import com.demo.SimpleOperation
import com.demo.ParallelMapper

class Main {
  static void main(String... args) {
    List operations = [new SimpleOperation()]
    ParallelMapper parallelMapper = new ParallelMapper(operations)
    parallelMapper.map();
  }
}