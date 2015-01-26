/* Copyright 2014 Effektif GmbH.
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
 * limitations under the License. */
package com.effektif.adapter.test;

import com.effektif.adapter.ActivityAdapter;
import com.effektif.adapter.ActivityRequest;
import com.effektif.adapter.ActivityResponse;
import com.effektif.workflow.api.types.BindingType;
import com.effektif.workflow.api.types.ObjectField;
import com.effektif.workflow.api.types.TextType;
import com.effektif.workflow.impl.adapter.Descriptor;


public class HelloWorldAdapter implements ActivityAdapter {

  @Override
  public Descriptor getDescriptor() {
    return new Descriptor()
      .key("hello")
      .description("Say hello")
      .field(new ObjectField("greeting")
        .type(new BindingType(new TextType()))
        .label("The greeting"));
  }

  @Override
  public ActivityResponse execute(ActivityRequest activityRequest) {
//    String greeting = activityRequest.getValue("greeting");
    return null;
  }
}