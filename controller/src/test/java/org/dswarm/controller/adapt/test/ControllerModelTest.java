/**
 * Copyright (C) 2013 – 2016 SLUB Dresden & Avantgarde Labs GmbH (<code@dswarm.org>)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dswarm.controller.adapt.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.dswarm.converter.adapt.test.ModelTest;

/**
 * @author tgaengler
 */
public class ControllerModelTest extends ModelTest {

	private static final Logger log = LoggerFactory.getLogger(ControllerModelTest.class);

	//@Test
	public void rewriteSchemaJSON() throws Exception {

		rewriteSchemaJSON("schema.json");
	}

	//@Test
	public void rewriteProjectJSONs() throws Exception {

		rewriteProjectJSON("project_to_remove_mapping_from_with_dummy_IDs.json");
		rewriteProjectJSON("project.w.new.entities.onepersistentmappingattributepathinstance.json");
		rewriteProjectJSON("project.w.new.entities.json");
	}

	//@Test
	public void rewriteTaskJSONs() throws Exception {

		rewriteTaskJSON("task.csv.json");
		rewriteTaskJSON("task.json");
	}
}
