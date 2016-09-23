package com.mozilla.spark.sql.hyperloglog

import com.twitter.algebird.{HyperLogLog, HyperLogLogMonoid}
import org.apache.hadoop.hive.ql.exec.UDF


class HLLCardinality extends UDF {

  def evaluate(hll: Array[Byte]): Long = {
    HyperLogLog.fromBytes(hll).approximateSize.estimate;
  }
}
