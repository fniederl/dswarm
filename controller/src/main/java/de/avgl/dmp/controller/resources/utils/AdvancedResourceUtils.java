package de.avgl.dmp.controller.resources.utils;

import javax.inject.Provider;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import de.avgl.dmp.persistence.model.BasicDMPObject;
import de.avgl.dmp.persistence.service.AdvancedJPAService;

/**
 * @author tgaengler
 * @param <POJOCLASSPERSISTENCESERVICE>
 * @param <POJOCLASS>
 * @param <POJOCLASSIDTYPE>
 */
public abstract class AdvancedResourceUtils<POJOCLASSPERSISTENCESERVICE extends AdvancedJPAService<POJOCLASS>, POJOCLASS extends BasicDMPObject>
		extends BasicResourceUtils<POJOCLASSPERSISTENCESERVICE, POJOCLASS, String> {

	private static final org.apache.log4j.Logger	LOG	= org.apache.log4j.Logger.getLogger(AdvancedResourceUtils.class);

	public AdvancedResourceUtils(final Class<POJOCLASS> pojoClassArg, final Provider<POJOCLASSPERSISTENCESERVICE> persistenceServiceProviderArg,
			final Provider<ObjectMapper> objectMapperProviderArg, final ResourceUtilsFactory utilsFactory) {

		super(pojoClassArg, String.class, persistenceServiceProviderArg, objectMapperProviderArg, utilsFactory);
	}

	@Override
	protected ObjectNode replaceDummyId(final JsonNode idNode, final String dummyId, final String realId, final ObjectNode objectJSON) {

		if (idNode.isTextual()) {

			final String textId = idNode.asText();

			if (dummyId.equals(textId)) {

				// replace string id

				objectJSON.put("id", realId.toString());
			}
		}

		return objectJSON;
	}

}