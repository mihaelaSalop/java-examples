/*
 * Copyright 2017 MD Sayem Ahmed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codesod.example.core.book.java8lambda;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.Test;

/**
 * @author <a href="mailto:sayem64@gmail.com">MD Sayem Ahmed</a>
 */
public class Chapter3Test {

  @Test
  public void givenNull_whenSumArrayUsingReduce_thenExceptionThrown() {
    assertThatExceptionOfType(NullPointerException.class)
        .isThrownBy(() -> Chapter3.sumArrayUsingReduce(null));
  }

  @Test
  public void givenEmptyArray_whenSumArrayUsingReduce_thenZeroReturned() {
    int[] inputArray = {};

    int sum = Chapter3.sumArrayUsingReduce(inputArray);

    assertThat(sum).isZero();
  }

  @Test
  public void givenArrayWithOneElement_whenSumArrayUsingReduce_thenSumReturned() {
    int[] inputArray = {};

    int sum = Chapter3.sumArrayUsingReduce(inputArray);

    assertThat(sum).isZero();
  }

  @Test
  public void givenArrayWithMultipleElements_whenSumArrayUsingReduce_thenSumReturned() {
    int[] inputArray = {1, -2, 3, 4, 5};

    int sum = Chapter3.sumArrayUsingReduce(inputArray);

    assertThat(sum).isEqualTo(11);
  }
}
