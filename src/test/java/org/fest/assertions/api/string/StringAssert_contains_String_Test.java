/*
 * Created on Dec 24, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api.string;

import static org.mockito.Mockito.verify;

import org.fest.assertions.api.StringAssert;
import org.fest.assertions.api.StringAssertBaseTest;

/**
 * Tests for <code>{@link StringAssert#contains(String)}</code>.
 * 
 * @author Alex Ruiz
 */
public class StringAssert_contains_String_Test extends StringAssertBaseTest {

  @Override
  protected StringAssert invoke_api_method() {
    return assertions.contains("od");
  }

  @Override
  protected void verify_internal_effects() {
    verify(strings).assertContains(getInfo(assertions), getActual(assertions), "od");
  }
}
