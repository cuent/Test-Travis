/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.marmotta.ldpath.model.tests.functions.text;

import org.apache.marmotta.ldpath.model.tests.functions.text.AbstractBinaryStringTest;

/**
 * Check if one string ends with the other.
 * @author Jakob Frank <jakob@apache.org>
 * @see String#endsWith(String)
 */
public class StringEndsWithTest<Node> extends AbstractBinaryStringTest<Node> {

    @Override
    public String getDescription() {
        return "Checks if the first string ends the second";
    }

    @Override
    protected boolean test(String first, String second) {
        return first != null && second != null && first.endsWith(second);
    }

    @Override
    public String getLocalName() {
        return "endsWith";
    }

}