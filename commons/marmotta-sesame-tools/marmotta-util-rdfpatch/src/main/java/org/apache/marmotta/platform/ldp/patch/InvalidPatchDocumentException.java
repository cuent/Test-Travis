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
package org.apache.marmotta.platform.ldp.patch;

/**
 * Exception thrown if a PatchDocument (i.e. a List of {@link org.apache.marmotta.platform.ldp.patch.model.PatchLine}s)
 * cannot be evauated, e.g. because a wildcard ({@code R}) was never defined before.
 */
public class InvalidPatchDocumentException extends Exception {

    public InvalidPatchDocumentException() {
        super();
    }

    public InvalidPatchDocumentException(String message) {
        super(message);
    }

    public InvalidPatchDocumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPatchDocumentException(Throwable cause) {
        super(cause);
    }
}
