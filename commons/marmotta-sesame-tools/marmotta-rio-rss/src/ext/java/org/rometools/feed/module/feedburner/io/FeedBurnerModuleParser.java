/*
 * Copyright 2010 Scandio GmbH.
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
 *
 */
package org.rometools.feed.module.feedburner.io;

import com.sun.syndication.feed.module.Module;
import com.sun.syndication.io.ModuleParser;

import org.jdom2.Element;
import org.jdom2.Namespace;

import org.rometools.feed.module.feedburner.FeedBurner;
import org.rometools.feed.module.feedburner.FeedBurnerImpl;


/**
 * ModuleParser implementation for the FeedBurner RSS extension.
 *
 * @version 1.0
 * @author Georg Schmidl <georg.schmidl@scandio.de>
 *
 */
public class FeedBurnerModuleParser implements ModuleParser {
    private static final Namespace NS = Namespace.getNamespace(FeedBurner.URI);

    public String getNamespaceUri() {
        return FeedBurner.URI;
    }

    public Module parse(Element element) {
        FeedBurnerImpl fbi = new FeedBurnerImpl();
        boolean returnObj = false;
        Element tag = element.getChild("awareness", FeedBurnerModuleParser.NS);

        if (tag != null) {
            fbi.setAwareness(tag.getText().trim());
            returnObj = true;
        }

        tag = element.getChild("origLink", FeedBurnerModuleParser.NS);

        if (tag != null) {
            fbi.setOrigLink(tag.getText().trim());
            returnObj = true;
        }

        tag = element.getChild("origEnclosureLink", FeedBurnerModuleParser.NS);

        if (tag != null) {
            fbi.setOrigEnclosureLink(tag.getText().trim());
            returnObj = true;
        }

        if (returnObj) {
            return fbi;
        }

        return null;
    }
}
