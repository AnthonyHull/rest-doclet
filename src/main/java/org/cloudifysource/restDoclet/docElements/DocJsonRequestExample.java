/*******************************************************************************
 * Copyright (c) 2012 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cloudifysource.restDoclet.docElements;

import java.io.IOException;

import org.cloudifysource.restDoclet.constants.RestDocConstants;
import org.cloudifysource.restDoclet.generation.Utils;

import com.sun.javadoc.AnnotationDesc;

/**
 *
 * @author yael
 *
 */
public class DocJsonRequestExample extends DocAnnotation {
	public DocJsonRequestExample(final AnnotationDesc annotationDesc) {
		super(annotationDesc);
	}

	public String getComments() {
		return getValue(RestDocConstants.JSON_REQUEST_EXAMPLE_COMMENTS).or("no comments").toString();
	}

	/**
	 *
	 * @return The request body in Json format.
	 * @throws IOException .
	 */
	public String generateJsonRequestBody() throws IOException {
		return Utils.getIndentJson(String.valueOf(RestDocConstants.JSON_REQUEST_EXAMPLE_REQUEST_PARAMS));
	}
}
