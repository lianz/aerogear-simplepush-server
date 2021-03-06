/**
 * JBoss, Home of Professional Open Source Copyright Red Hat, Inc., and individual contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.jboss.aerogear.simplepush.subsystem;

import org.jboss.aerogear.simplepush.server.datastore.DataStore;
import org.jboss.aerogear.simplepush.server.datastore.RedisDataStore;
import org.jboss.msc.service.StartContext;
import org.jboss.msc.service.StartException;

public class RedisDataStoreService extends DataStoreService {

    private final String host;
    private final int port;

    public RedisDataStoreService(final String host, final int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public synchronized void start(StartContext context) throws StartException {
    }

    @Override
    public synchronized DataStore getValue() throws IllegalStateException, IllegalArgumentException {
        return new RedisDataStore(host, port);
    }

}
