/*
 * Copyright (c) 2016-2019 VMware, Inc. All Rights Reserved.
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices
 * and license terms. Your use of these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package com.vmware.mangle.metric.reporter.common;

import java.util.Map;

/**
 *
 * @author dbhat
 */
public interface MetricReporter {
    public Boolean sendMetric(String metricName, double metricValue, Map<String, String> tags);

    Boolean validateMetric(String metricName, Object metricValue);
}
