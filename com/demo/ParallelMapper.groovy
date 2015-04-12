
package com.demo

import groovy.transform.TupleConstructor
import com.demo.Operation

@TupleConstructor
class ParallelMapper {
  List<Operation> operations

  def map() {
    groovyx.gpars.GParsPool.withPool {
      operations.parallel.map { it.perform() }.collection
    }
  }
}

