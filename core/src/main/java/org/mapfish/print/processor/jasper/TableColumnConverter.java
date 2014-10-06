/*
 * Copyright (C) 2014  Camptocamp
 *
 * This file is part of MapFish Print
 *
 * MapFish Print is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MapFish Print is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MapFish Print.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mapfish.print.processor.jasper;

import org.mapfish.print.config.ConfigurationObject;
import org.springframework.http.client.ClientHttpRequestFactory;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Resolves a string to an image.
 *
 * @author Jesse on 6/30/2014.
 *
 * @param <R> The reulting type
 */
public interface TableColumnConverter<R> extends ConfigurationObject {
    /**
     * Resolve the image.
     *
     * @param requestFactory for fetching file and http resources.
     * @param text the text to use to resolve the image.
     */
    R resolve(ClientHttpRequestFactory requestFactory,
              String text) throws URISyntaxException, IOException;
}
