/*
 * Copyright 2014 Effektif GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.effektif.workflow.impl.json;

import java.io.IOException;

import com.effektif.workflow.api.model.EmailId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;


/**
 * @author Tom Baeyens
 */
public class EmailIdDeserializer extends StdDeserializer<EmailId> {

  private static final long serialVersionUID = 1L;

  protected EmailIdDeserializer() {
    super(EmailId.class);
  }

  @Override
  public EmailId deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    String idString = jp.getText();
    if (idString!=null) {
      return new EmailId(idString);
    } else {
      return null;
    }
  }
}