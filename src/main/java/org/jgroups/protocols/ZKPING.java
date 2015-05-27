/**
 *  Copyright 2005-2014 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.jgroups.protocols;

import org.jgroups.conf.ClassConfigurator;

import uk.co.trenddevs.zookeeper.jgroups.ConfigurableZooKeeperPing;
import uk.co.trenddevs.zookeeper.jgroups.Constants;

/**
 * A workaround "org.jgroups.protocols" prefix limitation.
 */
public class ZKPING extends ConfigurableZooKeeperPing {
    static {
        ClassConfigurator.addProtocol(Constants.WF_ZK_PING_ID, ZKPING.class);
    }
    
}