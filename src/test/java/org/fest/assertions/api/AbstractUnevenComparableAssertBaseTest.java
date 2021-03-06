/*
 * Created on Jul 29, 2012
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
package org.fest.assertions.api;

import static org.mockito.Mockito.mock;

import org.fest.assertions.internal.Comparables;

/**
 * Base class to test the concrete methods of {@link AbstractUnevenComparableAssert} (using a dummy implementation).
 * 
 * @author Olivier Michallat
 */
public abstract class AbstractUnevenComparableAssertBaseTest extends BaseTestTemplate<ConcreteUnevenComparableAssert, Integer> {
  protected Comparables comparables;

  @Override
  protected ConcreteUnevenComparableAssert create_assertions() {
    return new ConcreteUnevenComparableAssert(8);
  }

  @Override
  protected void inject_internal_objects() {
    super.inject_internal_objects();
    comparables = mock(Comparables.class);
    assertions.comparables = comparables;
  }
}
