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

import java.text.SimpleDateFormat;

import javax.swing.text.DateFormatter;

import org.junit.Test;

/**
 * @author <a href="mailto:sayem64@gmail.com">MD Sayem Ahmed</a>
 */
public class Chapter2 {

  @Test
  public void answerForQuestion2() {
    ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));
  }
}
