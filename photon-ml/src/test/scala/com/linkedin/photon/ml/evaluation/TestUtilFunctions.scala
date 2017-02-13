/*
 * Copyright 2016 LinkedIn Corp. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.linkedin.photon.ml.evaluation

object TestUtilFunctions {
  protected[evaluation] def getScoreLabelAndWeights(
    scores: Array[Double],
    labels: Array[Double],
    weight: Double = 1.0): Array[(Double, Double, Double)] = {
    scores.zip(labels).map { case (score, label) => (score, label, weight) }
  }

  protected[evaluation] def zipWithIndex[T](arr: Iterable[T], startIndex: Int = 0): Array[(Long, T)] = {
    arr.zipWithIndex.map { case (t, idx) => ((idx + startIndex).toLong, t) }.toArray
  }
}
