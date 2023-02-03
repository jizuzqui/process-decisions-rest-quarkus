/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
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
 */

package org.kie.kogito.traffic;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {

    @JsonProperty("id")
    private String id;

    @JsonProperty("Points")
    private Integer points;

    @JsonProperty("Age")
    private Integer age;

    private Date licenseExpiration;

    private Boolean validLicense = Boolean.FALSE;

    public Driver() {
    }

    public Driver(String id, Integer points, Date licenseExpiration) {
        this.id = id;
        this.points = points;
        this.licenseExpiration = licenseExpiration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Date getLicenseExpiration() {
        return licenseExpiration;
    }

    public void setLicenseExpiration(Date licenseExpiration) {
        this.licenseExpiration = licenseExpiration;
    }

    public Boolean isValidLicense() {
        return validLicense;
    }

    public Boolean getValidLicense() {
        return validLicense;
    }

    public void setValidLicense(Boolean validLicense) {
        this.validLicense = validLicense;
    }
}
