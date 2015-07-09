/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.service.codepipeline.model;

/**
 * 
 */
public enum FailureType {

    JobFailed("JobFailed"),
    ConfigurationError("ConfigurationError"),
    PermissionError("PermissionError"),
    RevisionOutOfSync("RevisionOutOfSync"),
    RevisionUnavailable("RevisionUnavailable"),
    SystemUnavailable("SystemUnavailable");

    private String value;

    private FailureType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return FailureType corresponding to the value
     */
    public static FailureType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("JobFailed".equals(value)) {
            return JobFailed;
        } else if ("ConfigurationError".equals(value)) {
            return ConfigurationError;
        } else if ("PermissionError".equals(value)) {
            return PermissionError;
        } else if ("RevisionOutOfSync".equals(value)) {
            return RevisionOutOfSync;
        } else if ("RevisionUnavailable".equals(value)) {
            return RevisionUnavailable;
        } else if ("SystemUnavailable".equals(value)) {
            return SystemUnavailable;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}