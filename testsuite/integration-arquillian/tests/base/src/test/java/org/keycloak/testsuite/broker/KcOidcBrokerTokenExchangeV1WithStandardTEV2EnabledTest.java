/*
 * Copyright 2025 Red Hat, Inc. and/or its affiliates
 *  and other contributors as indicated by the @author tags.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.keycloak.testsuite.broker;

import org.keycloak.common.Profile;
import org.keycloak.testsuite.arquillian.annotation.EnableFeature;
import org.keycloak.testsuite.arquillian.annotation.EnableFeatures;

/**
 * Tests that federated token exchange works even if standard-token-exchange:v2 is enabled
 *
 * TODO: Remove this test once standard-token-exchange supported by default. It won't be needed as KcOidcBrokerTokenExchangeV1Test will have TE-v2 enabled by default
 *
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
@EnableFeatures({@EnableFeature(Profile.Feature.TOKEN_EXCHANGE), @EnableFeature(Profile.Feature.ADMIN_FINE_GRAINED_AUTHZ), @EnableFeature(Profile.Feature.TOKEN_EXCHANGE_STANDARD_V2)})
public class KcOidcBrokerTokenExchangeV1WithStandardTEV2EnabledTest extends KcOidcBrokerTokenExchangeTest {
}
