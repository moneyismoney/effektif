/* Copyright (c) 2014, Effektif GmbH.
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
package com.effektif.workflow.impl.exceptions;




/**
 * @author Tom Baeyens
 */
public class BadRequestException extends ResponsableException {

  private static final long serialVersionUID = 1L;

  public BadRequestException(String message) {
    super(message);
  }
  
  public BadRequestException(String message, Throwable t) {
    super(message, t);
  }

  @Override
  public int getStatusCode() {
    return 400;
  }

  public static void checkTrue(boolean condition, String message) {
    if (!condition) {
      throw new BadRequestException(message);
    }
  }

  public static void checkNotNull(Object object, String message) {
    checkTrue(object!=null, message);
  }
}
