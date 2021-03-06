/*
 *
 * Copyright 2018 Odysseus Data Services, inc.
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
 * Company: Odysseus Data Services, Inc.
 * Product Owner/Architecture: Gregory Klebanov
 * Authors: Pavel Grafkin, Vitaly Koulakov, Maria Pozhidaeva
 * Created: April 4, 2018
 *
 */

package com.odysseusinc.athena.api.v1.controller.dto;

import java.util.List;
import java.util.Map;
import org.springframework.data.domain.Pageable;

public class ConceptSearchResultDTO extends FacetedSearchResultDTO<ConceptDTO> {

    private String query;
    private String debug;

    public ConceptSearchResultDTO(List<ConceptDTO> content,
                                  Map<String, Map<String, Long>> facets,
                                  Pageable pageable,
                                  long total) {

        super(content, facets, pageable, total);
        this.debug = debug;
    }

    public String getQuery() {

        return query;
    }

    public void setQuery(String query) {

        this.query = query;
    }

    public String getDebug() {

        return debug;
    }

    public void setDebug(String debug) {

        this.debug = debug;
    }


}