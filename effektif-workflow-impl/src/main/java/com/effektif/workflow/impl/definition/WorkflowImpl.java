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
package com.effektif.workflow.impl.definition;

import java.util.List;

import org.joda.time.LocalDateTime;

import com.effektif.workflow.api.query.WorkflowQuery;
import com.effektif.workflow.api.workflow.Workflow;


public class WorkflowImpl extends ScopeImpl {
  
  public List<ActivityImpl> startActivities;
  public String organizationId;
  public String name;
  public LocalDateTime deployTime;
  public String deployerId;
  public String processId;
  public Long version;

  public void validate(Workflow apiWorkflow, WorkflowValidator validator) {
    super.validate(apiWorkflow, null, validator);
    this.startActivities = validator.getStartActivities(this);
  }

  public String toString() {
    return id!=null ? id.toString() : Integer.toString(System.identityHashCode(this));
  }

  public boolean isIncluded(WorkflowQuery query) {
    return false;
  }
}
