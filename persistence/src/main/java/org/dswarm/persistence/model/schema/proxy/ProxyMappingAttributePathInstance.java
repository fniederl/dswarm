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
package org.dswarm.persistence.model.schema.proxy;

import javax.xml.bind.annotation.XmlRootElement;

import org.dswarm.persistence.model.proxy.RetrievalType;
import org.dswarm.persistence.model.schema.MappingAttributePathInstance;

/**
 * A proxy class for {@link MappingAttributePathInstance}s.
 * 
 * @author tgaengler
 */
@XmlRootElement
public class ProxyMappingAttributePathInstance extends ProxyAttributePathInstance<MappingAttributePathInstance> {

	/**
	 *
	 */
	private static final long	serialVersionUID	= 1L;

	/**
	 * Default constructor for handing over a freshly created mapping attribute path instance, i.e., no updated or already
	 * existing mapping attribute path instance.
	 * 
	 * @param mappingAttributePathInstanceArg a freshly created mapping attribute path instance
	 */
	public ProxyMappingAttributePathInstance(final MappingAttributePathInstance mappingAttributePathInstanceArg) {

		super(mappingAttributePathInstanceArg);
	}

	/**
	 * Creates a new proxy with the given real mapping attribute path instance and the type how the mapping attribute path
	 * instance was processed by the mapping attribute path instance persistence service, e.g., {@link RetrievalType.CREATED}.
	 * 
	 * @param mappingAttributePathInstanceArg a mapping attribute path instance that was processed by the mapping attribute path
	 *            instance persistence service
	 * @param typeArg the type how this mapping attribute path instance was processed by the mapping attribute path instance
	 *            persistence service
	 */
	public ProxyMappingAttributePathInstance(final MappingAttributePathInstance mappingAttributePathInstanceArg, final RetrievalType typeArg) {

		super(mappingAttributePathInstanceArg, typeArg);
	}
}
